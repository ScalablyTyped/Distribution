package typings
package atFeathersjsAuthenticationDashJwtLib.authenticationDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersAuthenticationJWTOptions extends js.Object {
  /**
       * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
       */
  var Verifier: ScalablyTyped.runtime.Instantiable2[
    /* app */ atFeathersjsFeathersLib.feathersMod.Application[js.Any], 
    /* options */ js.Any, 
    Verifier
  ] = js.native
  /**
       * the entity that you pull from if an 'id' is present in the payload
       */
  var entity: java.lang.String = js.native
  /**
       * a passport-jwt option determining where to parse the JWT
       */
  @JSName("jwtFromRequest")
  var jwtFromRequest_Original: JwtFromRequestFunction = js.native
  /**
       * the name to use when invoking the authentication Strategy
       */
  var name: java.lang.String = js.native
  /**
       * whether the request object should be passed to `verify`
       */
  var passReqToCallback: scala.Boolean = js.native
  /**
       * Your main secret provided to passport-jwt
       */
  var secretOrKey: java.lang.String = js.native
  /**
       * the service to look up the entity
       */
  var service: java.lang.String = js.native
  /**
       * whether to use sessions,
       */
  var session: scala.Boolean = js.native
  /**
       * a passport-jwt option determining where to parse the JWT
       */
  def jwtFromRequest(req: expressLib.expressMod.eNs.Request): java.lang.String = js.native
}

