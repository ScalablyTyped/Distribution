package typings.feathersjsAuthenticationJwt

import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import typings.feathersjsAuthenticationJwt.mod.Verifier
import typings.feathersjsFeathers.mod.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BodyKey extends StObject {
    
    var bodyKey: String = js.native
    
    var name: String = js.native
  }
  object BodyKey {
    
    @scala.inline
    def apply(bodyKey: String, name: String): BodyKey = {
      val __obj = js.Dynamic.literal(bodyKey = bodyKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyKey]
    }
    
    @scala.inline
    implicit class BodyKeyMutableBuilder[Self <: BodyKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyKey(value: String): Self = StObject.set(x, "bodyKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FromAuthHeader extends StObject {
    
    def fromAuthHeader(): JwtFromRequestFunction = js.native
    
    def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
    
    def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
    
    def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
    
    def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
    
    def fromHeader(header_name: String): JwtFromRequestFunction = js.native
    
    def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
  }
  object FromAuthHeader {
    
    @scala.inline
    def apply(
      fromAuthHeader: () => JwtFromRequestFunction,
      fromAuthHeaderAsBearerToken: () => JwtFromRequestFunction,
      fromAuthHeaderWithScheme: String => JwtFromRequestFunction,
      fromBodyField: String => JwtFromRequestFunction,
      fromExtractors: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction,
      fromHeader: String => JwtFromRequestFunction,
      fromUrlQueryParameter: String => JwtFromRequestFunction
    ): FromAuthHeader = {
      val __obj = js.Dynamic.literal(fromAuthHeader = js.Any.fromFunction0(fromAuthHeader), fromAuthHeaderAsBearerToken = js.Any.fromFunction0(fromAuthHeaderAsBearerToken), fromAuthHeaderWithScheme = js.Any.fromFunction1(fromAuthHeaderWithScheme), fromBodyField = js.Any.fromFunction1(fromBodyField), fromExtractors = js.Any.fromFunction1(fromExtractors), fromHeader = js.Any.fromFunction1(fromHeader), fromUrlQueryParameter = js.Any.fromFunction1(fromUrlQueryParameter))
      __obj.asInstanceOf[FromAuthHeader]
    }
    
    @scala.inline
    implicit class FromAuthHeaderMutableBuilder[Self <: FromAuthHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromAuthHeader(value: () => JwtFromRequestFunction): Self = StObject.set(x, "fromAuthHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFromAuthHeaderAsBearerToken(value: () => JwtFromRequestFunction): Self = StObject.set(x, "fromAuthHeaderAsBearerToken", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFromAuthHeaderWithScheme(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromAuthHeaderWithScheme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromBodyField(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromBodyField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromExtractors(value: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction): Self = StObject.set(x, "fromExtractors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromHeader(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromUrlQueryParameter(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromUrlQueryParameter", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@feathersjs/authentication-jwt.@feathersjs/authentication-jwt.FeathersAuthenticationJWTOptions> */
  @js.native
  trait PartialFeathersAuthentica extends StObject {
    
    var Verifier: js.UndefOr[
        Instantiable2[
          /* app */ Application[js.Object], 
          /* options */ js.Any, 
          typings.feathersjsAuthenticationJwt.mod.Verifier
        ]
      ] = js.native
    
    var entity: js.UndefOr[String] = js.native
    
    var jwtFromRequest: js.UndefOr[JwtFromRequestFunction] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var passReqToCallback: js.UndefOr[Boolean] = js.native
    
    var secretOrKey: js.UndefOr[String] = js.native
    
    var service: js.UndefOr[String] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
  }
  object PartialFeathersAuthentica {
    
    @scala.inline
    def apply(): PartialFeathersAuthentica = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFeathersAuthentica]
    }
    
    @scala.inline
    implicit class PartialFeathersAuthenticaMutableBuilder[Self <: PartialFeathersAuthentica] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setJwtFromRequest(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String | Null): Self = StObject.set(x, "jwtFromRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJwtFromRequestUndefined: Self = StObject.set(x, "jwtFromRequest", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setSecretOrKey(value: String): Self = StObject.set(x, "secretOrKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretOrKeyUndefined: Self = StObject.set(x, "secretOrKey", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setVerifier(value: Instantiable2[/* app */ Application[js.Object], /* options */ js.Any, Verifier]): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifierUndefined: Self = StObject.set(x, "Verifier", js.undefined)
    }
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(options: PartialFeathersAuthentica): js.Function0[Unit] = js.native
    
    val ExtractJwt: FromAuthHeader = js.native
    
    var Verifier: Instantiable2[
        /* app */ Application[js.Object], 
        /* options */ js.Any, 
        typings.feathersjsAuthenticationJwt.mod.Verifier
      ] = js.native
    
    val defaults: BodyKey = js.native
  }
}
