package typings.foldify

import org.scalablytyped.runtime.StringDictionary
import typings.foldify.anon.Call
import typings.foldify.foldifyStrings.`object`
import typings.foldify.foldifyStrings.array
import typings.foldify.foldifyStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Fold your folders, any way you like.
    *
    * Import / require folders of any filetypes; evaluate / curry the results.
    *
    * @example
    * import foldify = require("foldify");
    * import express = require('express');
    *
    * const routes = foldify(__dirname + "/lib/routes", { tree: true });
    * const app = express();
    *
    * // routes.errors.500:  (app) => { app.get(...) }
    * // routes.errors.501:  (app) => { app.get(...) }
    * // routes.index:       (app) => { app.get(...) }
    * // routes.user.login:  (app) => { app.get(...) }
    * // routes.user.logout: (app) => { app.get(...) }
    *
    * routes(app, {whitelist: "errors/ **"});
    * // just errors are now attached!
    *
    * routes(app);
    * // all routes are now attached!
    */
  inline def apply(toBeFolded: ToBeFolded): Call = ^.asInstanceOf[js.Dynamic].apply(toBeFolded.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def apply(toBeFolded: ToBeFolded, options: Options[string]): String = (^.asInstanceOf[js.Dynamic].apply(toBeFolded.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("foldify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[TOutput /* <: string | array | `object` */] extends StObject {
    
    /**
      * @default false
      *
      * Normally, when evaluated function returns undefined (as in the math example above), the function itself
      * will be placed back into the hash but with the supplied arguments curried:
      *
      * @example
      * import foldify = require("foldify");
      * const mathFuncs = foldify(__dirname + "/lib/mathFuncs");
      *
      * // To curry only, set 'evaluate' to false:
      * const curried = mathFuncs(1, {evaluate: false});
      *
      * const curried2 = curried([2, 3], {evaluate: false});
      *
      * curried()
      * // sum = 1
      *
      * curried2()
      * // sum = 6
      *
      * // If **allowUndefined** is `false`:
      *
      * const curried3 = curried2(10);
      * // sum = 16
      *
      * typeof curried3.mathFunc;
      * // function
      *
      * curried3()
      * // sum = 16
      *
      * const curried4 = curried3(20)
      * // sum = 36
      *
      * curried4()
      * // sum = 46
      *
      * // But if **allowUndefined** is `true`, functions may return undefined into the hash instead of a
      * // curried version of itself:
      *
      * const curried5 = curried2(10, {allowUndefined: true});
      * // sum = 16
      *
      * typeof curried5.mathFunc // undefined
      *
      * curried5()
      * // folding further will continue to produce `undefined`
      */
    var allowUndefined: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Uses [minimatch](https://github.com/isaacs/minimatch) upon filepaths using supplied blacklist patterns.
      * Supplied rules are prefixed by the curried directory. Reference
      * [minimatch](https://github.com/isaacs/minimatch) documentation for matching behavior.
      *
      * @example
      * import foldify = require("foldify");
      * const templates = foldify(__dirname + "/templates", { blacklist: ".json", recursive: true });
      * // will grab all files EXCEPT .json files
      */
    var blacklist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Change the encoding of files that are readFileSync'ed.
      *
      * @default 'utf-8'
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Set to false if you only want to curry the hash's functions, not evaluate them.
      *
      * @default true
      *
      * @example
      * // With a folder 'mathFuncs' with files like:
      *
      * module.exports = sum;
      * function sum() {
      *     const sum = [].slice.call(arguments, 0)
      *                   .reduce((prev, current) => (+prev || 0) + (+current || 0));
      *     console.log("sum = " + sum);
      * }
      *
      * // Main app:
      *
      * import foldify = require("foldify");
      * const mathFuncs = foldify(__dirname + "/lib/mathFuncs");
      *
      * // To curry only, set 'evaluate' to false:
      * const curried = mathFuncs(1, {evaluate: false});
      *
      * const curried2 = curried([2, 3], {evaluate: false});
      *
      * curried()
      * // sum = 1
      *
      * curried2()
      * // sum = 6
      */
    var evaluate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When generating the property names for the hash, this determines whether to use the full
      * filepath as the property name. This is defaulted to for cases of duplicate property names.
      *
      * A benefit of **fullPath** is more flexibility with minimatch white/black listing at evaluation.
      *
      * @default false
      */
    var fullPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When generating the property names for the hash, this determines whether to include extensions.
      * Manually setting this option will apply it to all filetypes.
      *
      * @default `false` for .js and .json, `true` for other file types
      */
    var includeExt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Import `.js` / `.json` files as strings rather than require them.
      *
      * @default false
      */
    var jsToString: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If string or array, all files will be `fs.readFileSync()`'d.
      *
      * @default 'object'
      */
    var output: js.UndefOr[TOutput] = js.undefined
    
    /**
      * Include subfolders.
      *
      * @default false
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include subfolders, and return hierarchical structure based on filepath.
      *
      * @default false
      */
    var tree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If a function or property evaluates to undefined, or is blacklisted / outside of whitelist, then remove it.
      *
      * @default false
      */
    var trim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Uses [minimatch](https://github.com/isaacs/minimatch) upon filepaths using supplied whitelist
      * patterns, supplied rules are prefixed with the curried directory. Reference
      * [minimatch](https://github.com/isaacs/minimatch) documentation for matching behavior.
      *
      * @example
      * import foldify = require("foldify");
      * const stylesAndHtml = foldify(__dirname + "/client", { whitelist: ["*.less, *.html"], recursive: true });
      * // will grab all .less and .html files into hash, as strings
      */
    var whitelist: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply[TOutput /* <: string | array | `object` */](): Options[TOutput] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TOutput]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], TOutput /* <: string | array | `object` */] (val x: Self & Options[TOutput]) extends AnyVal {
      
      inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefinedUndefined: Self = StObject.set(x, "allowUndefined", js.undefined)
      
      inline def setBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEvaluate(value: Boolean): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      inline def setFullPath(value: Boolean): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
      
      inline def setIncludeExt(value: Boolean): Self = StObject.set(x, "includeExt", value.asInstanceOf[js.Any])
      
      inline def setIncludeExtUndefined: Self = StObject.set(x, "includeExt", js.undefined)
      
      inline def setJsToString(value: Boolean): Self = StObject.set(x, "jsToString", value.asInstanceOf[js.Any])
      
      inline def setJsToStringUndefined: Self = StObject.set(x, "jsToString", js.undefined)
      
      inline def setOutput(value: TOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ToBeFolded = string | std.Array<string> | {[key: string] : foldify.foldify.ToBeFolded}
  }}}
  to avoid circular code involving: 
  - foldify.foldify.ToBeFolded
  */
  type ToBeFolded = String | js.Array[String] | StringDictionary[Any]
}
