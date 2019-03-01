package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemCount extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: scala.Double
}

object Anon_ItemCount {
  @scala.inline
  def apply(itemCount: scala.Double): Anon_ItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemCount")(itemCount)
    __obj.asInstanceOf[Anon_ItemCount]
  }
}

