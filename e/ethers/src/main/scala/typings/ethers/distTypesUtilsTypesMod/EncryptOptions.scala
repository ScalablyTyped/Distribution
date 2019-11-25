package typings.ethers.distTypesUtilsTypesMod

import typings.ethers.Anon_N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  var client: js.UndefOr[String] = js.undefined
  var entropy: js.UndefOr[Arrayish] = js.undefined
  var iv: js.UndefOr[Arrayish] = js.undefined
  var mnemonic: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var salt: js.UndefOr[Arrayish] = js.undefined
  var scrypt: js.UndefOr[Anon_N] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object EncryptOptions {
  @scala.inline
  def apply(
    client: String = null,
    entropy: Arrayish = null,
    iv: Arrayish = null,
    mnemonic: String = null,
    path: String = null,
    salt: Arrayish = null,
    scrypt: Anon_N = null,
    uuid: String = null
  ): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (entropy != null) __obj.updateDynamic("entropy")(entropy.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (scrypt != null) __obj.updateDynamic("scrypt")(scrypt.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptions]
  }
}

