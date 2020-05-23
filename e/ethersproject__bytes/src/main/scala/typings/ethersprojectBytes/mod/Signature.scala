package typings.ethersprojectBytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var _vs: String
  var r: String
  var recoveryParam: Double
  var s: String
  var v: Double
}

object Signature {
  @scala.inline
  def apply(_vs: String, r: String, recoveryParam: Double, s: String, v: Double): Signature = {
    val __obj = js.Dynamic.literal(_vs = _vs.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], recoveryParam = recoveryParam.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
}

