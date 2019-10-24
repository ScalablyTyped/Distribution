package typings.eccrypto

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EphemPrivateKey extends js.Object {
  var ephemPrivateKey: js.UndefOr[Buffer] = js.undefined
  var iv: js.UndefOr[Buffer] = js.undefined
}

object Anon_EphemPrivateKey {
  @scala.inline
  def apply(ephemPrivateKey: Buffer = null, iv: Buffer = null): Anon_EphemPrivateKey = {
    val __obj = js.Dynamic.literal()
    if (ephemPrivateKey != null) __obj.updateDynamic("ephemPrivateKey")(ephemPrivateKey)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    __obj.asInstanceOf[Anon_EphemPrivateKey]
  }
}

