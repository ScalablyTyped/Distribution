package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemCount extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: Double
}

object AnonItemCount {
  @scala.inline
  def apply(itemCount: Double): AnonItemCount = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemCount]
  }
}

