package typings.envPaths

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get paths for storing things like data, config, cache, etc.
  	@param name - Name of your project. Used to generate the paths.
  	@returns The paths to use for your project on current OS.
  	@example
  	```
  	import envPaths = require('env-paths');
  	const paths = envPaths('MyApp');
  	paths.data;
  	//=> '/home/sindresorhus/.local/share/MyApp-nodejs'
  	paths.config
  	//=> '/home/sindresorhus/.config/MyApp-nodejs'
  	```
  	*/
  inline def apply(name: String): Paths = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Paths]
  inline def apply(name: String, options: Options): Paths = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Paths]
  
  @JSImport("env-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function envPaths(name: string, options?: envPaths.Options): envPaths.Paths;
  // export = envPaths;
  @JSImport("env-paths", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof envPaths */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof envPaths */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		__Don't use this option unless you really have to!__
    		Suffix appended to the project name to avoid name conflicts with native apps. Pass an empty string to disable it.
    		@default 'nodejs'
    		*/
    val suffix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait Paths extends StObject {
    
    /**
    		Directory for non-essential data files.
    		*/
    val cache: String
    
    /**
    		Directory for data files.
    		*/
    val config: String
    
    /**
    		Directory for data files.
    		*/
    val data: String
    
    /**
    		Directory for log files.
    		*/
    val log: String
    
    /**
    		Directory for temporary files.
    		*/
    val temp: String
  }
  object Paths {
    
    inline def apply(cache: String, config: String, data: String, log: String, temp: String): Paths = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    extension [Self <: Paths](x: Self) {
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setTemp(value: String): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
    }
  }
}
