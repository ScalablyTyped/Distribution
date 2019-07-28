package typings.envDashPaths.envDashPathsMod

import typings.envDashPaths.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("env-paths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(name: String): Paths = js.native
  def apply(name: String, options: Options): Paths = js.native
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
  def default(name: String): Paths = js.native
  def default(name: String, options: Options): Paths = js.native
}

