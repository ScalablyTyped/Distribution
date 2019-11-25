package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authorization Context which needs to be passed to create a SMART client directly
  */
trait AuthContext extends js.Object {
  /**
    * Password if the type of authorization in 'basic'
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Access token to be set if the type of authorization is 'bearer'
    */
  var token: js.UndefOr[String] = js.undefined
  /**
    * Type of Authorization 'none' | 'basic' | 'bearer'
    */
  var `type`: String
  /**
    * Username if the type of authorization in 'basic'
    */
  var username: js.UndefOr[String] = js.undefined
}

object AuthContext {
  @scala.inline
  def apply(`type`: String, password: String = null, token: String = null, username: String = null): AuthContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContext]
  }
}

