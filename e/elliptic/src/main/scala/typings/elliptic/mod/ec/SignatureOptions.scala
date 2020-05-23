package typings.elliptic.mod.ec

import typings.elliptic.mod.BNInput
import typings.elliptic.mod._SignatureInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureOptions extends _SignatureInput {
  var r: BNInput
  var recoveryParam: js.UndefOr[Double] = js.undefined
  var s: BNInput
}

object SignatureOptions {
  @scala.inline
  def apply(r: BNInput, s: BNInput, recoveryParam: js.UndefOr[Double] = js.undefined): SignatureOptions = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (!js.isUndefined(recoveryParam)) __obj.updateDynamic("recoveryParam")(recoveryParam.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureOptions]
  }
}

