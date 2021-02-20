package typings.filingCabinet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filing-cabinet", JSImport.Namespace)
  @js.native
  def apply(options: Options): String = js.native
  
  /**
    * Register a custom lookup resolver for a file extension
    * If a given extension does not have a registered resolver,
    * cabinet will use a generic file resolver which is basically `require('path').join`
    * with a bit of extension defaulting logic
    * @param extension the extension of the file that should use the custom resolver (ex: '.py', '.php')
    * @param resolver  A resolver of partial paths
    */
  @JSImport("filing-cabinet", "register")
  @js.native
  def register(extension: String, resolver: Resolver): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * the parsed AST for filename
      * Useful optimization for avoiding a parse of filename
      */
    var ast: js.UndefOr[js.Any] = js.native
    
    /**
      * `requirejs` config for resolving aliased JavaScript modules
      */
    var config: js.UndefOr[js.Any] = js.native
    
    /** the path to all files */
    var directory: String = js.native
    
    /** the path to the file containing the partial */
    var filename: String = js.native
    
    /**
      * For typescript files, whether to prefer *.js over *.d.ts
      */
    var noTypeDefinitions: js.UndefOr[Boolean] = js.native
    
    /**
      * config for resolving entry file for `node_modules`.
      * This value overrides the main attribute in the `package.json` file;
      * used in conjunction with the `packageFilter` of the resolve package
      */
    var nodeModulesConfig: js.UndefOr[js.Any] = js.native
    
    /** the dependency path */
    var partial: String = js.native
    
    /**
      * Path to a typescript configuration.
      * Could also be an object representing a pre-parsed typescript config
      */
    var tsConfig: js.UndefOr[String | js.Object] = js.native
    
    /**
      * `webpack` config for resolving aliased JavaScript modules
      */
    var webpackConfig: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(directory: String, filename: String, partial: String): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: js.Any): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTypeDefinitions(value: Boolean): Self = StObject.set(x, "noTypeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTypeDefinitionsUndefined: Self = StObject.set(x, "noTypeDefinitions", js.undefined)
      
      @scala.inline
      def setNodeModulesConfig(value: js.Any): Self = StObject.set(x, "nodeModulesConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeModulesConfigUndefined: Self = StObject.set(x, "nodeModulesConfig", js.undefined)
      
      @scala.inline
      def setPartial(value: String): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsConfig(value: String | js.Object): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
      
      @scala.inline
      def setWebpackConfig(value: js.Any): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
    }
  }
  
  type Resolver = js.Function4[
    /* partial */ String, 
    /* filename */ String, 
    /* directory */ String, 
    /* config */ js.UndefOr[js.Any], 
    Unit
  ]
}
