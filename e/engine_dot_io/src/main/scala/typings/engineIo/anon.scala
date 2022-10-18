package typings.engineIo

import typings.engineIo.buildTransportsPollingMod.Polling
import typings.engineIo.engineIoBooleans.`false`
import typings.engineIo.engineIoBooleans.`true`
import typings.engineIo.engineIoStrings.high
import typings.engineIo.engineIoStrings.lax
import typings.engineIo.engineIoStrings.low
import typings.engineIo.engineIoStrings.medium
import typings.engineIo.engineIoStrings.none
import typings.engineIo.engineIoStrings.strict
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `0`: String
    
    var `1`: String
    
    var `2`: String
    
    var `3`: String
    
    var `4`: String
    
    var `5`: String
  }
  object `0` {
    
    inline def apply(`0`: String, `1`: String, `2`: String, `3`: String, `4`: String, `5`: String): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    }
  }
  
  trait BADHANDSHAKEMETHOD extends StObject {
    
    var BAD_HANDSHAKE_METHOD: Double
    
    var BAD_REQUEST: Double
    
    var FORBIDDEN: Double
    
    var UNKNOWN_SID: Double
    
    var UNKNOWN_TRANSPORT: Double
    
    var UNSUPPORTED_PROTOCOL_VERSION: Double
  }
  object BADHANDSHAKEMETHOD {
    
    inline def apply(
      BAD_HANDSHAKE_METHOD: Double,
      BAD_REQUEST: Double,
      FORBIDDEN: Double,
      UNKNOWN_SID: Double,
      UNKNOWN_TRANSPORT: Double,
      UNSUPPORTED_PROTOCOL_VERSION: Double
    ): BADHANDSHAKEMETHOD = {
      val __obj = js.Dynamic.literal(BAD_HANDSHAKE_METHOD = BAD_HANDSHAKE_METHOD.asInstanceOf[js.Any], BAD_REQUEST = BAD_REQUEST.asInstanceOf[js.Any], FORBIDDEN = FORBIDDEN.asInstanceOf[js.Any], UNKNOWN_SID = UNKNOWN_SID.asInstanceOf[js.Any], UNKNOWN_TRANSPORT = UNKNOWN_TRANSPORT.asInstanceOf[js.Any], UNSUPPORTED_PROTOCOL_VERSION = UNSUPPORTED_PROTOCOL_VERSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[BADHANDSHAKEMETHOD]
    }
    
    extension [Self <: BADHANDSHAKEMETHOD](x: Self) {
      
      inline def setBAD_HANDSHAKE_METHOD(value: Double): Self = StObject.set(x, "BAD_HANDSHAKE_METHOD", value.asInstanceOf[js.Any])
      
      inline def setBAD_REQUEST(value: Double): Self = StObject.set(x, "BAD_REQUEST", value.asInstanceOf[js.Any])
      
      inline def setFORBIDDEN(value: Double): Self = StObject.set(x, "FORBIDDEN", value.asInstanceOf[js.Any])
      
      inline def setUNKNOWN_SID(value: Double): Self = StObject.set(x, "UNKNOWN_SID", value.asInstanceOf[js.Any])
      
      inline def setUNKNOWN_TRANSPORT(value: Double): Self = StObject.set(x, "UNKNOWN_TRANSPORT", value.asInstanceOf[js.Any])
      
      inline def setUNSUPPORTED_PROTOCOL_VERSION(value: Double): Self = StObject.set(x, "UNSUPPORTED_PROTOCOL_VERSION", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cleanup extends StObject {
    
    var cleanup: js.Function
  }
  object Cleanup {
    
    inline def apply(cleanup: js.Function): Cleanup = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cleanup]
    }
    
    extension [Self <: Cleanup](x: Self) {
      
      inline def setCleanup(value: js.Function): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined cookie.cookie.CookieSerializeOptions & {  name :string} */
  trait CookieSerializeOptionsnam extends StObject {
    
    /**
      * Specifies the value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.3|Domain Set-Cookie attribute}. By default, no
      * domain is set, and most clients will consider the cookie to apply to only
      * the current domain.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a function that will be used to encode a cookie's value. Since
      * value of a cookie has a limited character set (and must be a simple
      * string), this function can be used to encode a value into a string suited
      * for a cookie's value.
      *
      * The default function is the global `encodeURIComponent`, which will
      * encode a JavaScript string into UTF-8 byte sequences and then URL-encode
      * any that fall outside of the cookie range.
      */
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * Specifies the `Date` object to be the value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.1|`Expires` `Set-Cookie` attribute}. By default,
      * no expiration is set, and most clients will consider this a "non-persistent cookie" and will delete
      * it on a condition like exiting a web browser application.
      *
      * *Note* the {@link https://tools.ietf.org/html/rfc6265#section-5.3|cookie storage model specification}
      * states that if both `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
      * possible not all clients by obey this, so if both are set, they should
      * point to the same date and time.
      */
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Specifies the boolean value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.6|`HttpOnly` `Set-Cookie` attribute}.
      * When truthy, the `HttpOnly` attribute is set, otherwise it is not. By
      * default, the `HttpOnly` attribute is not set.
      *
      * *Note* be careful when setting this to true, as compliant clients will
      * not allow client-side JavaScript to see the cookie in `document.cookie`.
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the number (in seconds) to be the value for the `Max-Age`
      * `Set-Cookie` attribute. The given number will be converted to an integer
      * by rounding down. By default, no maximum age is set.
      *
      * *Note* the {@link https://tools.ietf.org/html/rfc6265#section-5.3|cookie storage model specification}
      * states that if both `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
      * possible not all clients by obey this, so if both are set, they should
      * point to the same date and time.
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    /**
      * Specifies the value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.4|`Path` `Set-Cookie` attribute}.
      * By default, the path is considered the "default path".
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the `string` to be the value for the [`Priority` `Set-Cookie` attribute][rfc-west-cookie-priority-00-4.1].
      *
      * - `'low'` will set the `Priority` attribute to `Low`.
      * - `'medium'` will set the `Priority` attribute to `Medium`, the default priority when not set.
      * - `'high'` will set the `Priority` attribute to `High`.
      *
      * More information about the different priority levels can be found in
      * [the specification][rfc-west-cookie-priority-00-4.1].
      *
      * **note** This is an attribute that has not yet been fully standardized, and may change in the future.
      * This also means many clients may ignore this attribute until they understand it.
      */
    var priority: js.UndefOr[low | medium | high] = js.undefined
    
    /**
      * Specifies the boolean or string to be the value for the {@link https://tools.ietf.org/html/draft-ietf-httpbis-rfc6265bis-03#section-4.1.2.7|`SameSite` `Set-Cookie` attribute}.
      *
      * - `true` will set the `SameSite` attribute to `Strict` for strict same
      * site enforcement.
      * - `false` will not set the `SameSite` attribute.
      * - `'lax'` will set the `SameSite` attribute to Lax for lax same site
      * enforcement.
      * - `'strict'` will set the `SameSite` attribute to Strict for strict same
      * site enforcement.
      *  - `'none'` will set the SameSite attribute to None for an explicit
      *  cross-site cookie.
      *
      * More information about the different enforcement levels can be found in {@link https://tools.ietf.org/html/draft-ietf-httpbis-rfc6265bis-03#section-4.1.2.7|the specification}.
      *
      * *note* This is an attribute that has not yet been fully standardized, and may change in the future. This also means many clients may ignore this attribute until they understand it.
      */
    var sameSite: js.UndefOr[`true` | `false` | lax | strict | none] = js.undefined
    
    /**
      * Specifies the boolean value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.5|`Secure` `Set-Cookie` attribute}. When truthy, the
      * `Secure` attribute is set, otherwise it is not. By default, the `Secure` attribute is not set.
      *
      * *Note* be careful when setting this to `true`, as compliant clients will
      * not send the cookie back to the server in the future if the browser does
      * not have an HTTPS connection.
      */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieSerializeOptionsnam {
    
    inline def apply(name: String): CookieSerializeOptionsnam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieSerializeOptionsnam]
    }
    
    extension [Self <: CookieSerializeOptionsnam](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPriority(value: low | medium | high): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSameSite(value: `true` | `false` | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: Buffer
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: Buffer, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataType extends StObject {
    
    var data: Unit
    
    var `type`: String
  }
  object DataType {
    
    inline def apply(data: Unit, `type`: String): DataType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataType]
    }
    
    extension [Self <: DataType](x: Self) {
      
      inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Res extends StObject {
    
    var res: ServerResponse[IncomingMessage]
  }
  object Res {
    
    inline def apply(res: ServerResponse[IncomingMessage]): Res = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    extension [Self <: Res](x: Self) {
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var data: Any
    
    var `type`: String
  }
  object Type {
    
    inline def apply(data: Any, `type`: String): Type = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofpolling extends StObject {
    
    /**
      * Polling polymorphic constructor.
      *
      * @api private
      */
    def apply(req: Any): Polling = js.native
    
    var upgradesTo: js.Array[String] = js.native
  }
}
