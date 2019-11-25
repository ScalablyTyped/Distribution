package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var chainId: Double
  var ensAddress: js.UndefOr[String] = js.undefined
  var name: String
}

object Network {
  @scala.inline
  def apply(chainId: Double, name: String, ensAddress: String = null): Network = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (ensAddress != null) __obj.updateDynamic("ensAddress")(ensAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Network]
  }
}

