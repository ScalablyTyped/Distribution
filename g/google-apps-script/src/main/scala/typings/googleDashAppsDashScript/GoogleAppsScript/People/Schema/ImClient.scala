package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImClient extends js.Object {
  var formattedProtocol: js.UndefOr[String] = js.undefined
  var formattedType: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ImClient {
  @scala.inline
  def apply(
    formattedProtocol: String = null,
    formattedType: String = null,
    metadata: FieldMetadata = null,
    protocol: String = null,
    `type`: String = null,
    username: String = null
  ): ImClient = {
    val __obj = js.Dynamic.literal()
    if (formattedProtocol != null) __obj.updateDynamic("formattedProtocol")(formattedProtocol.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImClient]
  }
}

