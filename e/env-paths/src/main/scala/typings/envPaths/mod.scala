package typings.envPaths

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("env-paths", JSImport.Namespace)
  @js.native
  def apply(name: String): Paths = js.native
  @JSImport("env-paths", JSImport.Namespace)
  @js.native
  def apply(name: String, options: Options): Paths = js.native
  
  @JSImport("env-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function envPaths(name: string, options?: envPaths.Options): envPaths.Paths;
  // export = envPaths;
  @JSImport("env-paths", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof envPaths */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof envPaths */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options extends StObject {
    
    /**
    		__Don't use this option unless you really have to!__
    		Suffix appended to the project name to avoid name conflicts with native apps. Pass an empty string to disable it.
    		@default 'nodejs'
    		*/
    val suffix: js.UndefOr[String] = js.native
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
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait Paths extends StObject {
    
    /**
    		Directory for non-essential data files.
    		*/
    val cache: String = js.native
    
    /**
    		Directory for data files.
    		*/
    val config: String = js.native
    
    /**
    		Directory for data files.
    		*/
    val data: String = js.native
    
    /**
    		Directory for log files.
    		*/
    val log: String = js.native
    
    /**
    		Directory for temporary files.
    		*/
    val temp: String = js.native
  }
  object Paths {
    
    @scala.inline
    def apply(cache: String, config: String, data: String, log: String, temp: String): Paths = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    @scala.inline
    implicit class PathsMutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemp(value: String): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
    }
  }
}
