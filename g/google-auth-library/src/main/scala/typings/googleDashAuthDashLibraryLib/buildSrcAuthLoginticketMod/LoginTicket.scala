package typings
package googleDashAuthDashLibraryLib.buildSrcAuthLoginticketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(env: java.lang.String) = this()
  def this(env: java.lang.String, pay: TokenPayload) = this()
  var envelope: js.UndefOr[js.Any] = js.native
  var payload: js.UndefOr[js.Any] = js.native
  /**
    * Returns attributes from the login ticket.  This can contain
    * various information about the user session.
    *
    * @return The envelope and payload
    */
  def getAttributes(): googleDashAuthDashLibraryLib.Anon_Envelope = js.native
  def getEnvelope(): js.UndefOr[java.lang.String] = js.native
  def getPayload(): js.UndefOr[TokenPayload] = js.native
  /**
    * Create a simple class to extract user ID from an ID Token
    *
    * @return The user ID
    */
  def getUserId(): java.lang.String | scala.Null = js.native
}

