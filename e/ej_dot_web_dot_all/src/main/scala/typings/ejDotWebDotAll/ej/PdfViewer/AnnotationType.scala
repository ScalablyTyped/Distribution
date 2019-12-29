package typings.ejDotWebDotAll.ej.PdfViewer

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnnotationType with Double] = js.native
  /* 2 */ @js.native
  object Highlight extends TopLevel[Highlight with Double]
  
  /* 1 */ @js.native
  object Strikethrough extends TopLevel[Strikethrough with Double]
  
  /* 0 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
}

