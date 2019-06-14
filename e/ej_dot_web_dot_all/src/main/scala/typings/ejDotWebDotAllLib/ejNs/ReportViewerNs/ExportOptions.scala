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
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 3 */ val Excel: Excel with scala.Double = js.native
  /* 4 */ val HTML: HTML with scala.Double = js.native
  /* 1 */ val PDF: PDF with scala.Double = js.native
  /* 2 */ val Word: Word with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.ExportOptions with scala.Double] = js.native
}

