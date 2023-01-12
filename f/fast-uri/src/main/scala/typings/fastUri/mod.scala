package typings.fastUri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equal(uriA: String, uriB: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(uriA.asInstanceOf[js.Any], uriB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(uri: String): URIComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[URIComponents]
  inline def parse(uri: String, opts: options): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  
  inline def resolve(base: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(base.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serialize(component: URIComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(component: URIComponents, opts: options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(component.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait URIComponents extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double | String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var userinfo: js.UndefOr[String] = js.undefined
  }
  object URIComponents {
    
    inline def apply(): URIComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URIComponents] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setUserinfo(value: String): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    }
  }
  
  trait options extends StObject {
    
    var absolutePath: js.UndefOr[Boolean] = js.undefined
    
    var domainHost: js.UndefOr[Boolean] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
    
    var unicodeSupport: js.UndefOr[Boolean] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      inline def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setDomainHost(value: Boolean): Self = StObject.set(x, "domainHost", value.asInstanceOf[js.Any])
      
      inline def setDomainHostUndefined: Self = StObject.set(x, "domainHost", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      inline def setUnicodeSupport(value: Boolean): Self = StObject.set(x, "unicodeSupport", value.asInstanceOf[js.Any])
      
      inline def setUnicodeSupportUndefined: Self = StObject.set(x, "unicodeSupport", js.undefined)
    }
  }
}
