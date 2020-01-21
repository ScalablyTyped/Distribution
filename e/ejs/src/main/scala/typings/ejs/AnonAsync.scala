package typings.ejs

import typings.ejs.ejsBooleans.`false`
import typings.ejs.ejsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsync extends js.Object {
  var async: `true`
  var client: js.UndefOr[`false`] = js.undefined
}

object AnonAsync {
  @scala.inline
  def apply(async: `true`, client: `false` = null): AnonAsync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsync]
  }
}

