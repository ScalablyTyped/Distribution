package typings
package easyDashXapiLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var log: js.Any
}

object Request {
  @scala.inline
  def apply(log: js.Any): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[Request]
  }
}

