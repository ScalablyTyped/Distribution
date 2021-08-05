package typings.filingCabinet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("filing-cabinet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register a custom lookup resolver for a file extension
    * If a given extension does not have a registered resolver,
    * cabinet will use a generic file resolver which is basically `require('path').join`
    * with a bit of extension defaulting logic
    * @param extension the extension of the file that should use the custom resolver (ex: '.py', '.php')
    * @param resolver  A resolver of partial paths
    */
  inline def register(`extension`: String, resolver: Resolver): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(`extension`.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * the parsed AST for filename
      * Useful optimization for avoiding a parse of filename
      */
    var ast: js.UndefOr[js.Any] = js.undefined
    
    /**
      * `requirejs` config for resolving aliased JavaScript modules
      */
    var config: js.UndefOr[js.Any] = js.undefined
    
    /** the path to all files */
    var directory: String
    
    /** the path to the file containing the partial */
    var filename: String
    
    /**
      * For typescript files, whether to prefer *.js over *.d.ts
      */
    var noTypeDefinitions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * config for resolving entry file for `node_modules`.
      * This value overrides the main attribute in the `package.json` file;
      * used in conjunction with the `packageFilter` of the resolve package
      */
    var nodeModulesConfig: js.UndefOr[js.Any] = js.undefined
    
    /** the dependency path */
    var partial: String
    
    /**
      * Path to a typescript configuration.
      * Could also be an object representing a pre-parsed typescript config
      */
    var tsConfig: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * `webpack` config for resolving aliased JavaScript modules
      */
    var webpackConfig: js.UndefOr[js.Any] = js.undefined
  }
  object Options {
    
    inline def apply(directory: String, filename: String, partial: String): Options = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAst(value: js.Any): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setNoTypeDefinitions(value: Boolean): Self = StObject.set(x, "noTypeDefinitions", value.asInstanceOf[js.Any])
      
      inline def setNoTypeDefinitionsUndefined: Self = StObject.set(x, "noTypeDefinitions", js.undefined)
      
      inline def setNodeModulesConfig(value: js.Any): Self = StObject.set(x, "nodeModulesConfig", value.asInstanceOf[js.Any])
      
      inline def setNodeModulesConfigUndefined: Self = StObject.set(x, "nodeModulesConfig", js.undefined)
      
      inline def setPartial(value: String): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setTsConfig(value: String | js.Object): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
      
      inline def setWebpackConfig(value: js.Any): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
      
      inline def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
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
