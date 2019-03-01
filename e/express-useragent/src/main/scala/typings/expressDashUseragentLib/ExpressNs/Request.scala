package typings
package expressDashUseragentLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var useragent: js.UndefOr[expressDashUseragentLib.ExpressUseragentNs.UserAgent] = js.undefined
}

object Request {
  @scala.inline
  def apply(useragent: expressDashUseragentLib.ExpressUseragentNs.UserAgent = null): Request = {
    val __obj = js.Dynamic.literal()
    if (useragent != null) __obj.updateDynamic("useragent")(useragent)
    __obj.asInstanceOf[Request]
  }
}

