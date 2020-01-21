package typings.easyXapiSupertest.tlsMod

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
    val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurePair]
  }
}

