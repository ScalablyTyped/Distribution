package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseInstallations.installationEntryMod.NotStartedAuthToken
  - typings.firebaseInstallations.installationEntryMod.InProgressAuthToken
  - typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
*/
trait AuthToken extends js.Object
object AuthToken {
  
  @scala.inline
  def NotStartedAuthToken(requestStatus: `0`): AuthToken = {
    val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthToken]
  }
  
  @scala.inline
  def InProgressAuthToken(requestStatus: `1`, requestTime: Double): AuthToken = {
    val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthToken]
  }
  
  @scala.inline
  def CompletedAuthToken(creationTime: Double, expiresIn: Double, requestStatus: `2`, token: String): AuthToken = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthToken]
  }
}
