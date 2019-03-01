package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdTitle extends js.Object {
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: java.lang.String
  /**
    * The video categorys title.
    */
  var title: java.lang.String
}

object Anon_ChannelIdTitle {
  @scala.inline
  def apply(channelId: java.lang.String, title: java.lang.String): Anon_ChannelIdTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channelId")(channelId)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ChannelIdTitle]
  }
}

