package typings.feathersjsAuthenticationJwt

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthenticationJwt.anon.PartialFeathersAuthentica
import typings.feathersjsAuthenticationJwt.anon.Typeofself
import typings.feathersjsFeathers.mod.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("@feathersjs/authentication-jwt", JSImport.Default)
    @js.native
    val ^ : (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) with Typeofself = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@feathersjs/authentication-jwt", "default.Verifier")
    @js.native
    class VerifierCls protected () extends Verifier {
      def this(app: Application[js.Object], options: js.Any) = this()
    }
    
    type _To = (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) with Typeofself
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) with Typeofself = ^
  }
  
  object ExtractJwt {
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromAuthHeader")
    @js.native
    def fromAuthHeader(): JwtFromRequestFunction = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromAuthHeaderAsBearerToken")
    @js.native
    def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromAuthHeaderWithScheme")
    @js.native
    def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromBodyField")
    @js.native
    def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromExtractors")
    @js.native
    def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromHeader")
    @js.native
    def fromHeader(header_name: String): JwtFromRequestFunction = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt.fromUrlQueryParameter")
    @js.native
    def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
  }
  
  @JSImport("@feathersjs/authentication-jwt", "Verifier")
  @js.native
  class Verifier protected () extends StObject {
    def this(app: Application[js.Object], options: js.Any) = this()
    
    // the class constructor
    def verify(
      req: Request_[ParamsDictionary, _, _, Query],
      payload: js.Any,
      done: js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
  }
  
  object defaults {
    
    @JSImport("@feathersjs/authentication-jwt", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "defaults.bodyKey")
    @js.native
    def bodyKey: String = js.native
    @scala.inline
    def bodyKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-jwt", "defaults.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FeathersAuthenticationJWTOptions extends StObject {
    
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
  
  type JwtFromRequestFunction = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String | Null]
}
