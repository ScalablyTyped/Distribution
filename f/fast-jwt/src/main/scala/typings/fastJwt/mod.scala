package typings.fastJwt

import org.scalablytyped.runtime.StringDictionary
import typings.fastJwt.anon.FnCall
import typings.fastJwt.anon.FnCallTokenCb
import typings.fastJwt.anon.PartialDecoderOptions
import typings.fastJwt.anon.PartialSignerOptionskeyKe
import typings.fastJwt.anon.PartialSignerOptionskeyst
import typings.fastJwt.anon.PartialVerifierOptionskey
import typings.fastJwt.anon.PartialVerifierOptionskeyAlgorithms
import typings.fastJwt.fastJwtStrings.alg
import typings.fastJwt.fastJwtStrings.crit
import typings.fastJwt.fastJwtStrings.cty
import typings.fastJwt.fastJwtStrings.jku
import typings.fastJwt.fastJwtStrings.kid
import typings.fastJwt.fastJwtStrings.typ
import typings.fastJwt.fastJwtStrings.x5c
import typings.fastJwt.fastJwtStrings.x5t
import typings.fastJwt.fastJwtStrings.x5tNumbersignS256
import typings.fastJwt.fastJwtStrings.x5u
import typings.node.bufferMod.global.Buffer
import typings.std.Error
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDecoder(): js.Function1[/* token */ String | Buffer, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoder")().asInstanceOf[js.Function1[/* token */ String | Buffer, Any]]
  inline def createDecoder(options: PartialDecoderOptions): js.Function1[/* token */ String | Buffer, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoder")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* token */ String | Buffer, Any]]
  
  inline def createSigner(): js.Function1[/* payload */ String | Buffer | StringDictionary[Any], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSigner")().asInstanceOf[js.Function1[/* payload */ String | Buffer | StringDictionary[Any], String]]
  inline def createSigner(options: PartialSignerOptionskeyKe): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createSigner")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def createSigner(options: PartialSignerOptionskeyst): js.Function1[/* payload */ String | Buffer | StringDictionary[Any], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSigner")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* payload */ String | Buffer | StringDictionary[Any], String]]
  
  inline def createSigner_FnCall(): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createSigner")().asInstanceOf[FnCall]
  
  inline def createVerifier(): js.Function1[/* token */ String | Buffer, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerifier")().asInstanceOf[js.Function1[/* token */ String | Buffer, Any]]
  inline def createVerifier(options: PartialVerifierOptionskey): js.Function1[/* token */ String | Buffer, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerifier")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* token */ String | Buffer, Any]]
  inline def createVerifier(options: PartialVerifierOptionskeyAlgorithms): FnCallTokenCb = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerifier")(options.asInstanceOf[js.Any]).asInstanceOf[FnCallTokenCb]
  
  inline def createVerifier_FnCallTokenCb(): FnCallTokenCb = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerifier")().asInstanceOf[FnCallTokenCb]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastJwt.fastJwtStrings.none
    - typings.fastJwt.fastJwtStrings.HS256
    - typings.fastJwt.fastJwtStrings.HS384
    - typings.fastJwt.fastJwtStrings.HS512
    - typings.fastJwt.fastJwtStrings.ES256
    - typings.fastJwt.fastJwtStrings.ES384
    - typings.fastJwt.fastJwtStrings.ES512
    - typings.fastJwt.fastJwtStrings.RS256
    - typings.fastJwt.fastJwtStrings.RS384
    - typings.fastJwt.fastJwtStrings.RS512
    - typings.fastJwt.fastJwtStrings.PS256
    - typings.fastJwt.fastJwtStrings.PS384
    - typings.fastJwt.fastJwtStrings.PS512
    - typings.fastJwt.fastJwtStrings.EdDSA
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def ES256: typings.fastJwt.fastJwtStrings.ES256 = "ES256".asInstanceOf[typings.fastJwt.fastJwtStrings.ES256]
    
    inline def ES384: typings.fastJwt.fastJwtStrings.ES384 = "ES384".asInstanceOf[typings.fastJwt.fastJwtStrings.ES384]
    
    inline def ES512: typings.fastJwt.fastJwtStrings.ES512 = "ES512".asInstanceOf[typings.fastJwt.fastJwtStrings.ES512]
    
    inline def EdDSA: typings.fastJwt.fastJwtStrings.EdDSA = "EdDSA".asInstanceOf[typings.fastJwt.fastJwtStrings.EdDSA]
    
    inline def HS256: typings.fastJwt.fastJwtStrings.HS256 = "HS256".asInstanceOf[typings.fastJwt.fastJwtStrings.HS256]
    
    inline def HS384: typings.fastJwt.fastJwtStrings.HS384 = "HS384".asInstanceOf[typings.fastJwt.fastJwtStrings.HS384]
    
    inline def HS512: typings.fastJwt.fastJwtStrings.HS512 = "HS512".asInstanceOf[typings.fastJwt.fastJwtStrings.HS512]
    
    inline def PS256: typings.fastJwt.fastJwtStrings.PS256 = "PS256".asInstanceOf[typings.fastJwt.fastJwtStrings.PS256]
    
    inline def PS384: typings.fastJwt.fastJwtStrings.PS384 = "PS384".asInstanceOf[typings.fastJwt.fastJwtStrings.PS384]
    
    inline def PS512: typings.fastJwt.fastJwtStrings.PS512 = "PS512".asInstanceOf[typings.fastJwt.fastJwtStrings.PS512]
    
    inline def RS256: typings.fastJwt.fastJwtStrings.RS256 = "RS256".asInstanceOf[typings.fastJwt.fastJwtStrings.RS256]
    
    inline def RS384: typings.fastJwt.fastJwtStrings.RS384 = "RS384".asInstanceOf[typings.fastJwt.fastJwtStrings.RS384]
    
    inline def RS512: typings.fastJwt.fastJwtStrings.RS512 = "RS512".asInstanceOf[typings.fastJwt.fastJwtStrings.RS512]
    
    inline def none: typings.fastJwt.fastJwtStrings.none = "none".asInstanceOf[typings.fastJwt.fastJwtStrings.none]
  }
  
  trait DecoderOptions extends StObject {
    
    var checkTyp: String
    
    var complete: Boolean
  }
  object DecoderOptions {
    
    inline def apply(checkTyp: String, complete: Boolean): DecoderOptions = {
      val __obj = js.Dynamic.literal(checkTyp = checkTyp.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecoderOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckTyp(value: String): Self = StObject.set(x, "checkTyp", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    }
  }
  
  trait JwtHeader extends StObject {
    
    var alg: String | Algorithm
    
    var crit: js.UndefOr[
        js.Array[
          String | (Exclude[
            alg | typ | cty | typings.fastJwt.fastJwtStrings.crit | kid | jku | x5u | x5tNumbersignS256 | x5t | x5c, 
            typings.fastJwt.fastJwtStrings.crit
          ])
        ]
      ] = js.undefined
    
    var cty: js.UndefOr[String] = js.undefined
    
    var jku: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[String] = js.undefined
    
    var x5c: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var x5t: js.UndefOr[String] = js.undefined
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.undefined
    
    var x5u: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object JwtHeader {
    
    inline def apply(alg: String | Algorithm): JwtHeader = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtHeader] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: String | Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setCrit(
        value: js.Array[
              String | (Exclude[alg | typ | cty | crit | kid | jku | x5u | x5tNumbersignS256 | x5t | x5c, crit])
            ]
      ): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCritVarargs(
        value: (String | (Exclude[alg | typ | cty | crit | kid | jku | x5u | x5tNumbersignS256 | x5t | x5c, crit]))*
      ): Self = StObject.set(x, "crit", js.Array(value*))
      
      inline def setCty(value: String): Self = StObject.set(x, "cty", value.asInstanceOf[js.Any])
      
      inline def setCtyUndefined: Self = StObject.set(x, "cty", js.undefined)
      
      inline def setJku(value: String): Self = StObject.set(x, "jku", value.asInstanceOf[js.Any])
      
      inline def setJkuUndefined: Self = StObject.set(x, "jku", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
      
      inline def setX5c(value: String | js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
      
      inline def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
      
      inline def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value*))
      
      inline def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
      
      inline def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      inline def setX5u(value: String | js.Array[String]): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      inline def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
      
      inline def setX5uVarargs(value: String*): Self = StObject.set(x, "x5u", js.Array(value*))
    }
  }
  
  type KeyFetcher = (js.Function1[/* header */ StringDictionary[Any], js.Promise[String | Buffer]]) | (js.Function2[
    /* header */ StringDictionary[Any], 
    /* cb */ js.Function2[/* err */ js.Error | TokenError | Null, /* key */ String | Buffer, Unit], 
    Unit
  ])
  
  trait PrivateKey extends StObject {
    
    var key: String | Buffer
    
    var passphrase: js.UndefOr[String] = js.undefined
  }
  object PrivateKey {
    
    inline def apply(key: String | Buffer): PrivateKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  type SignerCallback = js.Function2[/* e */ js.Error | TokenError | Null, /* token */ String, Unit]
  
  trait SignerOptions extends StObject {
    
    var algorithm: Algorithm
    
    var aud: String
    
    var clockTimestamp: Double
    
    var expiresIn: Double
    
    var header: JwtHeader
    
    var iss: String
    
    var jti: String
    
    var kid: String
    
    var mutatePayload: Boolean
    
    var noTimestamp: Boolean
    
    var nonce: String
    
    var notBefore: Double
    
    var sub: String
  }
  object SignerOptions {
    
    inline def apply(
      algorithm: Algorithm,
      aud: String,
      clockTimestamp: Double,
      expiresIn: Double,
      header: JwtHeader,
      iss: String,
      jti: String,
      kid: String,
      mutatePayload: Boolean,
      noTimestamp: Boolean,
      nonce: String,
      notBefore: Double,
      sub: String
    ): SignerOptions = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], clockTimestamp = clockTimestamp.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], mutatePayload = mutatePayload.asInstanceOf[js.Any], noTimestamp = noTimestamp.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignerOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: JwtHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setMutatePayload(value: Boolean): Self = StObject.set(x, "mutatePayload", value.asInstanceOf[js.Any])
      
      inline def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenError
    extends StObject
       with Error
       with /* key */ StringDictionary[Any] {
    
    var code: String
  }
  object TokenError {
    
    inline def apply(code: String, message: String, name: String): TokenError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifierCallback = js.Function2[/* e */ js.Error | TokenError | Null, /* payload */ Any, Unit]
  
  trait VerifierOptions extends StObject {
    
    var algorithms: js.Array[Algorithm]
    
    var allowedAud: String | js.RegExp | (js.Array[String | js.RegExp])
    
    var allowedIss: String | js.RegExp | (js.Array[String | js.RegExp])
    
    var allowedJti: String | js.RegExp | (js.Array[String | js.RegExp])
    
    var allowedNonce: String | js.RegExp | (js.Array[String | js.RegExp])
    
    var allowedSub: String | js.RegExp | (js.Array[String | js.RegExp])
    
    var cache: Boolean | Double
    
    var cacheTTL: Double
    
    var clockTimestamp: Double
    
    var clockTolerance: Double
    
    var complete: Boolean
    
    var ignoreExpiration: Boolean
    
    var ignoreNotBefore: Boolean
    
    var maxAge: Double
  }
  object VerifierOptions {
    
    inline def apply(
      algorithms: js.Array[Algorithm],
      allowedAud: String | js.RegExp | (js.Array[String | js.RegExp]),
      allowedIss: String | js.RegExp | (js.Array[String | js.RegExp]),
      allowedJti: String | js.RegExp | (js.Array[String | js.RegExp]),
      allowedNonce: String | js.RegExp | (js.Array[String | js.RegExp]),
      allowedSub: String | js.RegExp | (js.Array[String | js.RegExp]),
      cache: Boolean | Double,
      cacheTTL: Double,
      clockTimestamp: Double,
      clockTolerance: Double,
      complete: Boolean,
      ignoreExpiration: Boolean,
      ignoreNotBefore: Boolean,
      maxAge: Double
    ): VerifierOptions = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], allowedAud = allowedAud.asInstanceOf[js.Any], allowedIss = allowedIss.asInstanceOf[js.Any], allowedJti = allowedJti.asInstanceOf[js.Any], allowedNonce = allowedNonce.asInstanceOf[js.Any], allowedSub = allowedSub.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheTTL = cacheTTL.asInstanceOf[js.Any], clockTimestamp = clockTimestamp.asInstanceOf[js.Any], clockTolerance = clockTolerance.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], ignoreExpiration = ignoreExpiration.asInstanceOf[js.Any], ignoreNotBefore = ignoreNotBefore.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifierOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifierOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowedAud(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedAud", value.asInstanceOf[js.Any])
      
      inline def setAllowedAudVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedAud", js.Array(value*))
      
      inline def setAllowedIss(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedIss", value.asInstanceOf[js.Any])
      
      inline def setAllowedIssVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedIss", js.Array(value*))
      
      inline def setAllowedJti(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedJti", value.asInstanceOf[js.Any])
      
      inline def setAllowedJtiVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedJti", js.Array(value*))
      
      inline def setAllowedNonce(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedNonce", value.asInstanceOf[js.Any])
      
      inline def setAllowedNonceVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedNonce", js.Array(value*))
      
      inline def setAllowedSub(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "allowedSub", value.asInstanceOf[js.Any])
      
      inline def setAllowedSubVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowedSub", js.Array(value*))
      
      inline def setCache(value: Boolean | Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheTTL(value: Double): Self = StObject.set(x, "cacheTTL", value.asInstanceOf[js.Any])
      
      inline def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    }
  }
}
