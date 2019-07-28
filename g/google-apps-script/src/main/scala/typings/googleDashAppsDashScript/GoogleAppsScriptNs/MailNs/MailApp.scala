package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MailNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailApp extends js.Object {
  def getRemainingDailyQuota(): Integer = js.native
  def sendEmail(message: js.Any): Unit = js.native
  def sendEmail(recipient: String, subject: String, body: String): Unit = js.native
  def sendEmail(recipient: String, subject: String, body: String, options: js.Any): Unit = js.native
  def sendEmail(to: String, replyTo: String, subject: String, body: String): Unit = js.native
}

