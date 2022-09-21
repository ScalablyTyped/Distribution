package typings.findCacheDir

import typings.findCacheDir.findCacheDirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  /**
    * Finds the cache directory using the supplied options.
    * The algorithm tries to find a `package.json` file, searching every parent directory of the `cwd` specified
    * (or implied from other options). It returns a `string` containing the absolute path to the cache directory,
    * or `undefined` if `package.json` was never found or if the `node_modules` directory is unwritable.
    */
  inline def apply(options: OptionsWithThunk): js.UndefOr[js.Function1[/* repeated */ String, String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function1[/* repeated */ String, String]]]
  
  @JSImport("find-cache-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * If `true`, the directory will be created synchronously before returning.
      * @default false
      */
    var create: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Directory to start searching for a `package.json` from.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * An array of files that will be searched for a common parent directory.
      * This common parent directory will be used in lieu of the `cwd` option below.
      */
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Should be the same as your project name in `package.json`.
      */
    var name: String
    
    /**
      * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
      * @default false
      */
    var thunk: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(name: String): Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setThunk(value: Boolean): Self = StObject.set(x, "thunk", value.asInstanceOf[js.Any])
      
      inline def setThunkUndefined: Self = StObject.set(x, "thunk", js.undefined)
    }
  }
  
  trait OptionsWithThunk
    extends StObject
       with Options {
    
    /**
      * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
      * @default false
      */
    @JSName("thunk")
    var thunk_OptionsWithThunk: `true`
  }
  object OptionsWithThunk {
    
    inline def apply(name: String): OptionsWithThunk = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], thunk = true)
      __obj.asInstanceOf[OptionsWithThunk]
    }
    
    extension [Self <: OptionsWithThunk](x: Self) {
      
      inline def setThunk(value: `true`): Self = StObject.set(x, "thunk", value.asInstanceOf[js.Any])
    }
  }
}
