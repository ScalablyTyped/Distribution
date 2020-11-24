package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExcelFormats extends js.Object
@JSGlobal("ej.ReportViewer.ExcelFormats")
@js.native
object ExcelFormats extends js.Object {
  
  ///Specifies the Excel2007 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2007 extends ExcelFormats
  
  ///Specifies the Excel2010 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2010 extends ExcelFormats
  
  ///Specifies the Excel2013 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2013 extends ExcelFormats
  
  ///Specifies the Excel97to2003 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel97to2003 extends ExcelFormats
}
