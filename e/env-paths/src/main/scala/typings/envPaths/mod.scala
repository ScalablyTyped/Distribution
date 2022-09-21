package typings.envPaths

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("env-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): Paths = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[Paths]
  inline def default(name: String, options: Options): Paths = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Paths]
  
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
    	Example locations (with the default `nodejs` suffix):
    	- macOS: `~/Library/Caches/MyApp-nodejs`
    	- Windows: `%LOCALAPPDATA%\MyApp-nodejs\Cache` (for example, `C:\Users\USERNAME\AppData\Local\MyApp-nodejs\Cache`)
    	- Linux: `~/.cache/MyApp-nodejs` (or `$XDG_CACHE_HOME/MyApp-nodejs`)
    	*/
    val cache: String
    
    /**
    	Directory for data files.
    	Example locations (with the default `nodejs` suffix):
    	- macOS: `~/Library/Preferences/MyApp-nodejs`
    	- Windows: `%APPDATA%\MyApp-nodejs\Config` (for example, `C:\Users\USERNAME\AppData\Roaming\MyApp-nodejs\Config`)
    	- Linux: `~/.config/MyApp-nodejs` (or `$XDG_CONFIG_HOME/MyApp-nodejs`)
    	*/
    val config: String
    
    /**
    	Directory for data files.
    	Example locations (with the default `nodejs` suffix):
    	- macOS: `~/Library/Application Support/MyApp-nodejs`
    	- Windows: `%LOCALAPPDATA%\MyApp-nodejs\Data` (for example, `C:\Users\USERNAME\AppData\Local\MyApp-nodejs\Data`)
    	- Linux: `~/.local/share/MyApp-nodejs` (or `$XDG_DATA_HOME/MyApp-nodejs`)
    	*/
    val data: String
    
    /**
    	Directory for log files.
    	Example locations (with the default `nodejs` suffix):
    	- macOS: `~/Library/Logs/MyApp-nodejs`
    	- Windows: `%LOCALAPPDATA%\MyApp-nodejs\Log` (for example, `C:\Users\USERNAME\AppData\Local\MyApp-nodejs\Log`)
    	- Linux: `~/.local/state/MyApp-nodejs` (or `$XDG_STATE_HOME/MyApp-nodejs`)
    	*/
    val log: String
    
    /**
    	Directory for temporary files.
    	Example locations (with the default `nodejs` suffix):
    	- macOS: `/var/folders/jf/f2twvvvs5jl_m49tf034ffpw0000gn/T/MyApp-nodejs`
    	- Windows: `%LOCALAPPDATA%\Temp\MyApp-nodejs` (for example, `C:\Users\USERNAME\AppData\Local\Temp\MyApp-nodejs`)
    	- Linux: `/tmp/USERNAME/MyApp-nodejs`
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
