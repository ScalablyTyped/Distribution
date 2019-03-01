package typings
package fingerprintjs2Lib.fingerprintjs2Mod.Fingerprint2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  var key: java.lang.String
  var value: js.Any
}

object Component {
  @scala.inline
  def apply(key: java.lang.String, value: js.Any): Component = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Component]
  }
}

