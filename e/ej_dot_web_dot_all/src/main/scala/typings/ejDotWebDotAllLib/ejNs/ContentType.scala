package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait ImageBoth
    extends ejDotWebDotAllLib.ejNs.ContentType
  
  //To display the image only in button
  @js.native
  sealed trait ImageOnly
    extends ejDotWebDotAllLib.ejNs.ContentType
  
  //Supports to display  image with both ends of the text
  @js.native
  sealed trait ImageTextImage
    extends ejDotWebDotAllLib.ejNs.ContentType
  
  //Supports to display image with the text content
  @js.native
  sealed trait TextAndImage
    extends ejDotWebDotAllLib.ejNs.ContentType
  
  //To display the text content only in button
  @js.native
  sealed trait TextOnly
    extends ejDotWebDotAllLib.ejNs.ContentType
  
  val ImageBoth: ImageBoth with java.lang.String = js.native
  val ImageOnly: ImageOnly with java.lang.String = js.native
  val ImageTextImage: ImageTextImage with java.lang.String = js.native
  val TextAndImage: TextAndImage with java.lang.String = js.native
  val TextOnly: TextOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ContentType with java.lang.String] = js.native
}

