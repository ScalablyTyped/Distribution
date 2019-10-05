package typings.envDashPaths.envDashPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("env-paths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function envPaths(name: string, options?: envPaths.Options): envPaths.Paths;
  // export = envPaths;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof envPaths */ js.Any = js.native
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
}

