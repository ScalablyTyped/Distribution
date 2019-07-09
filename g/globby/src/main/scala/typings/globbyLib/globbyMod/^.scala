package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globby", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("gitignore")
  val gitignore_Original: Gitignore = js.native
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns The matching paths.
  	@example
  	```
  	import globby = require('globby');
  	(async () => {
  		const paths = await globby(['*', '!cake']);
  		console.log(paths);
  		//=> ['unicorn', 'rainbow']
  	})();
  	```
  	*/
  def apply(patterns: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: java.lang.String, options: GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String], options: GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  /**
  	Note that you should avoid running the same tasks multiple times as they contain a file system cache. Instead, run this method each time to ensure file system changes are taken into consideration.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns An object in the format `{pattern: string, options: object}`, which can be passed as arguments to [`fast-glob`](https://github.com/mrmlnc/fast-glob). This is useful for other globbing-related packages.
  	*/
  def generateGlobTasks(patterns: java.lang.String): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: java.lang.String, options: GlobbyOptions): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String]): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String], options: GlobbyOptions): js.Array[GlobTask] = js.native
  /**
  	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
  	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
  	@example
  	```
  	import {gitignore} from 'globby';
  	(async () => {
  		const isIgnored = await gitignore();
  		console.log(isIgnored('some/file'));
  	})();
  	```
  	*/
  def gitignore(): js.Promise[FilterFunction] = js.native
  def gitignore(options: GitignoreOptions): js.Promise[FilterFunction] = js.native
  /**
  	Note that the options affect the results. If `noext: true` is set, then `+(a|b)` will not be considered a magic pattern. If the pattern has a brace expansion, like `a/{b/c,x/y}`, then that is considered magical, unless `nobrace: true` is set.
  	This function is backed by [`node-glob`](https://github.com/isaacs/node-glob#globhasmagicpattern-options).
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`node-glob` options](https://github.com/isaacs/node-glob#globhasmagicpattern-options).
  	@returns Whether there are any special glob characters in the `patterns`.
  	*/
  def hasMagic(patterns: java.lang.String): scala.Boolean = js.native
  def hasMagic(patterns: java.lang.String, options: globLib.globMod.IOptions): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String], options: globLib.globMod.IOptions): scala.Boolean = js.native
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns The stream of matching paths.
  	@example
  	```
  	import globby = require('globby');
  	(async () => {
  		for await (const path of globby.stream('*.tmp')) {
  			console.log(path);
  		}
  	})();
  	```
  	*/
  def stream(patterns: java.lang.String): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(patterns: java.lang.String, options: GlobbyOptions): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(patterns: js.Array[java.lang.String]): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(patterns: js.Array[java.lang.String], options: GlobbyOptions): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns The matching paths.
  	*/
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: GlobbyOptions): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: GlobbyOptions): js.Array[java.lang.String] = js.native
}

