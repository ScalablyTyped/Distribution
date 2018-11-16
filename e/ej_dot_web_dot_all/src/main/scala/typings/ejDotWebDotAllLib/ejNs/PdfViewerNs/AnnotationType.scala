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
  
  val Highlight: Highlight with java.lang.String = js.native
  val Strikethrough: Strikethrough with java.lang.String = js.native
  val Underline: Underline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.AnnotationType with java.lang.String] = js.native
}

