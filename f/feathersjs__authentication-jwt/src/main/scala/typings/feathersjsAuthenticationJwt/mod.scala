package typings.feathersjsAuthenticationJwt

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.feathersjsAuthenticationJwt.anon.PartialFeathersAuthentica
import typings.feathersjsAuthenticationJwt.anon.Typeofself
import typings.feathersjsFeathers.mod.Application
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("@feathersjs/authentication-jwt", JSImport.Default)
    @js.native
    val ^ : (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) & Typeofself = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@feathersjs/authentication-jwt", "default.Verifier")
    @js.native
    open class VerifierCls protected () extends Verifier {
      def this(app: Application[js.Object], options: Any) = this()
    }
    
    type _To = (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) & Typeofself
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: (js.Function1[/* options */ js.UndefOr[PartialFeathersAuthentica], js.Function0[Unit]]) & Typeofself = ^
  }
  
  object ExtractJwt {
    
    @JSImport("@feathersjs/authentication-jwt", "ExtractJwt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAuthHeader(): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeader")().asInstanceOf[JwtFromRequestFunction]
    
    inline def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeaderAsBearerToken")().asInstanceOf[JwtFromRequestFunction]
    
    inline def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAuthHeaderWithScheme")(auth_scheme.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromBodyField(field_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyField")(field_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtractors")(extractors.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromHeader(header_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(header_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
    
    inline def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrlQueryParameter")(param_name.asInstanceOf[js.Any]).asInstanceOf[JwtFromRequestFunction]
  }
  
  @JSImport("@feathersjs/authentication-jwt", "Verifier")
  @js.native
  open class Verifier protected () extends StObject {
    def this(app: Application[js.Object], options: Any) = this()
    
    // the class constructor
    def verify(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      payload: Any,
      done: js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit]
    ): Unit = js.native
  }
  
  object defaults {
    
    @JSImport("@feathersjs/authentication-jwt", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication-jwt", "defaults.bodyKey")
    @js.native
    def bodyKey: String = js.native
    inline def bodyKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-jwt", "defaults.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait FeathersAuthenticationJWTOptions extends StObject {
    
    /**
      * A Verifier class. Defaults to the built-in one but can be a custom one. See below for details.
      */
    var Verifier: Instantiable2[
        /* app */ Application[js.Object], 
        /* options */ Any, 
        typings.feathersjsAuthenticationJwt.mod.Verifier
      ]
    
    /**
      * the entity that you pull from if an 'id' is present in the payload
      */
    var entity: String
    
    /**
      * a passport-jwt option determining where to parse the JWT
      */
    def jwtFromRequest(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): String | Null
    /**
      * a passport-jwt option determining where to parse the JWT
      */
    @JSName("jwtFromRequest")
    var jwtFromRequest_Original: JwtFromRequestFunction
    
    /**
      * the name to use when invoking the authentication Strategy
      */
    var name: String
    
    /**
      * whether the request object should be passed to `verify`
      */
    var passReqToCallback: Boolean
    
    /**
      * Your main secret provided to passport-jwt
      */
    var secretOrKey: String
    
    /**
      * the service to look up the entity
      */
    var service: String
    
    /**
      * whether to use sessions,
      */
    var session: Boolean
  }
  object FeathersAuthenticationJWTOptions {
    
    inline def apply(
      Verifier: Instantiable2[/* app */ Application[js.Object], /* options */ Any, Verifier],
      entity: String,
      jwtFromRequest: /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ] => String | Null,
      name: String,
      passReqToCallback: Boolean,
      secretOrKey: String,
      service: String,
      session: Boolean
    ): FeathersAuthenticationJWTOptions = {
      val __obj = js.Dynamic.literal(Verifier = Verifier.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], jwtFromRequest = js.Any.fromFunction1(jwtFromRequest), name = name.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], secretOrKey = secretOrKey.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersAuthenticationJWTOptions]
    }
    
    extension [Self <: FeathersAuthenticationJWTOptions](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setJwtFromRequest(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String | Null
      ): Self = StObject.set(x, "jwtFromRequest", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setSecretOrKey(value: String): Self = StObject.set(x, "secretOrKey", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setVerifier(value: Instantiable2[/* app */ Application[js.Object], /* options */ Any, Verifier]): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
    }
  }
  
  type JwtFromRequestFunction = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    String | Null
  ]
}
