package typings.firebaseMessaging

import typings.std.ClientTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientQueryOptions extends js.Object {
  var includeReserved: js.UndefOr[Boolean] = js.undefined
  var includeUncontrolled: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[ClientTypes] = js.undefined
}

object ClientQueryOptions {
  @scala.inline
  def apply(
    includeReserved: js.UndefOr[Boolean] = js.undefined,
    includeUncontrolled: js.UndefOr[Boolean] = js.undefined,
    `type`: ClientTypes = null
  ): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeReserved)) __obj.updateDynamic("includeReserved")(includeReserved.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUncontrolled)) __obj.updateDynamic("includeUncontrolled")(includeUncontrolled.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientQueryOptions]
  }
}

