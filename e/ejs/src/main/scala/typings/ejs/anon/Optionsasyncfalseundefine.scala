package typings.ejs.anon

import typings.ejs.ejsBooleans.`false`
import typings.ejs.mod.EscapeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ejs.ejs.Options & {  async :false | undefined,   client :false | undefined} */
@js.native
trait Optionsasyncfalseundefine extends js.Object {
  
  /**
    * Whether or not to use `with () {}` construct in the generated template
    * functions. If set to `false`, data is still accessible through the object
    * whose name is specified by `ejs.localsName` (defaults to `locals`).
    *
    * @default true
    */
  var _with: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to create an async function instead of a regular function.
    * This requires language support.
    *
    * @default false
    */
  var async: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  /**
    * Make sure to set this to 'false' in order to skip UglifyJS parsing,
    * when using ES6 features (`const`, etc) as UglifyJS doesn't understand them.
    * @default true
    */
  var beautify: js.UndefOr[Boolean] = js.native
  
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
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to compile a `ClientFunction` that can be rendered
    * in the browser without depending on ejs.js. Otherwise, a `TemplateFunction`
    * will be compiled.
    *
    * @default false
    */
  var client: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  /**
    * The closing delimiter for all statements. This allows to to clearly delinate
    * the difference between template code and existing delimiters. (It is recommended
    * to synchronize this with the openDelimiter property.)
    *
    * @default ejs.closeDelimiter
    */
  var closeDelimiter: js.UndefOr[String] = js.native
  
  /**
    * Include additional runtime debugging information in generated template
    * functions.
    *
    * @default true
    */
  var compileDebug: js.UndefOr[Boolean] = js.native
  
  /**
    * The Object to which `this` is set during rendering.
    *
    * @default this
    */
  var context: js.UndefOr[js.Any] = js.native
  
  /**
    * Log the generated JavaScript source for the EJS template to the console.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Character to use with angle brackets for open/close
    * @default '%'
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * An array of local variables that are always destructured from `localsName`,
    * available even in strict mode.
    *
    * @default []
    */
  var destructuredLocals: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The escaping function used with `<%=` construct. It is used in rendering
    * and is `.toString()`ed in the generation of client functions.
    *
    * @default ejs.escapeXML
    */
  var escape: js.UndefOr[EscapeCallback] = js.native
  
  /**
    * The filename of the template. Required for inclusion and caching unless
    * you are using `renderFile`. Also used for error reporting.
    *
    * @default undefined
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * Name to use for the object storing local variables when not using `with` or destructuring.
    *
    * @default ejs.localsName
    */
  var localsName: js.UndefOr[String] = js.native
  
  /**
    * The opening delimiter for all statements. This allows you to clearly delinate
    * the difference between template code and existing delimiters. (It is recommended
    * to synchronize this with the closeDelimiter property.)
    *
    * @default ejs.openDelimiter
    */
  var openDelimiter: js.UndefOr[String] = js.native
  
  /** Set to a string (e.g., 'echo' or 'print') for a function to print output inside scriptlet tags. */
  var outputFunctionName: js.UndefOr[String] = js.native
  
  /**
    * Remove all safe-to-remove whitespace, including leading and trailing
    * whitespace. It also enables a safer version of `-%>` line slurping for all
    * scriptlet tags (it does not strip new lines of tags in the middle of a
    * line).
    *
    * @default false
    */
  var rmWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * The path to the project root. When this is set, absolute paths for includes
    * (/filename.ejs) will be relative to the project root.
    *
    * @default undefined
    */
  var root: js.UndefOr[String] = js.native
  
  /**
    * Whether to run in strict mode or not.
    * Enforces `_with=false`.
    *
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.native
}
object Optionsasyncfalseundefine {
  
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] with js.UndefOr[`false`],
    client: js.UndefOr[Boolean] with js.UndefOr[`false`]
  ): Optionsasyncfalseundefine = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsasyncfalseundefine]
  }
  
  @scala.inline
  implicit class OptionsasyncfalseundefineOps[Self <: Optionsasyncfalseundefine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsync(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_with(value: Boolean): Self = this.set("_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_with: Self = this.set("_with", js.undefined)
    
    @scala.inline
    def setBeautify(value: Boolean): Self = this.set("beautify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeautify: Self = this.set("beautify", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCloseDelimiter(value: String): Self = this.set("closeDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseDelimiter: Self = this.set("closeDelimiter", js.undefined)
    
    @scala.inline
    def setCompileDebug(value: Boolean): Self = this.set("compileDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompileDebug: Self = this.set("compileDebug", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDestructuredLocalsVarargs(value: String*): Self = this.set("destructuredLocals", js.Array(value :_*))
    
    @scala.inline
    def setDestructuredLocals(value: js.Array[String]): Self = this.set("destructuredLocals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestructuredLocals: Self = this.set("destructuredLocals", js.undefined)
    
    @scala.inline
    def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = this.set("escape", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setLocalsName(value: String): Self = this.set("localsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalsName: Self = this.set("localsName", js.undefined)
    
    @scala.inline
    def setOpenDelimiter(value: String): Self = this.set("openDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDelimiter: Self = this.set("openDelimiter", js.undefined)
    
    @scala.inline
    def setOutputFunctionName(value: String): Self = this.set("outputFunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFunctionName: Self = this.set("outputFunctionName", js.undefined)
    
    @scala.inline
    def setRmWhitespace(value: Boolean): Self = this.set("rmWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRmWhitespace: Self = this.set("rmWhitespace", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
