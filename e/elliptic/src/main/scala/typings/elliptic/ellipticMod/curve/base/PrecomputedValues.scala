package typings.elliptic.ellipticMod.curve.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecomputedValues extends js.Object {
   // ?
  var beta: js.Any
  var doubles: js.Any
   // ?
  var naf: js.Any
}

object PrecomputedValues {
  @scala.inline
  def apply(beta: js.Any, doubles: js.Any, naf: js.Any): PrecomputedValues = {
    val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], doubles = doubles.asInstanceOf[js.Any], naf = naf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrecomputedValues]
  }
}

