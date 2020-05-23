package typings.dialogflowFulfillment.anon

import typings.dialogflowFulfillment.mod.Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageUrl extends js.Object {
  var imageUrl: String
  var platform: Platforms
}

object ImageUrl {
  @scala.inline
  def apply(imageUrl: String, platform: Platforms): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
}

