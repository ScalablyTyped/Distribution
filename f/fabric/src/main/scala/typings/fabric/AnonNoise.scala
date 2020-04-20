package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoise extends js.Object {
  /** @default 0 */
  var noise: Double
}

object AnonNoise {
  @scala.inline
  def apply(noise: Double): AnonNoise = {
    val __obj = js.Dynamic.literal(noise = noise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoise]
  }
}

