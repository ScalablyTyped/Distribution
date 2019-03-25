package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationCodesCollection extends js.Object {
  // Generate new backup verification codes for the user.
  def generate(userKey: java.lang.String): scala.Unit
  // Invalidate the current backup verification codes for the user.
  def invalidate(userKey: java.lang.String): scala.Unit
  // Returns the current set of valid backup verification codes for the specified user.
  def list(userKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.VerificationCodes
}

object VerificationCodesCollection {
  @scala.inline
  def apply(
    generate: java.lang.String => scala.Unit,
    invalidate: java.lang.String => scala.Unit,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.VerificationCodes
  ): VerificationCodesCollection = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), invalidate = js.Any.fromFunction1(invalidate), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VerificationCodesCollection]
  }
}

