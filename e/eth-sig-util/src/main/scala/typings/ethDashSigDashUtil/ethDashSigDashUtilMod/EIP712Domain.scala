package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712Domain extends js.Object {
  var chainId: js.UndefOr[String | Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var salt: js.UndefOr[String] = js.undefined
  var verifyingContract: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object EIP712Domain {
  @scala.inline
  def apply(
    chainId: String | Double = null,
    name: String = null,
    salt: String = null,
    verifyingContract: String = null,
    version: String = null
  ): EIP712Domain = {
    val __obj = js.Dynamic.literal()
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (verifyingContract != null) __obj.updateDynamic("verifyingContract")(verifyingContract.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EIP712Domain]
  }
}

