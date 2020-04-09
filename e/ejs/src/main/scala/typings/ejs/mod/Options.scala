package typings.ejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * Whether or not to use `with () {}` construct in the generated template
  	 * functions. If set to `false`, data is still accessible through the object
  	 * whose name is specified by `ejs.localsName` (defaults to `locals`).
  	 *
  	 * @default true
  	 */
  var _with: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Whether or not to create an async function instead of a regular function.
  	 * This requires language support.
  	 *
  	 * @default false
  	 */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Make sure to set this to 'false' in order to skip UglifyJS parsing,
  	 * when using ES6 features (`const`, etc) as UglifyJS doesn't understand them.
  	 * @default true
  	 */
  var beautify: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Whether or not to enable caching of template functions. Beware that
  	 * the options of compilation are not checked as being the same, so
  	 * special handling is required if, for example, you want to cache client
  	 * and regular functions of the same file.
  	 *
  	 * Requires `filename` to be set. Only works with rendering function.
  	 *
  	 * @default false
  	 */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Whether or not to compile a `ClientFunction` that can be rendered
  	 * in the browser without depending on ejs.js. Otherwise, a `TemplateFunction`
  	 * will be compiled.
  	 *
  	 * @default false
  	 */
  var client: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The closing delimiter for all statements. This allows to to clearly delinate
  	 * the difference between template code and existing delimiters. (It is recommended
  	 * to synchronize this with the openDelimiter property.)
  	 *
  	 * @default ejs.closeDelimiter
  	 */
  var closeDelimiter: js.UndefOr[String] = js.undefined
  /**
  	 * Include additional runtime debugging information in generated template
  	 * functions.
  	 *
  	 * @default true
  	 */
  var compileDebug: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The Object to which `this` is set during rendering.
  	 *
  	 * @default this
  	 */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Log the generated JavaScript source for the EJS template to the console.
  	 *
  	 * @default false
  	 */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The delimiter used in template compilation.
  	 *
  	 * @default ejs.delimiter
  	 */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
  	 * An array of local variables that are always destructured from `localsName`,
  	 * available even in strict mode.
  	 *
  	 * @default []
  	 */
  var destructuredLocals: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * The escaping function used with `<%=` construct. It is used in rendering
  	 * and is `.toString()`ed in the generation of client functions.
  	 *
  	 * @default ejs.escapeXML
  	 */
  var escape: js.UndefOr[EscapeCallback] = js.undefined
  /**
  	 * The filename of the template. Required for inclusion and caching unless
  	 * you are using `renderFile`. Also used for error reporting.
  	 *
  	 * @default undefined
  	 */
  var filename: js.UndefOr[String] = js.undefined
  /**
  	 * Name to use for the object storing local variables when not using `with` or destructuring.
  	 *
  	 * @default ejs.localsName
  	 */
  var localsName: js.UndefOr[String] = js.undefined
  /**
  	 * The opening delimiter for all statements. This allows you to clearly delinate
  	 * the difference between template code and existing delimiters. (It is recommended
  	 * to synchronize this with the closeDelimiter property.)
  	 *
  	 * @default ejs.openDelimiter
  	 */
  var openDelimiter: js.UndefOr[String] = js.undefined
  /** Set to a string (e.g., 'echo' or 'print') for a function to print output inside scriptlet tags. */
  var outputFunctionName: js.UndefOr[String] = js.undefined
  /**
  	 * Remove all safe-to-remove whitespace, including leading and trailing
  	 * whitespace. It also enables a safer version of `-%>` line slurping for all
  	 * scriptlet tags (it does not strip new lines of tags in the middle of a
  	 * line).
  	 *
  	 * @default false
  	 */
  var rmWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The path to the project root. When this is set, absolute paths for includes
  	 * (/filename.ejs) will be relative to the project root.
  	 *
  	 * @default undefined
  	 */
  var root: js.UndefOr[String] = js.undefined
  /**
  	 * Whether to run in strict mode or not.
  	 * Enforces `_with=false`.
  	 *
  	 * @default false
  	 */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _with: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    beautify: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    client: js.UndefOr[Boolean] = js.undefined,
    closeDelimiter: String = null,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    destructuredLocals: js.Array[String] = null,
    escape: /* markup */ js.UndefOr[js.Any] => String = null,
    filename: String = null,
    localsName: String = null,
    openDelimiter: String = null,
    outputFunctionName: String = null,
    rmWhitespace: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_with)) __obj.updateDynamic("_with")(_with.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (closeDelimiter != null) __obj.updateDynamic("closeDelimiter")(closeDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (destructuredLocals != null) __obj.updateDynamic("destructuredLocals")(destructuredLocals.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1(escape))
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (localsName != null) __obj.updateDynamic("localsName")(localsName.asInstanceOf[js.Any])
    if (openDelimiter != null) __obj.updateDynamic("openDelimiter")(openDelimiter.asInstanceOf[js.Any])
    if (outputFunctionName != null) __obj.updateDynamic("outputFunctionName")(outputFunctionName.asInstanceOf[js.Any])
    if (!js.isUndefined(rmWhitespace)) __obj.updateDynamic("rmWhitespace")(rmWhitespace.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

