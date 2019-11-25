package typings.ejs.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Whether or not to use `with() {}` constructs.
    * If `false` then the locals will be stored in the `locals` object. Set to `false` in strict mode.
    */
  var _with: js.UndefOr[Boolean] = js.undefined
  /** Whether or not to use a Promise */
  var async: js.UndefOr[Boolean] = js.undefined
  /** Compiled functions are cached, requires `filename` */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** When `true`, compiles a function that can be rendered in the browser without needing to load the EJS Runtime (ejs.min.js). */
  var client: js.UndefOr[Boolean] = js.undefined
  /** When `false` no debug instrumentation is compiled */
  var compileDebug: js.UndefOr[Boolean] = js.undefined
  /** Function execution context */
  var context: js.UndefOr[js.Any] = js.undefined
  /** Output generated function body */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** Character to use with angle brackets for open/close */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * The escaping function used with `<%=` construct.
    * It is used in rendering and is `.toString()`ed in the generation of client functions.
    * (By default escapes XML).
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  /**
    * The name of the file being rendered. Not required if you are using `renderFile()`.
    * Used by `cache` to key caches, and for includes.
    */
  var filename: js.UndefOr[String] = js.undefined
  /** Name to use for the object storing local variables when not using `with` Defaults to `locals` */
  var localsName: js.UndefOr[String] = js.undefined
  /**
    * Remove all safe-to-remove whitespace, including leading and trailing whitespace.
    * It also enables a safer version of `-%>` line slurping for all scriptlet tags (it does not strip new lines of tags in the middle of a line).
    */
  var rmWhitespace: js.UndefOr[Boolean] = js.undefined
  /** Set project root for includes with an absolute path (/file.ejs). */
  var root: js.UndefOr[String] = js.undefined
  /** When set to `true`, generated function is in strict mode */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _with: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    client: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    escape: /* str */ String => String = null,
    filename: String = null,
    localsName: String = null,
    rmWhitespace: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_with)) __obj.updateDynamic("_with")(_with.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1(escape))
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (localsName != null) __obj.updateDynamic("localsName")(localsName.asInstanceOf[js.Any])
    if (!js.isUndefined(rmWhitespace)) __obj.updateDynamic("rmWhitespace")(rmWhitespace.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

