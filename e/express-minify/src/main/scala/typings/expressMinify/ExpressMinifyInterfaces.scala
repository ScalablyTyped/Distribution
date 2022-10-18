package typings.expressMinify

import typings.node.NodeRequire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExpressMinifyInterfaces {
  
  trait ExpressMinifyOptions extends StObject {
    
    /**
      * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
      */
    var cache: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Matches CoffeeScript content-type.
      */
    var coffee_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Matches CSS content-type.
      */
    var css_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Customize cssmin instance (require('cssmin')).
      */
    var cssmin: js.UndefOr[NodeRequire] = js.undefined
    
    /**
      * Matches JavaScript content-type.
      */
    var js_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Matches JSON content-type.
      */
    var json_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Matches LESS content-type.
      */
    var less_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
      */
    var onerror: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Matches SASS content-type.
      */
    var sass_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Matches Stylus content-type.
      */
    var stylus_match: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Customize UglifyJS instance (require('uglify-js')).
      */
    var uglifyJS: js.UndefOr[NodeRequire] = js.undefined
  }
  object ExpressMinifyOptions {
    
    inline def apply(): ExpressMinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressMinifyOptions]
    }
    
    extension [Self <: ExpressMinifyOptions](x: Self) {
      
      inline def setCache(value: String | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCoffee_match(value: js.RegExp): Self = StObject.set(x, "coffee_match", value.asInstanceOf[js.Any])
      
      inline def setCoffee_matchUndefined: Self = StObject.set(x, "coffee_match", js.undefined)
      
      inline def setCss_match(value: js.RegExp): Self = StObject.set(x, "css_match", value.asInstanceOf[js.Any])
      
      inline def setCss_matchUndefined: Self = StObject.set(x, "css_match", js.undefined)
      
      inline def setCssmin(value: NodeRequire): Self = StObject.set(x, "cssmin", value.asInstanceOf[js.Any])
      
      inline def setCssminUndefined: Self = StObject.set(x, "cssmin", js.undefined)
      
      inline def setJs_match(value: js.RegExp): Self = StObject.set(x, "js_match", value.asInstanceOf[js.Any])
      
      inline def setJs_matchUndefined: Self = StObject.set(x, "js_match", js.undefined)
      
      inline def setJson_match(value: js.RegExp): Self = StObject.set(x, "json_match", value.asInstanceOf[js.Any])
      
      inline def setJson_matchUndefined: Self = StObject.set(x, "json_match", js.undefined)
      
      inline def setLess_match(value: js.RegExp): Self = StObject.set(x, "less_match", value.asInstanceOf[js.Any])
      
      inline def setLess_matchUndefined: Self = StObject.set(x, "less_match", js.undefined)
      
      inline def setOnerror(value: js.Function): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setSass_match(value: js.RegExp): Self = StObject.set(x, "sass_match", value.asInstanceOf[js.Any])
      
      inline def setSass_matchUndefined: Self = StObject.set(x, "sass_match", js.undefined)
      
      inline def setStylus_match(value: js.RegExp): Self = StObject.set(x, "stylus_match", value.asInstanceOf[js.Any])
      
      inline def setStylus_matchUndefined: Self = StObject.set(x, "stylus_match", js.undefined)
      
      inline def setUglifyJS(value: NodeRequire): Self = StObject.set(x, "uglifyJS", value.asInstanceOf[js.Any])
      
      inline def setUglifyJSUndefined: Self = StObject.set(x, "uglifyJS", js.undefined)
    }
  }
  
  trait ExpressMinifyResponse extends StObject {
    
    /**
      * Pass true to disable caching the response data, suitable for dynamic contents.
      */
    var _no_cache: Boolean
    
    /**
      * Pass true to disable minifying, suitable for already-minified contents.
      */
    var _no_minify: Boolean
    
    /**
      * Pass true to disable all kind of processing: no compiling, no minifying.
      */
    var _skip: Boolean
    
    /**
      * Pass an object to specify custom UglifyJS compressor options (pass false to skip).
      */
    var _uglifyCompress: js.Object | Boolean
    
    /**
      * Pass false to disable mangling names
      */
    var _uglifyMangle: Boolean
    
    /**
      * Pass an object if you wish to specify additional UglifyJS
      */
    var _uglifyOutput: js.Object
  }
  object ExpressMinifyResponse {
    
    inline def apply(
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
    
    extension [Self <: ExpressMinifyResponse](x: Self) {
      
      inline def set_no_cache(value: Boolean): Self = StObject.set(x, "_no_cache", value.asInstanceOf[js.Any])
      
      inline def set_no_minify(value: Boolean): Self = StObject.set(x, "_no_minify", value.asInstanceOf[js.Any])
      
      inline def set_skip(value: Boolean): Self = StObject.set(x, "_skip", value.asInstanceOf[js.Any])
      
      inline def set_uglifyCompress(value: js.Object | Boolean): Self = StObject.set(x, "_uglifyCompress", value.asInstanceOf[js.Any])
      
      inline def set_uglifyMangle(value: Boolean): Self = StObject.set(x, "_uglifyMangle", value.asInstanceOf[js.Any])
      
      inline def set_uglifyOutput(value: js.Object): Self = StObject.set(x, "_uglifyOutput", value.asInstanceOf[js.Any])
    }
  }
}
