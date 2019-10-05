package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VacationSettings extends js.Object {
  var enableAutoReply: js.UndefOr[Boolean] = js.undefined
  var endTime: js.UndefOr[String] = js.undefined
  var responseBodyHtml: js.UndefOr[String] = js.undefined
  var responseBodyPlainText: js.UndefOr[String] = js.undefined
  var responseSubject: js.UndefOr[String] = js.undefined
  var restrictToContacts: js.UndefOr[Boolean] = js.undefined
  var restrictToDomain: js.UndefOr[Boolean] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
}

object VacationSettings {
  @scala.inline
  def apply(
    enableAutoReply: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    responseBodyHtml: String = null,
    responseBodyPlainText: String = null,
    responseSubject: String = null,
    restrictToContacts: js.UndefOr[Boolean] = js.undefined,
    restrictToDomain: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null
  ): VacationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAutoReply)) __obj.updateDynamic("enableAutoReply")(enableAutoReply)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (responseBodyHtml != null) __obj.updateDynamic("responseBodyHtml")(responseBodyHtml)
    if (responseBodyPlainText != null) __obj.updateDynamic("responseBodyPlainText")(responseBodyPlainText)
    if (responseSubject != null) __obj.updateDynamic("responseSubject")(responseSubject)
    if (!js.isUndefined(restrictToContacts)) __obj.updateDynamic("restrictToContacts")(restrictToContacts)
    if (!js.isUndefined(restrictToDomain)) __obj.updateDynamic("restrictToDomain")(restrictToDomain)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[VacationSettings]
  }
}

