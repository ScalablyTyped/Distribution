package typings.expo

import typings.expo.buildARMod.AnchorType.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[Anon_Name] = js.undefined
  var `type`: Image
}

object Anon_Image {
  @scala.inline
  def apply(`type`: Image, image: Anon_Name = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Image]
  }
}

