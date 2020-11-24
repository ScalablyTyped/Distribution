package typings.feathersjsAuthenticationJwt.mod

import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsFeathers.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeathersAuthenticationJWTOptions extends js.Object {
  
  /**
    * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
    */
  var Verifier: Instantiable2[
    /* app */ Application[js.Object], 
    /* options */ js.Any, 
    typings.feathersjsAuthenticationJwt.mod.Verifier
  ] = js.native
  
  /**
    * the entity that you pull from if an 'id' is present in the payload
    */
  var entity: String = js.native
  
  /**
    * a passport-jwt option determining where to parse the JWT
    */
  def jwtFromRequest(req: Request_[ParamsDictionary, _, _, Query]): String | Null = js.native
  /**
    * a passport-jwt option determining where to parse the JWT
    */
  @JSName("jwtFromRequest")
  var jwtFromRequest_Original: JwtFromRequestFunction = js.native
  
  /**
    * the name to use when invoking the authentication Strategy
    */
  var name: String = js.native
  
  /**
    * whether the request object should be passed to `verify`
    */
  var passReqToCallback: Boolean = js.native
  
  /**
    * Your main secret provided to passport-jwt
    */
  var secretOrKey: String = js.native
  
  /**
    * the service to look up the entity
    */
  var service: String = js.native
  
  /**
    * whether to use sessions,
    */
  var session: Boolean = js.native
}
