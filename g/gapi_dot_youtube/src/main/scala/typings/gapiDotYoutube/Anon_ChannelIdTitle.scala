package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdTitle extends js.Object {
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: String
  /**
    * The video categorys title.
    */
  var title: String
}

object Anon_ChannelIdTitle {
  @scala.inline
  def apply(channelId: String, title: String): Anon_ChannelIdTitle = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChannelIdTitle]
  }
}

