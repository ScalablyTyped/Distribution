package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

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
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Access token to be set if the type of authorization is 'bearer'
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of Authorization 'none' | 'basic' | 'bearer'
    */
  var `type`: java.lang.String
  /**
    * Username if the type of authorization in 'basic'
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object AuthContext {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    password: java.lang.String = null,
    token: java.lang.String = null,
    username: java.lang.String = null
  ): AuthContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (password != null) __obj.updateDynamic("password")(password)
    if (token != null) __obj.updateDynamic("token")(token)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[AuthContext]
  }
}

