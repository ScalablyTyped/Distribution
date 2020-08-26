package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Noise extends js.Object {
  /** @default 0 */
  var noise: Double = js.native
}

object Noise {
  @scala.inline
  def apply(noise: Double): Noise = {
    val __obj = js.Dynamic.literal(noise = noise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noise]
  }
  @scala.inline
  implicit class NoiseOps[Self <: Noise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNoise(value: Double): Self = this.set("noise", value.asInstanceOf[js.Any])
  }
  
}

