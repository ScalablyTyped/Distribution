package typings.googleDashAppsDashScript.GoogleAppsScript.Mail

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sends email.
  *
  * This service allows users to send emails with complete control over the content of the email.
  * Unlike GmailApp, MailApp's sole purpose is sending email. MailApp cannot access a user's Gmail
  * inbox.
  *
  * Changes to scripts written using GmailApp are more likely to trigger a re-authorization
  * request from a user than MailApp scripts.
  */
@js.native
trait MailApp extends js.Object {
  def getRemainingDailyQuota(): Integer = js.native
  def sendEmail(message: MailAdvancedParameters): Unit = js.native
  def sendEmail(recipient: String, subject: String, body: String): Unit = js.native
  def sendEmail(recipient: String, subject: String, body: String, options: MailAdvancedParameters): Unit = js.native
  def sendEmail(to: String, replyTo: String, subject: String, body: String): Unit = js.native
}

