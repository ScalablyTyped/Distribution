package typings.dialogflowFulfillment

import typings.dialogflowFulfillment.mod.Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageUrl extends js.Object {
  var imageUrl: String
  var platform: Platforms
}

object AnonImageUrl {
  @scala.inline
  def apply(imageUrl: String, platform: Platforms): AnonImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImageUrl]
  }
}

