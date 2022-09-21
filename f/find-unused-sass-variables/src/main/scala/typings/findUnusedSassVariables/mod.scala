package typings.findUnusedSassVariables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("find-unused-sass-variables", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an object with `unused` and `total`.
      * `unused` has the array of unused variables and `total` has the sum of all variables in the files
      * (unused and used ones).
      */
    inline def find(dir: String): Results = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(dir.asInstanceOf[js.Any]).asInstanceOf[Results]
    inline def find(dir: String, options: Options): Results = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Results]
    
    /**
      * Returns a Promise which resolves result; is the same as `find(dir, options)` result.
      */
    inline def findAsync(dir: String): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
    inline def findAsync(dir: String, options: Options): js.Promise[Results] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Results]]
  }
  
  trait Options extends StObject {
    
    /** Array of file extensions to search for unused variables in. e.g. `['scss']` */
    var fileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Array of strings of the variables to ignore, e.g. `['$my-var', '$my-second-var']` */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFileExtensions(value: js.Array[String]): Self = StObject.set(x, "fileExtensions", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionsUndefined: Self = StObject.set(x, "fileExtensions", js.undefined)
      
      inline def setFileExtensionsVarargs(value: String*): Self = StObject.set(x, "fileExtensions", js.Array(value*))
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    }
  }
  
  trait Results extends StObject {
    
    /** he sum of all variables in the files (unused and used ones) */
    val total: Double
    
    /** the array of unused variables */
    val unused: js.Array[String]
  }
  object Results {
    
    inline def apply(total: Double, unused: js.Array[String]): Results = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUnused(value: js.Array[String]): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      inline def setUnusedVarargs(value: String*): Self = StObject.set(x, "unused", js.Array(value*))
    }
  }
}
