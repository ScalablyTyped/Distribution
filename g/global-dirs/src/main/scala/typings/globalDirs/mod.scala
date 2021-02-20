package typings.globalDirs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the directory of globally installed packages and binaries.
  	@example
  	```
  	import globalDirectories = require('global-dirs');
  	console.log(globalDirectories.npm.prefix);
  	//=> '/usr/local'
  	console.log(globalDirectories.npm.packages);
  	//=> '/usr/local/lib/node_modules'
  	```
  	*/
  @JSImport("global-dirs", "npm")
  @js.native
  val npm: GlobalDirectories = js.native
  
  /**
  	Get the directory of globally installed packages and binaries.
  	@example
  	```
  	import globalDirectories = require('global-dirs');
  	console.log(globalDirectories.npm.binaries);
  	//=> '/usr/local/bin'
  	console.log(globalDirectories.yarn.packages);
  	//=> '/Users/sindresorhus/.config/yarn/global/node_modules'
  	```
  	*/
  @JSImport("global-dirs", "yarn")
  @js.native
  val yarn: GlobalDirectories = js.native
  
  @js.native
  trait GlobalDirectories extends StObject {
    
    /**
    		Directory with globally installed binaries.
    		Equivalent to `npm bin --global`.
    		*/
    val binaries: String = js.native
    
    /**
    		Directory with globally installed packages.
    		Equivalent to `npm root --global`.
    		*/
    val packages: String = js.native
    
    /**
    		Directory with directories for packages and binaries. You probably want either of the above.
    		Equivalent to `npm prefix --global`.
    		*/
    val prefix: String = js.native
  }
  object GlobalDirectories {
    
    @scala.inline
    def apply(binaries: String, packages: String, prefix: String): GlobalDirectories = {
      val __obj = js.Dynamic.literal(binaries = binaries.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDirectories]
    }
    
    @scala.inline
    implicit class GlobalDirectoriesMutableBuilder[Self <: GlobalDirectories] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaries(value: String): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackages(value: String): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
