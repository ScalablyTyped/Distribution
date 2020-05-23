package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: String
  /**
    * The video categorys title.
    */
  var title: String
}

object Title {
  @scala.inline
  def apply(channelId: String, title: String): Title = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

