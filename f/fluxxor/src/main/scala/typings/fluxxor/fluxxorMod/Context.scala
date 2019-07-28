package typings.fluxxor.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var flux: Flux
}

object Context {
  @scala.inline
  def apply(flux: Flux): Context = {
    val __obj = js.Dynamic.literal(flux = flux)
  
    __obj.asInstanceOf[Context]
  }
}

