package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VacationSettings extends js.Object {
  /** Flag that controls whether Gmail automatically replies to messages. */
  var enableAutoReply: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional end time for sending auto-replies (epoch ms). When this is specified, Gmail will automatically reply only to messages that it receives
    * before the end time. If both startTime and endTime are specified, startTime must precede endTime.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** Response body in HTML format. Gmail will sanitize the HTML before storing it. */
  var responseBodyHtml: js.UndefOr[String] = js.undefined
  /** Response body in plain text format. */
  var responseBodyPlainText: js.UndefOr[String] = js.undefined
  /**
    * Optional text to prepend to the subject line in vacation responses. In order to enable auto-replies, either the response subject or the response body
    * must be nonempty.
    */
  var responseSubject: js.UndefOr[String] = js.undefined
  /** Flag that determines whether responses are sent to recipients who are not in the user's list of contacts. */
  var restrictToContacts: js.UndefOr[Boolean] = js.undefined
  /** Flag that determines whether responses are sent to recipients who are outside of the user's domain. This feature is only available for G Suite users. */
  var restrictToDomain: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional start time for sending auto-replies (epoch ms). When this is specified, Gmail will automatically reply only to messages that it receives
    * after the start time. If both startTime and endTime are specified, startTime must precede endTime.
    */
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

