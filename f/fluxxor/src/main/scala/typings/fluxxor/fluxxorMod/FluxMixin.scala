package typings.fluxxor.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxMixin extends js.Object {
  def getFlux(): Flux
}

object FluxMixin {
  @scala.inline
  def apply(getFlux: () => Flux): FluxMixin = {
    val __obj = js.Dynamic.literal(getFlux = js.Any.fromFunction0(getFlux))
  
    __obj.asInstanceOf[FluxMixin]
  }
}

