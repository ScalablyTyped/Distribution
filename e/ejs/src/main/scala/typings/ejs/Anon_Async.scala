package typings.ejs

import typings.ejs.ejsBooleans.`false`
import typings.ejs.ejsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: `true`
  var client: js.UndefOr[`false`] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(async: `true`, client: `false` = null): Anon_Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

