package typings.ghauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /**
    * @default "https://api.github.com/authorizations"
    */
  var authUrl: js.UndefOr[String] = js.undefined
  var configName: String
  /**
    * @default false
    */
  var noSave: js.UndefOr[Boolean] = js.undefined
  /**
    * @default "Node.js command-line app with ghauth"
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * @default "GitHub"
    */
  var promptName: js.UndefOr[String] = js.undefined
  /**
    * @default []
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @default "Magic Node.js application that does magic things with ghauth"
    */
  var userAgent: js.UndefOr[String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    configName: String,
    authUrl: String = null,
    noSave: js.UndefOr[Boolean] = js.undefined,
    note: String = null,
    promptName: String = null,
    scopes: js.Array[String] = null,
    userAgent: String = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any])
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(noSave)) __obj.updateDynamic("noSave")(noSave.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (promptName != null) __obj.updateDynamic("promptName")(promptName.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

