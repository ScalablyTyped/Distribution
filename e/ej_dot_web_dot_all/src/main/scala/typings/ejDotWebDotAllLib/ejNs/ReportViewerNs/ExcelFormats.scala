package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

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
  sealed trait Excel2007
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExcelFormats
  
  ///Specifies the Excel2010 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2010
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExcelFormats
  
  ///Specifies the Excel2013 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel2013
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExcelFormats
  
  ///Specifies the Excel97to2003 property in ExcelFormats to get specified version of exported format.
  @js.native
  sealed trait Excel97to2003
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExcelFormats
  
  val Excel2007: Excel2007 with java.lang.String = js.native
  val Excel2010: Excel2010 with java.lang.String = js.native
  val Excel2013: Excel2013 with java.lang.String = js.native
  val Excel97to2003: Excel97to2003 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.ExcelFormats with java.lang.String] = js.native
}

