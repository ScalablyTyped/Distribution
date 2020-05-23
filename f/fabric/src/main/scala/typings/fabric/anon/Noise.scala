package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  /** @default 0 */
  var noise: Double
}

object Noise {
  @scala.inline
  def apply(noise: Double): Noise = {
    val __obj = js.Dynamic.literal(noise = noise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noise]
  }
}

