package typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTInput extends js.Object {
  var client_email: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var private_key: js.UndefOr[String] = js.undefined
  var private_key_id: js.UndefOr[String] = js.undefined
  var project_id: js.UndefOr[String] = js.undefined
  var refresh_token: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object JWTInput {
  @scala.inline
  def apply(
    client_email: String = null,
    client_id: String = null,
    client_secret: String = null,
    private_key: String = null,
    private_key_id: String = null,
    project_id: String = null,
    refresh_token: String = null,
    `type`: String = null
  ): JWTInput = {
    val __obj = js.Dynamic.literal()
    if (client_email != null) __obj.updateDynamic("client_email")(client_email.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (private_key != null) __obj.updateDynamic("private_key")(private_key.asInstanceOf[js.Any])
    if (private_key_id != null) __obj.updateDynamic("private_key_id")(private_key_id.asInstanceOf[js.Any])
    if (project_id != null) __obj.updateDynamic("project_id")(project_id.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTInput]
  }
}

