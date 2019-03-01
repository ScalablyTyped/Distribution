package typings
package ejsLib.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Whether or not to use `with() {}` constructs.
    * If `false` then the locals will be stored in the `locals` object. Set to `false` in strict mode.
    */
  var _with: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to use a Promise */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** Compiled functions are cached, requires `filename` */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** When `true`, compiles a function that can be rendered in the browser without needing to load the EJS Runtime (ejs.min.js). */
  var client: js.UndefOr[scala.Boolean] = js.undefined
  /** When `false` no debug instrumentation is compiled */
  var compileDebug: js.UndefOr[scala.Boolean] = js.undefined
  /** Function execution context */
  var context: js.UndefOr[js.Any] = js.undefined
  /** Output generated function body */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** Character to use with angle brackets for open/close */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The escaping function used with `<%=` construct.
    * It is used in rendering and is `.toString()`ed in the generation of client functions.
    * (By default escapes XML).
    */
  var escape: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * The name of the file being rendered. Not required if you are using `renderFile()`.
    * Used by `cache` to key caches, and for includes.
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Name to use for the object storing local variables when not using `with` Defaults to `locals` */
  var localsName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Remove all safe-to-remove whitespace, including leading and trailing whitespace.
    * It also enables a safer version of `-%>` line slurping for all scriptlet tags (it does not strip new lines of tags in the middle of a line).
    */
  var rmWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /** Set project root for includes with an absolute path (/file.ejs). */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** When set to `true`, generated function is in strict mode */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _with: js.UndefOr[scala.Boolean] = js.undefined,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    client: js.UndefOr[scala.Boolean] = js.undefined,
    compileDebug: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null,
    escape: js.Function1[/* str */ java.lang.String, java.lang.String] = null,
    filename: java.lang.String = null,
    localsName: java.lang.String = null,
    rmWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_with)) __obj.updateDynamic("_with")(_with)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (localsName != null) __obj.updateDynamic("localsName")(localsName)
    if (!js.isUndefined(rmWhitespace)) __obj.updateDynamic("rmWhitespace")(rmWhitespace)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}

