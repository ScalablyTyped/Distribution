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
    if (!js.isUndefined(enableAutoReply)) __obj.updateDynamic("enableAutoReply")(enableAutoReply.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (responseBodyHtml != null) __obj.updateDynamic("responseBodyHtml")(responseBodyHtml.asInstanceOf[js.Any])
    if (responseBodyPlainText != null) __obj.updateDynamic("responseBodyPlainText")(responseBodyPlainText.asInstanceOf[js.Any])
    if (responseSubject != null) __obj.updateDynamic("responseSubject")(responseSubject.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictToContacts)) __obj.updateDynamic("restrictToContacts")(restrictToContacts.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictToDomain)) __obj.updateDynamic("restrictToDomain")(restrictToDomain.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VacationSettings]
  }
}

