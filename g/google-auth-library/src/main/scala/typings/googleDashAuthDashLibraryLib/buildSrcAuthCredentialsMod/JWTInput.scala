package typings
package googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTInput extends js.Object {
  var client_email: js.UndefOr[java.lang.String] = js.undefined
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
  var private_key: js.UndefOr[java.lang.String] = js.undefined
  var private_key_id: js.UndefOr[java.lang.String] = js.undefined
  var project_id: js.UndefOr[java.lang.String] = js.undefined
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object JWTInput {
  @scala.inline
  def apply(
    client_email: java.lang.String = null,
    client_id: java.lang.String = null,
    client_secret: java.lang.String = null,
    private_key: java.lang.String = null,
    private_key_id: java.lang.String = null,
    project_id: java.lang.String = null,
    refresh_token: java.lang.String = null,
    `type`: java.lang.String = null
  ): JWTInput = {
    val __obj = js.Dynamic.literal()
    if (client_email != null) __obj.updateDynamic("client_email")(client_email)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (private_key != null) __obj.updateDynamic("private_key")(private_key)
    if (private_key_id != null) __obj.updateDynamic("private_key_id")(private_key_id)
    if (project_id != null) __obj.updateDynamic("project_id")(project_id)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JWTInput]
  }
}

