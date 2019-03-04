package typings
package fluxxorLib.fluxxorMod.FluxxorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxMixin extends js.Object {
  def getFlux(): Flux
}

object FluxMixin {
  @scala.inline
  def apply(getFlux: js.Function0[Flux]): FluxMixin = {
    val __obj = js.Dynamic.literal(getFlux = getFlux)
  
    __obj.asInstanceOf[FluxMixin]
  }
}

