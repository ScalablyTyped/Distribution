package typings
package globalDashDirsLib.globalDashDirsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("global-dirs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  val yarn: GlobalDirectories = js.native
}

