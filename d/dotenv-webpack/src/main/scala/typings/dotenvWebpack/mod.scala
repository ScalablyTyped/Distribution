package typings.dotenvWebpack

import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A secure webpack plugin that supports dotenv and other environment variables
    * and only exposes what you choose and use.
    */
  @JSImport("dotenv-webpack", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DotenvWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /**
    * A secure webpack plugin that supports dotenv and other environment variables
    * and only exposes what you choose and use.
    */
  trait DotenvWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object DotenvWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): DotenvWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[DotenvWebpackPlugin]
    }
    
    extension [Self <: DotenvWebpackPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Whether to allow empty strings in safe mode.
      * If false, will throw an error if any env variables are empty (but only if safe mode is enabled).
      * @default false
      */
    var allowEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds support for dotenv-defaults. If set to `true`, uses `./.env.defaults`. If a `string`, uses that location for a defaults file.
      * Read more at {@link https://www.npmjs.com/package/dotenv-defaults}.
      * @default false
      */
    var defaults: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Allows your variables to be "expanded" for reusability within your .env file.
      * @default false
      */
    var expand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override the automatic check whether to stub `process.env`.
      * @dfault false
      */
    var ignoreStub: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to your environment variables.
      * @default './.env'.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * If `false` ignore safe-mode, if `true` load `'./.env.example'`, if a `string` load that file as the sample.
      * @default false
      */
    var safe: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * If `true`, all warnings will be surpressed.
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if you would rather load all system variables as well (useful for CI purposes).
      * @default false
      */
    var systemvars: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowEmptyValues(value: Boolean): Self = StObject.set(x, "allowEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyValuesUndefined: Self = StObject.set(x, "allowEmptyValues", js.undefined)
      
      inline def setDefaults(value: Boolean | String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setIgnoreStub(value: Boolean): Self = StObject.set(x, "ignoreStub", value.asInstanceOf[js.Any])
      
      inline def setIgnoreStubUndefined: Self = StObject.set(x, "ignoreStub", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSafe(value: Boolean | String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSystemvars(value: Boolean): Self = StObject.set(x, "systemvars", value.asInstanceOf[js.Any])
      
      inline def setSystemvarsUndefined: Self = StObject.set(x, "systemvars", js.undefined)
    }
  }
}
