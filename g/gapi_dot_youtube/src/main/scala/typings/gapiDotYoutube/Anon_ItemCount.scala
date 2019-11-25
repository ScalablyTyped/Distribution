package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemCount extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: Double
}

object Anon_ItemCount {
  @scala.inline
  def apply(itemCount: Double): Anon_ItemCount = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemCount]
  }
}

