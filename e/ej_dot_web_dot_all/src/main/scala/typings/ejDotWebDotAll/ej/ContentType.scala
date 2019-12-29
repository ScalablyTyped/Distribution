package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSGlobal("ej.ContentType")
@js.native
object ContentType extends js.Object {
  //Supports to display  image for both ends of the button
  @js.native
  sealed trait ImageBoth extends ContentType
  
  //To display the image only in button
  @js.native
  sealed trait ImageOnly extends ContentType
  
  //Supports to display  image with both ends of the text
  @js.native
  sealed trait ImageTextImage extends ContentType
  
  //Supports to display image with the text content
  @js.native
  sealed trait TextAndImage extends ContentType
  
  //To display the text content only in button
  @js.native
  sealed trait TextOnly extends ContentType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  /* 2 */ @js.native
  object ImageBoth extends TopLevel[ImageBoth with Double]
  
  /* 1 */ @js.native
  object ImageOnly extends TopLevel[ImageOnly with Double]
  
  /* 4 */ @js.native
  object ImageTextImage extends TopLevel[ImageTextImage with Double]
  
  /* 3 */ @js.native
  object TextAndImage extends TopLevel[TextAndImage with Double]
  
  /* 0 */ @js.native
  object TextOnly extends TopLevel[TextOnly with Double]
  
}

