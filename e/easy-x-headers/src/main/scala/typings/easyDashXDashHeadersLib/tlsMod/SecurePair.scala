package typings
package easyDashXDashHeadersLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurePair extends js.Object {
  var cleartext: js.Any
  var encrypted: js.Any
}

object SecurePair {
  @scala.inline
  def apply(cleartext: js.Any, encrypted: js.Any): SecurePair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleartext")(cleartext)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.asInstanceOf[SecurePair]
  }
}

