package typings
package ejsonLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  var keyOrderSensitive: scala.Boolean
}

object CloneOptions {
  @scala.inline
  def apply(keyOrderSensitive: scala.Boolean): CloneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyOrderSensitive")(keyOrderSensitive)
    __obj.asInstanceOf[CloneOptions]
  }
}

