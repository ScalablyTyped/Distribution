package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoState extends js.Object {
  var showPoster: Boolean
}

object VideoState {
  @scala.inline
  def apply(showPoster: Boolean): VideoState = {
    val __obj = js.Dynamic.literal(showPoster = showPoster)
  
    __obj.asInstanceOf[VideoState]
  }
}

