package typings.fastifyJwt

import typings.fastifyJwt.mod.Secret
import typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyReply
import typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyRequest
import typings.jsonwebtoken.mod.Algorithm
import typings.jsonwebtoken.mod.DecodeOptions
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AuthorizationTokenExpiredMessage extends StObject {
    
    var authorizationTokenExpiredMessage: js.UndefOr[String] = js.native
    
    var authorizationTokenInvalid: js.UndefOr[(js.Function1[/* err */ Error, String]) | String] = js.native
    
    var authorizationTokenUntrusted: js.UndefOr[String] = js.native
    
    var badRequestErrorMessage: js.UndefOr[String] = js.native
    
    var noAuthorizationInHeaderMessage: js.UndefOr[String] = js.native
  }
  object AuthorizationTokenExpiredMessage {
    
    @scala.inline
    def apply(): AuthorizationTokenExpiredMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationTokenExpiredMessage]
    }
    
    @scala.inline
    implicit class AuthorizationTokenExpiredMessageMutableBuilder[Self <: AuthorizationTokenExpiredMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationTokenExpiredMessage(value: String): Self = StObject.set(x, "authorizationTokenExpiredMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationTokenExpiredMessageUndefined: Self = StObject.set(x, "authorizationTokenExpiredMessage", js.undefined)
      
      @scala.inline
      def setAuthorizationTokenInvalid(value: (js.Function1[/* err */ Error, String]) | String): Self = StObject.set(x, "authorizationTokenInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationTokenInvalidFunction1(value: /* err */ Error => String): Self = StObject.set(x, "authorizationTokenInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAuthorizationTokenInvalidUndefined: Self = StObject.set(x, "authorizationTokenInvalid", js.undefined)
      
      @scala.inline
      def setAuthorizationTokenUntrusted(value: String): Self = StObject.set(x, "authorizationTokenUntrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationTokenUntrustedUndefined: Self = StObject.set(x, "authorizationTokenUntrusted", js.undefined)
      
      @scala.inline
      def setBadRequestErrorMessage(value: String): Self = StObject.set(x, "badRequestErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadRequestErrorMessageUndefined: Self = StObject.set(x, "badRequestErrorMessage", js.undefined)
      
      @scala.inline
      def setNoAuthorizationInHeaderMessage(value: String): Self = StObject.set(x, "noAuthorizationInHeaderMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAuthorizationInHeaderMessageUndefined: Self = StObject.set(x, "noAuthorizationInHeaderMessage", js.undefined)
    }
  }
  
  @js.native
  trait CookieName extends StObject {
    
    var cookieName: String = js.native
  }
  object CookieName {
    
    @scala.inline
    def apply(cookieName: String): CookieName = {
      val __obj = js.Dynamic.literal(cookieName = cookieName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieName]
    }
    
    @scala.inline
    implicit class CookieNameMutableBuilder[Self <: CookieName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Decode extends StObject {
    
    var decode: DecodeOptions = js.native
    
    var sign: SignOptions = js.native
    
    var verify: VerifyOptions = js.native
  }
  object Decode {
    
    @scala.inline
    def apply(decode: DecodeOptions, sign: SignOptions, verify: VerifyOptions): Decode = {
      val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decode]
    }
    
    @scala.inline
    implicit class DecodeMutableBuilder[Self <: Decode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: DecodeOptions): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign(value: SignOptions): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerify(value: VerifyOptions): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Private extends StObject {
    
    var `private`: Secret = js.native
    
    var public: Secret = js.native
  }
  object Private {
    
    @scala.inline
    def apply(`private`: Secret, public: Secret): Private = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Private]
    }
    
    @scala.inline
    implicit class PrivateMutableBuilder[Self <: Private] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: Secret): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateFunction3(
        value: (/* request */ FastifyRequest, /* reply */ FastifyReply, /* cb */ js.Function2[/* e */ Error | Null, /* secret */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "private", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPublic(value: Secret): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicFunction3(
        value: (/* request */ FastifyRequest, /* reply */ FastifyReply, /* cb */ js.Function2[/* e */ Error | Null, /* secret */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "public", js.Any.fromFunction3(value))
    }
  }
  
  /* Inlined jsonwebtoken.jsonwebtoken.VerifyOptions & {  extractToken :(request : fastify-jwt.fastify-jwt.fastify.FastifyRequest): string | void | undefined} */
  @js.native
  trait VerifyOptionsextractToken extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.native
    
    var audience: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
    
    var clockTimestamp: js.UndefOr[Double] = js.native
    
    var clockTolerance: js.UndefOr[Double] = js.native
    
    /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
    var complete: js.UndefOr[Boolean] = js.native
    
    var extractToken: js.UndefOr[js.Function1[/* request */ FastifyRequest, String | Unit]] = js.native
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.native
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.native
    
    var jwtid: js.UndefOr[String] = js.native
    
    /**
      * @deprecated
      * Max age of token
      */
    var maxAge: js.UndefOr[String] = js.native
    
    /**
      * If you want to check `nonce` claim, provide a string value here.
      * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
      */
    var nonce: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object VerifyOptionsextractToken {
    
    @scala.inline
    def apply(): VerifyOptionsextractToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptionsextractToken]
    }
    
    @scala.inline
    implicit class VerifyOptionsextractTokenMutableBuilder[Self <: VerifyOptionsextractToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: (String | RegExp)*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      @scala.inline
      def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setExtractToken(value: /* request */ FastifyRequest => String | Unit): Self = StObject.set(x, "extractToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtractTokenUndefined: Self = StObject.set(x, "extractToken", js.undefined)
      
      @scala.inline
      def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      @scala.inline
      def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      @scala.inline
      def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      @scala.inline
      def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      @scala.inline
      def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
