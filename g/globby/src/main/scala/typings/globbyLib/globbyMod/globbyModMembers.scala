package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globby", JSImport.Namespace)
@js.native
object globbyModMembers extends js.Object {
  /**
    * Returns a `Promise<Array>` of matching paths.
    */
  def apply(patterns: java.lang.String | js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: java.lang.String | js.Array[java.lang.String], options: Options): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Returns an `Array<Object>` in the format `{ pattern: string, opts: Object }`,
    * which can be passed as arguments to [`fast-glob`](https://github.com/mrmlnc/fast-glob).
    * This is useful for other globbing-related packages.
    *
    * Note that you should avoid running the same tasks multiple times as they contain a file system cache.
    * Instead, run this method each time to ensure file system changes are taken into consideration.
    */
  def generateGlobTasks(patterns: java.lang.String): js.Array[globbyLib.Anon_Pattern] = js.native
  def generateGlobTasks(patterns: java.lang.String, options: Options): js.Array[globbyLib.Anon_Pattern] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String]): js.Array[globbyLib.Anon_Pattern] = js.native
  def generateGlobTasks(patterns: js.Array[java.lang.String], options: Options): js.Array[globbyLib.Anon_Pattern] = js.native
  /**
    * Returns a Promise<(path: string) => boolean> indicating whether a given path is ignored
    * via a `.gitignore` file.
    *
    * Takes `cwd?: string` and `ignore?: string[]` as options. `.gitignore` files matched by the
    * ignore config are not used for the resulting filter function.
    *
    * ```js
    * const {gitignore} = require('globby');
    *
    * (async () => {
    *   const isIgnored = await gitignore();
    *   console.log(isIgnored('some/file'));
    * })();
    * ```
    */
  def gitignore(): js.Promise[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.native
  def gitignore(options: globbyLib.Anon_Cwd): js.Promise[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.native
  /**
    * Returns a boolean of whether there are any special glob characters in the `patterns`.
    *
    * Note that the options affect the results. If `noext: true` is set, then `+(a|b)` will not
    * be considered a magic pattern. If the pattern has a brace expansion, like `a/{b/c,x/y}`,
    * then that is considered magical, unless `nobrace: true` is set.
    *
    * This function is backed by [`node-glob`](https://github.com/isaacs/node-glob#globhasmagicpattern-options)
    */
  def hasMagic(patterns: java.lang.String): scala.Boolean = js.native
  def hasMagic(patterns: java.lang.String, options: globLib.globMod.GNs.IOptions): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String]): scala.Boolean = js.native
  def hasMagic(patterns: js.Array[java.lang.String], options: globLib.globMod.GNs.IOptions): scala.Boolean = js.native
  /**
    * Returns an `Array` of matching paths.
    */
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: Options): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: Options): js.Array[java.lang.String] = js.native
}

