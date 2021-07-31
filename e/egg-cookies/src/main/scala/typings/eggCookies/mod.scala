package typings.eggCookies

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("egg-cookies", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with EggCookies {
    def this(ctx: js.Any) = this()
    def this(ctx: js.Any, keys: js.Any) = this()
    def this(ctx: Unit, keys: js.Any) = this()
  }
  
  trait CookieGetOptions extends StObject {
    
    /**
      * Encrypt the cookie's value or not (The default value is false).
      */
    var encrypt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to sign or not (The default value is true).
      */
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object CookieGetOptions {
    
    @scala.inline
    def apply(): CookieGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieGetOptions]
    }
    
    @scala.inline
    implicit class CookieGetOptionsMutableBuilder[Self <: CookieGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  trait CookieSetOptions extends StObject {
    
    /**
      * The domain for the cookie
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Encrypt the cookie's value or not
      */
    var encrypt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expire time
      */
    var expires: js.UndefOr[Date] = js.undefined
    
    /**
      * Is for http only
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max age for browsers
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Is overridable
      */
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path for the cookie to be set in
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Is the same site
      */
    var sameSite: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Encrypt the cookie's value or not
      */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is it signed or not.
      */
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object CookieSetOptions {
    
    @scala.inline
    def apply(): CookieSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSetOptions]
    }
    
    @scala.inline
    implicit class CookieSetOptionsMutableBuilder[Self <: CookieSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: Boolean | String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  @js.native
  trait EggCookies extends StObject {
    
    /**
      * Get the Egg's cookies by name with optional options.
      * @param name The Egg's cookie's unique name.
      * @param opts Optional. The options for cookie's getting.
      * @returns The cookie's value according to the specific name.
      */
    def get(name: String): String = js.native
    def get(name: String, opts: CookieGetOptions): String = js.native
    
    /**
      * Set the Egg's cookies by name with optional options.
      * @param name The Egg cookie's unique name.
      * @param value Optional. The Egg cookie's real value.
      * @param opts Optional. The options for cookie's setting.
      * @returns The current 'EggCookie' instance.
      */
    def set(name: String): this.type = js.native
    def set(name: String, value: String): this.type = js.native
    def set(name: String, value: String, opts: CookieSetOptions): this.type = js.native
    def set(name: String, value: Null, opts: CookieSetOptions): this.type = js.native
    def set(name: String, value: Unit, opts: CookieSetOptions): this.type = js.native
  }
}
