package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyObject extends js.Object {
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pem: java.lang.String | nodeLib.Buffer
}

object KeyObject {
  @scala.inline
  def apply(pem: java.lang.String | nodeLib.Buffer, passphrase: java.lang.String = null): KeyObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pem")(pem.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[KeyObject]
  }
}

