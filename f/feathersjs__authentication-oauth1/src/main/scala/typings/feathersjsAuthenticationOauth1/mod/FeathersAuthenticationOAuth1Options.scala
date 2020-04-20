package typings.feathersjsAuthenticationOauth1.mod

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
  var callbackPath: String
  /**
    * hostname[:port]/auth/<provider>/callback',
    */
  var callbackURL: String
  /**
    * the entity that you are looking up
    */
  var entity: String
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
  var idField: String
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean
  /**
    * The route to register the middleware
    */
  var path: String
  /**
    * the service to look up the entity
    */
  var service: String
  /**
    * whether to use sessions,
    */
  var session: Boolean
}

object FeathersAuthenticationOAuth1Options {
  @scala.inline
  def apply(
    Verifier: OAuth1Verifier,
    callbackPath: String,
    callbackURL: String,
    entity: String,
    formatter: js.Any,
    handler: js.Any,
    idField: String,
    passReqToCallback: Boolean,
    path: String,
    service: String,
    session: Boolean
  ): FeathersAuthenticationOAuth1Options = {
    val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], callbackPath = callbackPath.asInstanceOf[js.Any], callbackURL = callbackURL.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], idField = idField.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthenticationOAuth1Options]
  }
}

