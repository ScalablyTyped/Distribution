package typings.elliptic.ellipticMod.ec

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairOptions extends js.Object {
  var priv: js.UndefOr[Buffer] = js.undefined
  var privEnc: js.UndefOr[String] = js.undefined
  var pub: js.UndefOr[Buffer] = js.undefined
  var pubEnc: js.UndefOr[String] = js.undefined
}

object KeyPairOptions {
  @scala.inline
  def apply(priv: Buffer = null, privEnc: String = null, pub: Buffer = null, pubEnc: String = null): KeyPairOptions = {
    val __obj = js.Dynamic.literal()
    if (priv != null) __obj.updateDynamic("priv")(priv)
    if (privEnc != null) __obj.updateDynamic("privEnc")(privEnc)
    if (pub != null) __obj.updateDynamic("pub")(pub)
    if (pubEnc != null) __obj.updateDynamic("pubEnc")(pubEnc)
    __obj.asInstanceOf[KeyPairOptions]
  }
}

