package typings
package atFeathersjsAuthenticationDashOauth1Lib.authenticationDashOauth1Mod

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

