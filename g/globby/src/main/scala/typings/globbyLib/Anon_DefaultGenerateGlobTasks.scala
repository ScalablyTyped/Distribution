package typings
package globbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultGenerateGlobTasks extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Default = js.native
  @JSName("gitignore")
  val gitignore_Original: globbyLib.globbyMod.Gitignore = js.native
  /**
  	@param patterns - See supported `minimatch` [patterns](https://github.com/isaacs/minimatch#usage).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns A `Promise<Array>` of matching paths.
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
  def apply(patterns: java.lang.String, options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: js.Array[java.lang.String], options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  /**
  	@param patterns - See supported `minimatch` [patterns](https://github.com/isaacs/minimatch#usage).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns A `Promise<Array>` of matching paths.
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
  // TODO: Remove this for the next major release
  def default(patterns: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: java.lang.String, options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def default(patterns: js.Array[java.lang.String], options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Promise[js.Array[java.lang.String]] = js.native
  /**
  	Note that you should avoid running the same tasks multiple times as they contain a file system cache. Instead, run this method each time to ensure file system changes are taken into consideration.
  	@param patterns - See supported `minimatch` [patterns](https://github.com/isaacs/minimatch#usage).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns An `Array<Object>` in the format `{ pattern: string, options: Object }`, which can be passed as arguments to [`fast-glob`](https://github.com/mrmlnc/fast-glob). This is useful for other globbing-related packages.
  	*/
  def generateGlobTasks(patterns: java.lang.String): js.Array[globbyLib.globbyMod.globbyNs.GlobTask] = js.native
  def generateGlobTasks(patterns: java.lang.String, options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Array[globbyLib.globbyMod.globbyNs.GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String]): js.Array[globbyLib.globbyMod.globbyNs.GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String], options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Array[globbyLib.globbyMod.globbyNs.GlobTask] = js.native
  /**
  	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
  	@returns A `Promise` for a filter function indicating whether a given path is ignored via a `.gitignore` file.
  	@example
  	```
  	import {gitignore} from 'globby';
  	(async () => {
  		const isIgnored = await gitignore();
  		console.log(isIgnored('some/file'));
  	})();
  	```
  	*/
  def gitignore(): js.Promise[globbyLib.globbyMod.globbyNs.FilterFunction] = js.native
  def gitignore(options: globbyLib.globbyMod.globbyNs.GitignoreOptions): js.Promise[globbyLib.globbyMod.globbyNs.FilterFunction] = js.native
  /**
  	Note that the options affect the results. If `noext: true` is set, then `+(a|b)` will not be considered a magic pattern. If the pattern has a brace expansion, like `a/{b/c,x/y}`, then that is considered magical, unless `nobrace: true` is set.
  	This function is backed by [`node-glob`](https://github.com/isaacs/node-glob#globhasmagicpattern-options).
  	@param patterns - See supported `minimatch` [patterns](https://github.com/isaacs/minimatch#usage).
  	@param options - See the [`node-glob` options](https://github.com/isaacs/node-glob#globhasmagicpattern-options).
  	@returns A boolean of whether there are any special glob characters in the `patterns`.
  	*/
  def hasMagic(patterns: java.lang.String): scala.Boolean = js.native
  def hasMagic(patterns: java.lang.String, options: globLib.globMod.GNs.IOptions): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String], options: globLib.globMod.GNs.IOptions): scala.Boolean = js.native
  /**
  	@param patterns - See supported `minimatch` [patterns](https://github.com/isaacs/minimatch#usage).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-1) in addition to the ones in this package.
  	@returns An `Array` of matching paths.
  	*/
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: globbyLib.globbyMod.globbyNs.GlobbyOptions): js.Array[java.lang.String] = js.native
}

