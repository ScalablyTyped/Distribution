package typings.easyApiRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cb extends StObject {
    
    var cb: js.Any
    
    var opts: js.Any
  }
  object Cb {
    
    inline def apply(cb: js.Any, opts: js.Any): Cb = {
      val __obj = js.Dynamic.literal(cb = cb.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cb]
    }
    
    extension [Self <: Cb](x: Self) {
      
      inline def setCb(value: js.Any): Self = StObject.set(x, "cb", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: js.Any): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var config: Cookies
    
    var name: js.Any
  }
  object Config {
    
    inline def apply(config: Cookies, name: js.Any): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: Cookies): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cookies extends StObject {
    
    var cookies: js.UndefOr[js.Array[String]] = js.undefined
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var internal: js.UndefOr[Boolean] = js.undefined
    
    var jSend: js.UndefOr[Boolean] = js.undefined
    
    var opts: js.UndefOr[js.Object] = js.undefined
    
    var replyCookies: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: String
  }
  object Cookies {
    
    inline def apply(url: String): Cookies = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookies]
    }
    
    extension [Self <: Cookies](x: Self) {
      
      inline def setCookies(value: js.Array[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCookiesVarargs(value: String*): Self = StObject.set(x, "cookies", js.Array(value :_*))
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setJSend(value: Boolean): Self = StObject.set(x, "jSend", value.asInstanceOf[js.Any])
      
      inline def setJSendUndefined: Self = StObject.set(x, "jSend", js.undefined)
      
      inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setReplyCookies(value: js.Array[String]): Self = StObject.set(x, "replyCookies", value.asInstanceOf[js.Any])
      
      inline def setReplyCookiesUndefined: Self = StObject.set(x, "replyCookies", js.undefined)
      
      inline def setReplyCookiesVarargs(value: String*): Self = StObject.set(x, "replyCookies", js.Array(value :_*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
