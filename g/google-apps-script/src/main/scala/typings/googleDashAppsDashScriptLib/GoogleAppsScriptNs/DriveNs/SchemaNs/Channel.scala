package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var payload: js.UndefOr[scala.Boolean] = js.undefined
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  var resourceUri: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    expiration: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    params: js.Object = null,
    payload: js.UndefOr[scala.Boolean] = js.undefined,
    resourceId: java.lang.String = null,
    resourceUri: java.lang.String = null,
    token: java.lang.String = null,
    `type`: java.lang.String = null
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

