package typings.googleAuthLibrary.loginticketMod

import typings.googleAuthLibrary.anon.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/auth/loginticket", "LoginTicket")
@js.native
/**
  * Create a simple class to extract user ID from an ID Token
  *
  * @param {string} env Envelope of the jwt
  * @param {TokenPayload} pay Payload of the jwt
  * @constructor
  */
class LoginTicket () extends js.Object {
  def this(env: String) = this()
  def this(env: js.UndefOr[scala.Nothing], pay: TokenPayload) = this()
  def this(env: String, pay: TokenPayload) = this()
  
  var envelope: js.Any = js.native
  
  /**
    * Returns attributes from the login ticket.  This can contain
    * various information about the user session.
    *
    * @return The envelope and payload
    */
  def getAttributes(): Envelope = js.native
  
  def getEnvelope(): js.UndefOr[String] = js.native
  
  def getPayload(): js.UndefOr[TokenPayload] = js.native
  
  /**
    * Create a simple class to extract user ID from an ID Token
    *
    * @return The user ID
    */
  def getUserId(): String | Null = js.native
  
  var payload: js.Any = js.native
}
