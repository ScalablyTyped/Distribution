package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var r: String
  var recoveryParam: js.UndefOr[Double] = js.undefined
  var s: String
  var v: js.UndefOr[Double] = js.undefined
}

object Signature {
  @scala.inline
  def apply(r: String, s: String, recoveryParam: Int | Double = null, v: Int | Double = null): Signature = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (recoveryParam != null) __obj.updateDynamic("recoveryParam")(recoveryParam.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
}

