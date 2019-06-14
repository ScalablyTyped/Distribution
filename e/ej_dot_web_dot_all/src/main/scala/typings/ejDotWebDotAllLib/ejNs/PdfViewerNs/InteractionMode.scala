package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractionMode extends js.Object

@JSGlobal("ej.PdfViewer.InteractionMode")
@js.native
object InteractionMode extends js.Object {
  ///To set the panning mode to the PDF viewer control.
  @js.native
  sealed trait Pan
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.InteractionMode
  
  ///To set the text selection mode to the PDF viewer control.
  @js.native
  sealed trait TextSelection
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.InteractionMode
  
  /* 1 */ val Pan: Pan with scala.Double = js.native
  /* 0 */ val TextSelection: TextSelection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.InteractionMode with scala.Double] = js.native
}

