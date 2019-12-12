package typings.ejDotWebDotAll.ej.PdfViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PdfViewer.LinkTarget.Default
import typings.ejDotWebDotAll.ej.PdfViewer.LinkTarget.NewTab
import typings.ejDotWebDotAll.ej.PdfViewer.LinkTarget.NewWindow
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkTarget with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object NewTab extends TopLevel[NewTab with Double]
  
  /* 2 */ @js.native
  object NewWindow extends TopLevel[NewWindow with Double]
  
}

