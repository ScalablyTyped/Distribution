package typings.expressDashUseragent.expressDashUseragentMod.Global.ExpressNs

import typings.expressDashUseragent.expressDashUseragentMod.Details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var useragent: js.UndefOr[Details] = js.undefined
}

object Request {
  @scala.inline
  def apply(useragent: Details = null): Request = {
    val __obj = js.Dynamic.literal()
    if (useragent != null) __obj.updateDynamic("useragent")(useragent)
    __obj.asInstanceOf[Request]
  }
}

