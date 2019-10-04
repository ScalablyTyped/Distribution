package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val All: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.All with Double = js.native
  /* 6 */ val CSV: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.CSV with Double = js.native
  /* 7 */ val CustomItems: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.CustomItems with Double = js.native
  /* 3 */ val Excel: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.Excel with Double = js.native
  /* 4 */ val Html: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.Html with Double = js.native
  /* 5 */ val PPT: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.PPT with Double = js.native
  /* 1 */ val Pdf: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.Pdf with Double = js.native
  /* 2 */ val Word: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ExportOptions.Word with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportOptions with Double] = js.native
}

