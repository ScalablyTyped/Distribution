package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionSubstring extends js.Object {
  /** length of the entered term. */
  var length: Double
  /** location of the entered term. */
  var offset: Double
}

object PredictionSubstring {
  @scala.inline
  def apply(length: Double, offset: Double): PredictionSubstring = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PredictionSubstring]
  }
}

