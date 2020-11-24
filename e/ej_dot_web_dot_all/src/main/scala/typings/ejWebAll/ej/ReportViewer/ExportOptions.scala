package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExportOptions extends js.Object
@JSGlobal("ej.ReportViewer.ExportOptions")
@js.native
object ExportOptions extends js.Object {
  
  ///Specifies the All property in ExportOptions to get all available options.
  @js.native
  sealed trait All extends ExportOptions
  
  ///Specifies the CSV property in ExportOptions to get CSV option.
  @js.native
  sealed trait CSV extends ExportOptions
  
  ///Specifies the customItems property in ExportOptions to get customItems option.
  @js.native
  sealed trait CustomItems extends ExportOptions
  
  ///Specifies the Excel property in ExportOptions to get Excel option.
  @js.native
  sealed trait Excel extends ExportOptions
  
  ///Specifies the Html property in ExportOptions to get Html option.
  @js.native
  sealed trait Html extends ExportOptions
  
  ///Specifies the PPT property in ExportOptions to get PPT option.
  @js.native
  sealed trait PPT extends ExportOptions
  
  ///Specifies the Pdf property in ExportOptions to get Pdf option.
  @js.native
  sealed trait Pdf extends ExportOptions
  
  ///Specifies the Word property in ExportOptions to get Word option.
  @js.native
  sealed trait Word extends ExportOptions
}
