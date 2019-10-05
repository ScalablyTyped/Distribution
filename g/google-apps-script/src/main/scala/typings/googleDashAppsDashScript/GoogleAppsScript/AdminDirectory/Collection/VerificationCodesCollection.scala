package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.VerificationCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationCodesCollection extends js.Object {
  // Generate new backup verification codes for the user.
  def generate(userKey: String): Unit
  // Invalidate the current backup verification codes for the user.
  def invalidate(userKey: String): Unit
  // Returns the current set of valid backup verification codes for the specified user.
  def list(userKey: String): VerificationCodes
}

object VerificationCodesCollection {
  @scala.inline
  def apply(generate: String => Unit, invalidate: String => Unit, list: String => VerificationCodes): VerificationCodesCollection = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), invalidate = js.Any.fromFunction1(invalidate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VerificationCodesCollection]
  }
}

