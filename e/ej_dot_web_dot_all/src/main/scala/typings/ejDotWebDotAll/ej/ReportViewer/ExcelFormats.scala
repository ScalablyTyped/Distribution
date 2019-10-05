package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val Excel2007: typings.ejDotWebDotAll.ej.ReportViewer.ExcelFormats.Excel2007 with Double = js.native
  /* 2 */ val Excel2010: typings.ejDotWebDotAll.ej.ReportViewer.ExcelFormats.Excel2010 with Double = js.native
  /* 3 */ val Excel2013: typings.ejDotWebDotAll.ej.ReportViewer.ExcelFormats.Excel2013 with Double = js.native
  /* 0 */ val Excel97to2003: typings.ejDotWebDotAll.ej.ReportViewer.ExcelFormats.Excel97to2003 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExcelFormats with Double] = js.native
}

