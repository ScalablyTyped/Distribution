package typings.getUrls

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get all URLs in a string.
  The URLs will be [normalized](https://github.com/sindresorhus/normalize-url).
  @returns A `Set` of URLs.
  @example
  ```
  import getUrls = require('get-urls');
  const text = 'Lorem ipsum dolor sit amet, //sindresorhus.com consectetuer adipiscing http://yeoman.io elit.';
  getUrls(text);
  //=> Set {'http://sindresorhus.com', 'http://yeoman.io'}
  ```
  */
  @JSImport("get-urls", JSImport.Namespace)
  @js.native
  def apply(text: String): Set[String] = js.native
  @JSImport("get-urls", JSImport.Namespace)
  @js.native
  def apply(text: String, options: Options): Set[String] = js.native
  
  @js.native
  trait Options
    extends typings.normalizeUrl.mod.Options {
    
    /**
    		Exclude URLs that match URLs in the given array.
    		@default []
    		*/
    val exclude: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Extract URLs that appear as query parameters in the found URLs.
    		@default false
    		*/
    val extractFromQueryString: js.UndefOr[Boolean] = js.native
    
    /**
    		Require URLs to have a scheme or leading `www.` to be considered an URL. When `false`, matches against a list of valid TLDs, so it will match URLs like `unicorn.education`.
    		Does not affect URLs in query parameters if using the `extractFromQueryString` option.
    		@default true
    		*/
    val requireSchemeOrWww: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExtractFromQueryString(value: Boolean): Self = StObject.set(x, "extractFromQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractFromQueryStringUndefined: Self = StObject.set(x, "extractFromQueryString", js.undefined)
      
      @scala.inline
      def setRequireSchemeOrWww(value: Boolean): Self = StObject.set(x, "requireSchemeOrWww", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireSchemeOrWwwUndefined: Self = StObject.set(x, "requireSchemeOrWww", js.undefined)
    }
  }
}
