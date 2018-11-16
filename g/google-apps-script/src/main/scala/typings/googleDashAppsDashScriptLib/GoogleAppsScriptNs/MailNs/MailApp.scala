package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailApp extends js.Object {
  def getRemainingDailyQuota(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def sendEmail(message: js.Object): scala.Unit = js.native
  def sendEmail(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String): scala.Unit = js.native
  def sendEmail(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String, options: js.Object): scala.Unit = js.native
  def sendEmail(to: java.lang.String, replyTo: java.lang.String, subject: java.lang.String, body: java.lang.String): scala.Unit = js.native
}

