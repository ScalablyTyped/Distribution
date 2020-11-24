package typings.expressSession.mod.global.Express

import typings.expressSession.anon.SessionPartialSessionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Inject additional properties on express.Request
@js.native
trait Request extends js.Object {
  
  /**
    * This request's `Session` object.
    * Even though this property isn't marked as optional, it won't exist until you use the `express-session` middleware
    * [Declaration merging](https://www.typescriptlang.org/docs/handbook/declaration-merging.html) can be used to add your own properties.
    *
    * @see SessionData
    */
  var session: SessionPartialSessionData = js.native
  
  /**
    * This request's session ID.
    * Even though this property isn't marked as optional, it won't exist until you use the `express-session` middleware
    */
  var sessionID: String = js.native
}
object Request {
  
  @scala.inline
  def apply(session: SessionPartialSessionData, sessionID: String): Request = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setSession(value: SessionPartialSessionData): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionID(value: String): Self = this.set("sessionID", value.asInstanceOf[js.Any])
  }
}
