package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: String
  var flag: js.UndefOr[String] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String, flag: String = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

