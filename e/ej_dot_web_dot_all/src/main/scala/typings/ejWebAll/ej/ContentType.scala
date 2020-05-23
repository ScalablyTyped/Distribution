package typings.ejWebAll.ej

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
  
}

