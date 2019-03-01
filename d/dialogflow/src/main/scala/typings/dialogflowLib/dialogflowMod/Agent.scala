package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  var avatarUri: js.UndefOr[java.lang.String] = js.undefined
  var classificationThreshold: js.UndefOr[scala.Double] = js.undefined
  var defaultLanguageCode: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var displayName: java.lang.String
  var enableLogging: js.UndefOr[scala.Boolean] = js.undefined
  var matchMode: js.UndefOr[MatchMode] = js.undefined
  var parent: java.lang.String
  var supportedLanguageCodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var timeZone: java.lang.String
}

object Agent {
  @scala.inline
  def apply(
    defaultLanguageCode: java.lang.String,
    displayName: java.lang.String,
    parent: java.lang.String,
    timeZone: java.lang.String,
    avatarUri: java.lang.String = null,
    classificationThreshold: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    enableLogging: js.UndefOr[scala.Boolean] = js.undefined,
    matchMode: MatchMode = null,
    supportedLanguageCodes: js.Array[java.lang.String] = null
  ): Agent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultLanguageCode")(defaultLanguageCode)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("timeZone")(timeZone)
    if (avatarUri != null) __obj.updateDynamic("avatarUri")(avatarUri)
    if (classificationThreshold != null) __obj.updateDynamic("classificationThreshold")(classificationThreshold.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging)
    if (matchMode != null) __obj.updateDynamic("matchMode")(matchMode)
    if (supportedLanguageCodes != null) __obj.updateDynamic("supportedLanguageCodes")(supportedLanguageCodes)
    __obj.asInstanceOf[Agent]
  }
}

