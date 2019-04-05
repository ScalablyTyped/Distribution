package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImClient extends js.Object {
  var formattedProtocol: js.UndefOr[java.lang.String] = js.undefined
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object ImClient {
  @scala.inline
  def apply(
    formattedProtocol: java.lang.String = null,
    formattedType: java.lang.String = null,
    metadata: FieldMetadata = null,
    protocol: java.lang.String = null,
    `type`: java.lang.String = null,
    username: java.lang.String = null
  ): ImClient = {
    val __obj = js.Dynamic.literal()
    if (formattedProtocol != null) __obj.updateDynamic("formattedProtocol")(formattedProtocol)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ImClient]
  }
}

