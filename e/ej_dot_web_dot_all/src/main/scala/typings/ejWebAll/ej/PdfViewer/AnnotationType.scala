package typings.ejWebAll.ej.PdfViewer

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
  
}

