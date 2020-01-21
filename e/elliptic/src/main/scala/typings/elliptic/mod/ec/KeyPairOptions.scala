package typings.elliptic.mod.ec

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
    if (priv != null) __obj.updateDynamic("priv")(priv.asInstanceOf[js.Any])
    if (privEnc != null) __obj.updateDynamic("privEnc")(privEnc.asInstanceOf[js.Any])
    if (pub != null) __obj.updateDynamic("pub")(pub.asInstanceOf[js.Any])
    if (pubEnc != null) __obj.updateDynamic("pubEnc")(pubEnc.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairOptions]
  }
}

