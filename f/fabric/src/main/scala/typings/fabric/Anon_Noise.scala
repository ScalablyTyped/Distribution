package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Noise extends js.Object {
  /** @default 0 */
  var noise: Double
}

object Anon_Noise {
  @scala.inline
  def apply(noise: Double): Anon_Noise = {
    val __obj = js.Dynamic.literal(noise = noise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Noise]
  }
}

