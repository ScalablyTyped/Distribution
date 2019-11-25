package typings.futoinDashHkdf.futoinDashHkdfMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[Buffer | String] = js.undefined
  var salt: js.UndefOr[Buffer | String] = js.undefined
}

object Option {
  @scala.inline
  def apply(hash: String = null, info: Buffer | String = null, salt: Buffer | String = null): Option = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

