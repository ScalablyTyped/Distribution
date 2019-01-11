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

