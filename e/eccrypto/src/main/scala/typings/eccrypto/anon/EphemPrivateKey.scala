package typings.eccrypto.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EphemPrivateKey extends js.Object {
  var ephemPrivateKey: js.UndefOr[Buffer] = js.undefined
  var iv: js.UndefOr[Buffer] = js.undefined
}

object EphemPrivateKey {
  @scala.inline
  def apply(ephemPrivateKey: Buffer = null, iv: Buffer = null): EphemPrivateKey = {
    val __obj = js.Dynamic.literal()
    if (ephemPrivateKey != null) __obj.updateDynamic("ephemPrivateKey")(ephemPrivateKey.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemPrivateKey]
  }
}

