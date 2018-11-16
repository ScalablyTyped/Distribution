package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

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
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions
  
  ///Specifies the Excel property in ExportOptions to get Excel option.
  @js.native
  sealed trait Excel
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions
  
  ///Specifies the HTML property in ExportOptions to get HTML option.
  @js.native
  sealed trait HTML
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions
  
  ///Specifies the PDF property in ExportOptions to get PDF option.
  @js.native
  sealed trait PDF
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions
  
  ///Specifies the Word property in ExportOptions to get Word option.
  @js.native
  sealed trait Word
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions
  
  val All: All with java.lang.String = js.native
  val Excel: Excel with java.lang.String = js.native
  val HTML: HTML with java.lang.String = js.native
  val PDF: PDF with java.lang.String = js.native
  val Word: Word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions with java.lang.String] = js.native
}

