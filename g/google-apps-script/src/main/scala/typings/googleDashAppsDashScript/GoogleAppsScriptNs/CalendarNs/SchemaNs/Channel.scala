package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var expiration: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var payload: js.UndefOr[Boolean] = js.undefined
  var resourceId: js.UndefOr[String] = js.undefined
  var resourceUri: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    address: String = null,
    expiration: String = null,
    id: String = null,
    kind: String = null,
    params: js.Object = null,
    payload: js.UndefOr[Boolean] = js.undefined,
    resourceId: String = null,
    resourceUri: String = null,
    token: String = null,
    `type`: String = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri)
    if (token != null) __obj.updateDynamic("token")(token)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Channel]
  }
}

