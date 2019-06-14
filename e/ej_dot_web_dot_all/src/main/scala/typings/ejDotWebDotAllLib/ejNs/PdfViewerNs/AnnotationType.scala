package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnnotationType extends js.Object

@JSGlobal("ej.PdfViewer.AnnotationType")
@js.native
object AnnotationType extends js.Object {
  ///Specifies the highlight annotation.
  @js.native
  sealed trait Highlight
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.AnnotationType
  
  ///Specifies the strikethrough annotation.
  @js.native
  sealed trait Strikethrough
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.AnnotationType
  
  ///Specifies the underline annotation.
  @js.native
  sealed trait Underline
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.AnnotationType
  
  /* 2 */ val Highlight: Highlight with scala.Double = js.native
  /* 1 */ val Strikethrough: Strikethrough with scala.Double = js.native
  /* 0 */ val Underline: Underline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.AnnotationType with scala.Double] = js.native
}

