package typings.getUrls

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-urls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  inline def default(text: String, options: Options): Set[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Set[String]]
  
  trait Options
    extends StObject
       with typings.normalizeUrl.mod.Options {
    
    /**
    	Exclude URLs that match URLs in the given array.
    	@default []
    	*/
    val exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	Extract URLs that appear as query parameters in the found URLs.
    	@default false
    	*/
    val extractFromQueryString: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Require URLs to have a scheme or leading `www.` to be considered an URL. When `false`, matches against a list of valid TLDs, so it will match URLs like `unicorn.education`.
    	Does not affect URLs in query parameters if using the `extractFromQueryString` option.
    	@default false
    	*/
    val requireSchemeOrWww: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtractFromQueryString(value: Boolean): Self = StObject.set(x, "extractFromQueryString", value.asInstanceOf[js.Any])
      
      inline def setExtractFromQueryStringUndefined: Self = StObject.set(x, "extractFromQueryString", js.undefined)
      
      inline def setRequireSchemeOrWww(value: Boolean): Self = StObject.set(x, "requireSchemeOrWww", value.asInstanceOf[js.Any])
      
      inline def setRequireSchemeOrWwwUndefined: Self = StObject.set(x, "requireSchemeOrWww", js.undefined)
    }
  }
}
