package typings
package envDashPathsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultName extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function envPaths(name: string, options?: envPaths.Options): envPaths.Paths;
  // export = envPaths;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(name: java.lang.String): envDashPathsLib.envDashPathsMod.envPathsNs.Paths = js.native
  def apply(name: java.lang.String, options: envDashPathsLib.envDashPathsMod.envPathsNs.Options): envDashPathsLib.envDashPathsMod.envPathsNs.Paths = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function envPaths(name: string, options?: envPaths.Options): envPaths.Paths;
  // export = envPaths;
  def default(name: java.lang.String): envDashPathsLib.envDashPathsMod.envPathsNs.Paths = js.native
  def default(name: java.lang.String, options: envDashPathsLib.envDashPathsMod.envPathsNs.Options): envDashPathsLib.envDashPathsMod.envPathsNs.Paths = js.native
}

