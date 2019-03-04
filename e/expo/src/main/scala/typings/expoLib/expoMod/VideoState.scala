package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoState extends js.Object {
  var showPoster: scala.Boolean
}

object VideoState {
  @scala.inline
  def apply(showPoster: scala.Boolean): VideoState = {
    val __obj = js.Dynamic.literal(showPoster = showPoster)
  
    __obj.asInstanceOf[VideoState]
  }
}

