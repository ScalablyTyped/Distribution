package typings
package fluxxorLib.fluxxorMod.FluxxorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxChildMixin extends js.Object {
  def getFlux(): Flux
}

object FluxChildMixin {
  @scala.inline
  def apply(getFlux: js.Function0[Flux]): FluxChildMixin = {
    val __obj = js.Dynamic.literal(getFlux = getFlux)
  
    __obj.asInstanceOf[FluxChildMixin]
  }
}

