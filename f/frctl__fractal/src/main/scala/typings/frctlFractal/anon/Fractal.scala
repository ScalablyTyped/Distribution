package typings.frctlFractal.anon

import typings.frctlFractal.mod.Fractal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fractal extends js.Object {
  var fractal: Fractal_ = js.native
}

object Fractal {
  @scala.inline
  def apply(fractal: Fractal_): Fractal = {
    val __obj = js.Dynamic.literal(fractal = fractal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fractal]
  }
  @scala.inline
  implicit class FractalOps[Self <: Fractal] (val x: Self) extends AnyVal {
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
    def setFractal(value: Fractal_): Self = this.set("fractal", value.asInstanceOf[js.Any])
  }
  
}

