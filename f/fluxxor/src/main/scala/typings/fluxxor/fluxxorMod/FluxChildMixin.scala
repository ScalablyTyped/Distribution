package typings.fluxxor.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxChildMixin extends js.Object {
  def getFlux(): Flux
}

object FluxChildMixin {
  @scala.inline
  def apply(getFlux: () => Flux): FluxChildMixin = {
    val __obj = js.Dynamic.literal(getFlux = js.Any.fromFunction0(getFlux))
  
    __obj.asInstanceOf[FluxChildMixin]
  }
}

