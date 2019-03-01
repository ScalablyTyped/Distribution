package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  /**
    * Returns Boolean.
    */
  def spellCheck(text: java.lang.String): scala.Unit
}

object Provider {
  @scala.inline
  def apply(spellCheck: js.Function1[java.lang.String, scala.Unit]): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spellCheck")(spellCheck)
    __obj.asInstanceOf[Provider]
  }
}

