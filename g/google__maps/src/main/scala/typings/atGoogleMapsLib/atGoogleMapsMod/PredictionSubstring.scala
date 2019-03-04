package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionSubstring extends js.Object {
  /** length of the entered term. */
  var length: scala.Double
  /** location of the entered term. */
  var offset: scala.Double
}

object PredictionSubstring {
  @scala.inline
  def apply(length: scala.Double, offset: scala.Double): PredictionSubstring = {
    val __obj = js.Dynamic.literal(length = length, offset = offset)
  
    __obj.asInstanceOf[PredictionSubstring]
  }
}

