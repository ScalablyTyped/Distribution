package typings
package atFeathersjsAuthenticationDashOauth1Lib.atFeathersjsAuthenticationDashOauth1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthenticationOAuth1Options extends js.Object {
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: OAuth1Verifier
  /**
    * The route to register the callback handler
    */
  var callbackPath: java.lang.String
  /**
    * hostname[:port]/auth/<provider>/callback',
    */
  var callbackURL: java.lang.String
  /**
    * the entity that you are looking up
    */
  var entity: java.lang.String
  /**
    * The response formatter. Defaults the the built in feathers-rest formatter, which returns JSON. todo: needs a proper type
    */
  var formatter: js.Any
  /**
    * Express middleware for handling the oauth callback. Defaults to the built in middleware. todo: needs a proper type
    */
  var handler: js.Any
  /**
    * The field to look up the entity by when logging in with the provider. Defaults to '<provider>Id' (ie. 'twitterId').
    */
  var idField: java.lang.String
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: scala.Boolean
  /**
    * The route to register the middleware
    */
  var path: java.lang.String
  /**
    * the service to look up the entity
    */
  var service: java.lang.String
  /**
    * whether to use sessions,
    */
  var session: scala.Boolean
}

object FeathersAuthenticationOAuth1Options {
  @scala.inline
  def apply(
    Verifier: OAuth1Verifier,
    callbackPath: java.lang.String,
    callbackURL: java.lang.String,
    entity: java.lang.String,
    formatter: js.Any,
    handler: js.Any,
    idField: java.lang.String,
    passReqToCallback: scala.Boolean,
    path: java.lang.String,
    service: java.lang.String,
    session: scala.Boolean
  ): FeathersAuthenticationOAuth1Options = {
    val __obj = js.Dynamic.literal(Verifier = Verifier, callbackPath = callbackPath, callbackURL = callbackURL, entity = entity, formatter = formatter, handler = handler, idField = idField, passReqToCallback = passReqToCallback, path = path, service = service, session = session)
  
    __obj.asInstanceOf[FeathersAuthenticationOAuth1Options]
  }
}

