package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupMethod extends js.Object {
  def setup(app: Application[_], path: java.lang.String): scala.Unit
}

object SetupMethod {
  @scala.inline
  def apply(setup: (Application[_], java.lang.String) => scala.Unit): SetupMethod = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction2(setup))
  
    __obj.asInstanceOf[SetupMethod]
  }
}

