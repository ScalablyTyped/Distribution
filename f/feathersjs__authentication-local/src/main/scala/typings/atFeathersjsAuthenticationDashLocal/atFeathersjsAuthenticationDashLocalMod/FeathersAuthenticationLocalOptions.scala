package typings.atFeathersjsAuthenticationDashLocal.atFeathersjsAuthenticationDashLocalMod

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
  var entity: String
  /**
    * key name of the password on the entity (defaults to `passwordField`)
    */
  var entityPasswordField: String
  /**
    * key name of the username field on the entity (defaults to `usernameField`)
    */
  var entityUsernameField: String
  /**
    * the name to use when invoking the authentication Strategy
    */
  var name: String
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean
  /**
    * key name of password field on the request
    */
  var passwordField: String
  /**
    * the service to look up the entity
    */
  var service: String
  /**
    * whether to use sessions,
    */
  var session: Boolean
  /**
    * key name of username field on the request
    */
  var usernameField: String
}

object FeathersAuthenticationLocalOptions {
  @scala.inline
  def apply(
    Verifier: LocalVerifier,
    entity: String,
    entityPasswordField: String,
    entityUsernameField: String,
    name: String,
    passReqToCallback: Boolean,
    passwordField: String,
    service: String,
    session: Boolean,
    usernameField: String
  ): FeathersAuthenticationLocalOptions = {
    val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityPasswordField = entityPasswordField.asInstanceOf[js.Any], entityUsernameField = entityUsernameField.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], passwordField = passwordField.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], usernameField = usernameField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeathersAuthenticationLocalOptions]
  }
}

