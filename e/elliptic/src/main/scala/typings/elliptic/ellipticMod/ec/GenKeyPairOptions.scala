package typings.elliptic.ellipticMod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenKeyPairOptions extends js.Object {
  var entropy: js.Any
  var entropyEnc: js.UndefOr[String] = js.undefined
  var pers: js.UndefOr[js.Any] = js.undefined
  var persEnc: js.UndefOr[String] = js.undefined
}

object GenKeyPairOptions {
  @scala.inline
  def apply(entropy: js.Any, entropyEnc: String = null, pers: js.Any = null, persEnc: String = null): GenKeyPairOptions = {
    val __obj = js.Dynamic.literal(entropy = entropy)
    if (entropyEnc != null) __obj.updateDynamic("entropyEnc")(entropyEnc)
    if (pers != null) __obj.updateDynamic("pers")(pers)
    if (persEnc != null) __obj.updateDynamic("persEnc")(persEnc)
    __obj.asInstanceOf[GenKeyPairOptions]
  }
}

