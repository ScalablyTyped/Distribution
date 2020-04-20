package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedAuthToken extends AuthToken {
  /**
    * Unix timestamp when Authentication Token was created.
    * Only exists if requestStatus is COMPLETED.
    */
  val creationTime: Double
  /**
    * Authentication Token time to live duration in milliseconds.
    * Only exists if requestStatus is COMPLETED.
    */
  val expiresIn: Double
  val requestStatus: `2`
  /**
    * Firebase Installations Authentication Token.
    * Only exists if requestStatus is COMPLETED.
    */
  val token: String
}

object CompletedAuthToken {
  @scala.inline
  def apply(creationTime: Double, expiresIn: Double, requestStatus: `2`, token: String): CompletedAuthToken = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedAuthToken]
  }
}

