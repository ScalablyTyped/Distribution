package typings.dotenvWebpack

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
  class ^ ()
    extends StObject
       with DotenvWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  /**
    * A secure webpack plugin that supports dotenv and other environment variables
    * and only exposes what you choose and use.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackPluginInstance * / any */ trait DotenvWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit
  }
  object DotenvWebpackPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): DotenvWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[DotenvWebpackPlugin]
    }
    
    @scala.inline
    implicit class DotenvWebpackPluginMutableBuilder[Self <: DotenvWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmptyValues(value: Boolean): Self = StObject.set(x, "allowEmptyValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyValuesUndefined: Self = StObject.set(x, "allowEmptyValues", js.undefined)
      
      @scala.inline
      def setDefaults(value: Boolean | String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSafe(value: Boolean | String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSystemvars(value: Boolean): Self = StObject.set(x, "systemvars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemvarsUndefined: Self = StObject.set(x, "systemvars", js.undefined)
    }
  }
}
