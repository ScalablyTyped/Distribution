package typings
package dialogflowLib.dialogflowMod.entitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var amount: scala.Double
  var unit: java.lang.String
}

object Duration {
  @scala.inline
  def apply(amount: scala.Double, unit: java.lang.String): Duration = {
    val __obj = js.Dynamic.literal(amount = amount, unit = unit)
  
    __obj.asInstanceOf[Duration]
  }
}

