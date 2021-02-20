package typings.expressMinify

import typings.node.NodeRequire
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExpressMinifyInterfaces {
  
  @js.native
  trait ExpressMinifyOptions extends StObject {
    
    /**
      * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
      */
    var cache: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Matches CoffeeScript content-type.
      */
    var coffee_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Matches CSS content-type.
      */
    var css_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Customize cssmin instance (require('cssmin')).
      */
    var cssmin: js.UndefOr[NodeRequire] = js.native
    
    /**
      * Matches JavaScript content-type.
      */
    var js_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Matches JSON content-type.
      */
    var json_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Matches LESS content-type.
      */
    var less_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
      */
    var onerror: js.UndefOr[js.Function] = js.native
    
    /**
      * Matches SASS content-type.
      */
    var sass_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Matches Stylus content-type.
      */
    var stylus_match: js.UndefOr[RegExp] = js.native
    
    /**
      * Customize UglifyJS instance (require('uglify-js')).
      */
    var uglifyJS: js.UndefOr[NodeRequire] = js.native
  }
  object ExpressMinifyOptions {
    
    @scala.inline
    def apply(): ExpressMinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressMinifyOptions]
    }
    
    @scala.inline
    implicit class ExpressMinifyOptionsMutableBuilder[Self <: ExpressMinifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: String | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCoffee_match(value: RegExp): Self = StObject.set(x, "coffee_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoffee_matchUndefined: Self = StObject.set(x, "coffee_match", js.undefined)
      
      @scala.inline
      def setCss_match(value: RegExp): Self = StObject.set(x, "css_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCss_matchUndefined: Self = StObject.set(x, "css_match", js.undefined)
      
      @scala.inline
      def setCssmin(value: NodeRequire): Self = StObject.set(x, "cssmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssminUndefined: Self = StObject.set(x, "cssmin", js.undefined)
      
      @scala.inline
      def setJs_match(value: RegExp): Self = StObject.set(x, "js_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_matchUndefined: Self = StObject.set(x, "js_match", js.undefined)
      
      @scala.inline
      def setJson_match(value: RegExp): Self = StObject.set(x, "json_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson_matchUndefined: Self = StObject.set(x, "json_match", js.undefined)
      
      @scala.inline
      def setLess_match(value: RegExp): Self = StObject.set(x, "less_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLess_matchUndefined: Self = StObject.set(x, "less_match", js.undefined)
      
      @scala.inline
      def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setSass_match(value: RegExp): Self = StObject.set(x, "sass_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSass_matchUndefined: Self = StObject.set(x, "sass_match", js.undefined)
      
      @scala.inline
      def setStylus_match(value: RegExp): Self = StObject.set(x, "stylus_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylus_matchUndefined: Self = StObject.set(x, "stylus_match", js.undefined)
      
      @scala.inline
      def setUglifyJS(value: NodeRequire): Self = StObject.set(x, "uglifyJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUglifyJSUndefined: Self = StObject.set(x, "uglifyJS", js.undefined)
    }
  }
  
  @js.native
  trait ExpressMinifyResponse extends StObject {
    
    /**
      * Pass true to disable caching the response data, suitable for dynamic contents.
      */
    var _no_cache: Boolean = js.native
    
    /**
      * Pass true to disable minifying, suitable for already-minified contents.
      */
    var _no_minify: Boolean = js.native
    
    /**
      * Pass true to disable all kind of processing: no compiling, no minifying.
      */
    var _skip: Boolean = js.native
    
    /**
      * Pass an object to specify custom UglifyJS compressor options (pass false to skip).
      */
    var _uglifyCompress: js.Object | Boolean = js.native
    
    /**
      * Pass false to disable mangling names
      */
    var _uglifyMangle: Boolean = js.native
    
    /**
      * Pass an object if you wish to specify additional UglifyJS
      */
    var _uglifyOutput: js.Object = js.native
  }
  object ExpressMinifyResponse {
    
    @scala.inline
    def apply(
      _no_cache: Boolean,
      _no_minify: Boolean,
      _skip: Boolean,
      _uglifyCompress: js.Object | Boolean,
      _uglifyMangle: Boolean,
      _uglifyOutput: js.Object
    ): ExpressMinifyResponse = {
      val __obj = js.Dynamic.literal(_no_cache = _no_cache.asInstanceOf[js.Any], _no_minify = _no_minify.asInstanceOf[js.Any], _skip = _skip.asInstanceOf[js.Any], _uglifyCompress = _uglifyCompress.asInstanceOf[js.Any], _uglifyMangle = _uglifyMangle.asInstanceOf[js.Any], _uglifyOutput = _uglifyOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressMinifyResponse]
    }
    
    @scala.inline
    implicit class ExpressMinifyResponseMutableBuilder[Self <: ExpressMinifyResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_no_cache(value: Boolean): Self = StObject.set(x, "_no_cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_no_minify(value: Boolean): Self = StObject.set(x, "_no_minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_skip(value: Boolean): Self = StObject.set(x, "_skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_uglifyCompress(value: js.Object | Boolean): Self = StObject.set(x, "_uglifyCompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_uglifyMangle(value: Boolean): Self = StObject.set(x, "_uglifyMangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_uglifyOutput(value: js.Object): Self = StObject.set(x, "_uglifyOutput", value.asInstanceOf[js.Any])
    }
  }
}
