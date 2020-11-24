package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedAuthToken extends AuthToken {
  
  /**
    * Unix timestamp when Authentication Token was created.
    * Only exists if requestStatus is COMPLETED.
    */
  val creationTime: Double = js.native
  
  /**
    * Authentication Token time to live duration in milliseconds.
    * Only exists if requestStatus is COMPLETED.
    */
  val expiresIn: Double = js.native
  
  val requestStatus: `2` = js.native
  
  /**
    * Firebase Installations Authentication Token.
    * Only exists if requestStatus is COMPLETED.
    */
  val token: String = js.native
}
object CompletedAuthToken {
  
  @scala.inline
  def apply(creationTime: Double, expiresIn: Double, requestStatus: `2`, token: String): CompletedAuthToken = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedAuthToken]
  }
  
  @scala.inline
  implicit class CompletedAuthTokenOps[Self <: CompletedAuthToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: Double): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStatus(value: `2`): Self = this.set("requestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
