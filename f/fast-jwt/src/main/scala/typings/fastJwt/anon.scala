package typings.fastJwt

import org.scalablytyped.runtime.StringDictionary
import typings.fastJwt.mod.Algorithm
import typings.fastJwt.mod.JwtHeader
import typings.fastJwt.mod.KeyFetcher
import typings.fastJwt.mod.PrivateKey
import typings.fastJwt.mod.SignerCallback
import typings.fastJwt.mod.TokenError
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(payload: String): js.Promise[String] = js.native
    def apply(payload: String, cb: SignerCallback): Unit = js.native
    def apply(payload: StringDictionary[Any]): js.Promise[String] = js.native
    def apply(payload: StringDictionary[Any], cb: SignerCallback): Unit = js.native
    def apply(payload: Buffer): js.Promise[String] = js.native
    def apply(payload: Buffer, cb: SignerCallback): Unit = js.native
  }
  
  @js.native
  trait FnCallTokenCb extends StObject {
    
    def apply(token: String): js.Promise[Any] = js.native
    def apply(token: String, cb: js.Object): Unit = js.native
    def apply(token: Buffer): js.Promise[Any] = js.native
    def apply(token: Buffer, cb: js.Object): Unit = js.native
  }
  
  /* Inlined std.Partial<fast-jwt.fast-jwt.DecoderOptions> */
  trait PartialDecoderOptions extends StObject {
    
    var checkTyp: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
  }
  object PartialDecoderOptions {
    
    inline def apply(): PartialDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDecoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDecoderOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckTyp(value: String): Self = StObject.set(x, "checkTyp", value.asInstanceOf[js.Any])
      
      inline def setCheckTypUndefined: Self = StObject.set(x, "checkTyp", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    }
  }
  
  /* Inlined std.Partial<fast-jwt.fast-jwt.SignerOptions & {  key :fast-jwt.fast-jwt.KeyFetcher}> */
  trait PartialSignerOptionskeyKe extends StObject {
    
    var algorithm: js.UndefOr[Algorithm] = js.undefined
    
    var aud: js.UndefOr[String] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var header: js.UndefOr[JwtHeader] = js.undefined
    
    var iss: js.UndefOr[String] = js.undefined
    
    var jti: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[KeyFetcher] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var mutatePayload: js.UndefOr[Boolean] = js.undefined
    
    var noTimestamp: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var notBefore: js.UndefOr[Double] = js.undefined
    
    var sub: js.UndefOr[String] = js.undefined
  }
  object PartialSignerOptionskeyKe {
    
    inline def apply(): PartialSignerOptionskeyKe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSignerOptionskeyKe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSignerOptionskeyKe] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setKey(value: KeyFetcher): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(value: /* header */ StringDictionary[Any] => js.Promise[String | Buffer]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyFunction2(
        value: (/* header */ StringDictionary[Any], /* cb */ js.Function2[/* err */ js.Error | TokenError | Null, /* key */ String | Buffer, Unit]) => Unit
      ): Self = StObject.set(x, "key", js.Any.fromFunction2(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setMutatePayload(value: Boolean): Self = StObject.set(x, "mutatePayload", value.asInstanceOf[js.Any])
      
      inline def setMutatePayloadUndefined: Self = StObject.set(x, "mutatePayload", js.undefined)
      
      inline def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
  
  /* Inlined std.Partial<fast-jwt.fast-jwt.SignerOptions & {  key :string | node.buffer.<global>.Buffer | fast-jwt.fast-jwt.PrivateKey}> */
  trait PartialSignerOptionskeyst extends StObject {
    
    var algorithm: js.UndefOr[Algorithm] = js.undefined
    
    var aud: js.UndefOr[String] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var header: js.UndefOr[JwtHeader] = js.undefined
    
    var iss: js.UndefOr[String] = js.undefined
    
    var jti: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String | Buffer | PrivateKey] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var mutatePayload: js.UndefOr[Boolean] = js.undefined
    
    var noTimestamp: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var notBefore: js.UndefOr[Double] = js.undefined
    
    var sub: js.UndefOr[String] = js.undefined
  }
  object PartialSignerOptionskeyst {
    
    inline def apply(): PartialSignerOptionskeyst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSignerOptionskeyst]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSignerOptionskeyst] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      inline def setKey(value: String | Buffer | PrivateKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setMutatePayload(value: Boolean): Self = StObject.set(x, "mutatePayload", value.asInstanceOf[js.Any])
      
      inline def setMutatePayloadUndefined: Self = StObject.set(x, "mutatePayload", js.undefined)
      
      inline def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
  
  /* Inlined std.Partial<fast-jwt.fast-jwt.VerifierOptions & {  key :string | node.buffer.<global>.Buffer}> */
  trait PartialVerifierOptionskey extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var allowedAud: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedIss: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedJti: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedNonce: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedSub: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var cache: js.UndefOr[Boolean | Double] = js.undefined
    
    var cacheTTL: js.UndefOr[Double] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object PartialVerifierOptionskey {
    
    inline def apply(): PartialVerifierOptionskey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialVerifierOptionskey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialVerifierOptionskey] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowedAud(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedAud", value.asInstanceOf[js.Any])
      
      inline def setAllowedAudUndefined: Self = StObject.set(x, "allowedAud", js.undefined)
      
      inline def setAllowedAudVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedAud", js.Array(value*))
      
      inline def setAllowedIss(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedIss", value.asInstanceOf[js.Any])
      
      inline def setAllowedIssUndefined: Self = StObject.set(x, "allowedIss", js.undefined)
      
      inline def setAllowedIssVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedIss", js.Array(value*))
      
      inline def setAllowedJti(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedJti", value.asInstanceOf[js.Any])
      
      inline def setAllowedJtiUndefined: Self = StObject.set(x, "allowedJti", js.undefined)
      
      inline def setAllowedJtiVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedJti", js.Array(value*))
      
      inline def setAllowedNonce(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedNonce", value.asInstanceOf[js.Any])
      
      inline def setAllowedNonceUndefined: Self = StObject.set(x, "allowedNonce", js.undefined)
      
      inline def setAllowedNonceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedNonce", js.Array(value*))
      
      inline def setAllowedSub(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedSub", value.asInstanceOf[js.Any])
      
      inline def setAllowedSubUndefined: Self = StObject.set(x, "allowedSub", js.undefined)
      
      inline def setAllowedSubVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedSub", js.Array(value*))
      
      inline def setCache(value: Boolean | Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheTTL(value: Double): Self = StObject.set(x, "cacheTTL", value.asInstanceOf[js.Any])
      
      inline def setCacheTTLUndefined: Self = StObject.set(x, "cacheTTL", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  /* Inlined std.Partial<fast-jwt.fast-jwt.VerifierOptions & {  key :fast-jwt.fast-jwt.KeyFetcher}> */
  trait PartialVerifierOptionskeyAlgorithms extends StObject {
    
    var algorithms: js.UndefOr[js.Array[Algorithm]] = js.undefined
    
    var allowedAud: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedIss: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedJti: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedNonce: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var allowedSub: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var cache: js.UndefOr[Boolean | Double] = js.undefined
    
    var cacheTTL: js.UndefOr[Double] = js.undefined
    
    var clockTimestamp: js.UndefOr[Double] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[KeyFetcher] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object PartialVerifierOptionskeyAlgorithms {
    
    inline def apply(): PartialVerifierOptionskeyAlgorithms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialVerifierOptionskeyAlgorithms]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialVerifierOptionskeyAlgorithms] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowedAud(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedAud", value.asInstanceOf[js.Any])
      
      inline def setAllowedAudUndefined: Self = StObject.set(x, "allowedAud", js.undefined)
      
      inline def setAllowedAudVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedAud", js.Array(value*))
      
      inline def setAllowedIss(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedIss", value.asInstanceOf[js.Any])
      
      inline def setAllowedIssUndefined: Self = StObject.set(x, "allowedIss", js.undefined)
      
      inline def setAllowedIssVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedIss", js.Array(value*))
      
      inline def setAllowedJti(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedJti", value.asInstanceOf[js.Any])
      
      inline def setAllowedJtiUndefined: Self = StObject.set(x, "allowedJti", js.undefined)
      
      inline def setAllowedJtiVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedJti", js.Array(value*))
      
      inline def setAllowedNonce(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedNonce", value.asInstanceOf[js.Any])
      
      inline def setAllowedNonceUndefined: Self = StObject.set(x, "allowedNonce", js.undefined)
      
      inline def setAllowedNonceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedNonce", js.Array(value*))
      
      inline def setAllowedSub(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedSub", value.asInstanceOf[js.Any])
      
      inline def setAllowedSubUndefined: Self = StObject.set(x, "allowedSub", js.undefined)
      
      inline def setAllowedSubVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedSub", js.Array(value*))
      
      inline def setCache(value: Boolean | Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheTTL(value: Double): Self = StObject.set(x, "cacheTTL", value.asInstanceOf[js.Any])
      
      inline def setCacheTTLUndefined: Self = StObject.set(x, "cacheTTL", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setKey(value: KeyFetcher): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(value: /* header */ StringDictionary[Any] => js.Promise[String | Buffer]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyFunction2(
        value: (/* header */ StringDictionary[Any], /* cb */ js.Function2[/* err */ js.Error | TokenError | Null, /* key */ String | Buffer, Unit]) => Unit
      ): Self = StObject.set(x, "key", js.Any.fromFunction2(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
