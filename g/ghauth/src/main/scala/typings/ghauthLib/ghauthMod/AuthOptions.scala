package typings
package ghauthLib.ghauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /**
    * @default "https://api.github.com/authorizations"
    */
  var authUrl: js.UndefOr[java.lang.String] = js.undefined
  var configName: java.lang.String
  /**
    * @default false
    */
  var noSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default "Node.js command-line app with ghauth"
    */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default "GitHub"
    */
  var promptName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default []
    */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * @default "Magic Node.js application that does magic things with ghauth"
    */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    configName: java.lang.String,
    authUrl: java.lang.String = null,
    noSave: js.UndefOr[scala.Boolean] = js.undefined,
    note: java.lang.String = null,
    promptName: java.lang.String = null,
    scopes: js.Array[java.lang.String] = null,
    userAgent: java.lang.String = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal(configName = configName)
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl)
    if (!js.isUndefined(noSave)) __obj.updateDynamic("noSave")(noSave)
    if (note != null) __obj.updateDynamic("note")(note)
    if (promptName != null) __obj.updateDynamic("promptName")(promptName)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[AuthOptions]
  }
}

