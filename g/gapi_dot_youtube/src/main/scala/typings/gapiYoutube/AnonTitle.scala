package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: String
  /**
    * The video categorys title.
    */
  var title: String
}

object AnonTitle {
  @scala.inline
  def apply(channelId: String, title: String): AnonTitle = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

