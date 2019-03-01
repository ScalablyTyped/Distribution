package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712Domain extends js.Object {
  var chainId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var salt: js.UndefOr[java.lang.String] = js.undefined
  var verifyingContract: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object EIP712Domain {
  @scala.inline
  def apply(
    chainId: java.lang.String | scala.Double = null,
    name: java.lang.String = null,
    salt: java.lang.String = null,
    verifyingContract: java.lang.String = null,
    version: java.lang.String = null
  ): EIP712Domain = {
    val __obj = js.Dynamic.literal()
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (verifyingContract != null) __obj.updateDynamic("verifyingContract")(verifyingContract)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[EIP712Domain]
  }
}

