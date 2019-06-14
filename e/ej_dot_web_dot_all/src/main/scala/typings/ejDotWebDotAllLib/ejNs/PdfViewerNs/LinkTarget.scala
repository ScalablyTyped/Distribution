package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkTarget extends js.Object

@JSGlobal("ej.PdfViewer.LinkTarget")
@js.native
object LinkTarget extends js.Object {
  ///Opens the hyperlink in the same tab of the browser.
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.LinkTarget
  
  ///Opens the hyperlink in a new tab of the browser.
  @js.native
  sealed trait NewTab
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.LinkTarget
  
  ///Opens the hyperlink in a new window of the browser.
  @js.native
  sealed trait NewWindow
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.LinkTarget
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val NewTab: NewTab with scala.Double = js.native
  /* 2 */ val NewWindow: NewWindow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.LinkTarget with scala.Double] = js.native
}

