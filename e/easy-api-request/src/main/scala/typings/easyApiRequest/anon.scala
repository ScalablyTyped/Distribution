package typings.easyApiRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cb extends StObject {
    
    var cb: js.Any = js.native
    
    var opts: js.Any = js.native
  }
  object Cb {
    
    @scala.inline
    def apply(cb: js.Any, opts: js.Any): Cb = {
      val __obj = js.Dynamic.literal(cb = cb.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cb]
    }
    
    @scala.inline
    implicit class CbMutableBuilder[Self <: Cb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCb(value: js.Any): Self = StObject.set(x, "cb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: js.Any): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var config: Cookies = js.native
    
    var name: js.Any = js.native
  }
  object Config {
    
    @scala.inline
    def apply(config: Cookies, name: js.Any): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Cookies): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cookies extends StObject {
    
    var cookies: js.UndefOr[js.Array[String]] = js.native
    
    var headers: js.UndefOr[js.Array[String]] = js.native
    
    var internal: js.UndefOr[Boolean] = js.native
    
    var jSend: js.UndefOr[Boolean] = js.native
    
    var opts: js.UndefOr[js.Object] = js.native
    
    var replyCookies: js.UndefOr[js.Array[String]] = js.native
    
    var url: String = js.native
  }
  object Cookies {
    
    @scala.inline
    def apply(url: String): Cookies = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookies]
    }
    
    @scala.inline
    implicit class CookiesMutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      @scala.inline
      def setJSend(value: Boolean): Self = StObject.set(x, "jSend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSendUndefined: Self = StObject.set(x, "jSend", js.undefined)
      
      @scala.inline
      def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      @scala.inline
      def setReplyCookies(value: js.Array[String]): Self = StObject.set(x, "replyCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyCookiesUndefined: Self = StObject.set(x, "replyCookies", js.undefined)
      
      @scala.inline
      def setReplyCookiesVarargs(value: String*): Self = StObject.set(x, "replyCookies", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
