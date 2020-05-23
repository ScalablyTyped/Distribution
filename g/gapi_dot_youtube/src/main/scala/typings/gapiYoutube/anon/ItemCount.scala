package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemCount extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: Double
}

object ItemCount {
  @scala.inline
  def apply(itemCount: Double): ItemCount = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCount]
  }
}

