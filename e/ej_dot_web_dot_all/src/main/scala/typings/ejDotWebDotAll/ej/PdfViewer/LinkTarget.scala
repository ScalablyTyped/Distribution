package typings.ejDotWebDotAll.ej.PdfViewer

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
  sealed trait Default extends LinkTarget
  
  ///Opens the hyperlink in a new tab of the browser.
  @js.native
  sealed trait NewTab extends LinkTarget
  
  ///Opens the hyperlink in a new window of the browser.
  @js.native
  sealed trait NewWindow extends LinkTarget
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ej.PdfViewer.LinkTarget.Default with Double = js.native
  /* 1 */ val NewTab: typings.ejDotWebDotAll.ej.PdfViewer.LinkTarget.NewTab with Double = js.native
  /* 2 */ val NewWindow: typings.ejDotWebDotAll.ej.PdfViewer.LinkTarget.NewWindow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkTarget with Double] = js.native
}

