package typings
package atFeathersjsAuthenticationDashLocalLib.atFeathersjsAuthenticationDashLocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthenticationLocalOptions extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: LocalVerifier
  /**
    * the entity that you're comparing username/password against
    */
  var entity: java.lang.String
  /**
    * key name of the password on the entity (defaults to `passwordField`)
    */
  var entityPasswordField: java.lang.String
  /**
    * key name of the username field on the entity (defaults to `usernameField`)
    */
  var entityUsernameField: java.lang.String
  /**
    * the name to use when invoking the authentication Strategy
    */
  var name: java.lang.String
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: scala.Boolean
  /**
    * key name of password field on the request
    */
  var passwordField: java.lang.String
  /**
    * the service to look up the entity
    */
  var service: java.lang.String
  /**
    * whether to use sessions,
    */
  var session: scala.Boolean
  /**
    * key name of username field on the request
    */
  var usernameField: java.lang.String
}

object FeathersAuthenticationLocalOptions {
  @scala.inline
  def apply(
    Verifier: LocalVerifier,
    entity: java.lang.String,
    entityPasswordField: java.lang.String,
    entityUsernameField: java.lang.String,
    name: java.lang.String,
    passReqToCallback: scala.Boolean,
    passwordField: java.lang.String,
    service: java.lang.String,
    session: scala.Boolean,
    usernameField: java.lang.String
  ): FeathersAuthenticationLocalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Verifier")(Verifier)
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("entityPasswordField")(entityPasswordField)
    __obj.updateDynamic("entityUsernameField")(entityUsernameField)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    __obj.updateDynamic("passwordField")(passwordField)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[FeathersAuthenticationLocalOptions]
  }
}

