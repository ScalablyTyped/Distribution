package typings.ejDotWebDotAll.ejNs.PdfViewerNs

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
  sealed trait Highlight extends AnnotationType
  
  ///Specifies the strikethrough annotation.
  @js.native
  sealed trait Strikethrough extends AnnotationType
  
  ///Specifies the underline annotation.
  @js.native
  sealed trait Underline extends AnnotationType
  
  /* 2 */ val Highlight: typings.ejDotWebDotAll.ejNs.PdfViewerNs.AnnotationType.Highlight with Double = js.native
  /* 1 */ val Strikethrough: typings.ejDotWebDotAll.ejNs.PdfViewerNs.AnnotationType.Strikethrough with Double = js.native
  /* 0 */ val Underline: typings.ejDotWebDotAll.ejNs.PdfViewerNs.AnnotationType.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnnotationType with Double] = js.native
}

