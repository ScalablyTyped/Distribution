package typings.expo.aRMod

import typings.expo.aRMod.AnchorType.Image
import typings.expo.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type  :expo.expo/build/AR.AnchorType.Image,   image ? :{  name  :string | null,   size  :expo.expo/build/AR.Size}} */
trait ImageAnchor extends Anchor {
  var id: String
  var image: js.UndefOr[Name] = js.undefined
  var transform: Matrix
  var `type`: AnchorType with Image
}

object ImageAnchor {
  @scala.inline
  def apply(id: String, transform: Matrix, `type`: AnchorType with Image, image: Name = null): ImageAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnchor]
  }
}

