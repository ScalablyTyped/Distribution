package typings.ejs

import typings.ejs.ejsBooleans.`false`
import typings.ejs.ejsBooleans.`true`
import typings.ejs.mod.EscapeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ejs.ejs.Options & {  async :false} */
  trait Optionsasyncfalse extends StObject {
    
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
    var async: js.UndefOr[Boolean] & `false`
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object Optionsasyncfalse {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] & `false`): Optionsasyncfalse = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasyncfalse]
    }
    
    @scala.inline
    implicit class OptionsasyncfalseMutableBuilder[Self <: Optionsasyncfalse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  /* Inlined ejs.ejs.Options & {  async :false | undefined,   client :false | undefined} */
  trait Optionsasyncfalseundefine extends StObject {
    
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
    var async: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
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
    var client: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object Optionsasyncfalseundefine {
    
    @scala.inline
    def apply(
      async: js.UndefOr[Boolean] & js.UndefOr[`false`],
      client: js.UndefOr[Boolean] & js.UndefOr[`false`]
    ): Optionsasyncfalseundefine = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasyncfalseundefine]
    }
    
    @scala.inline
    implicit class OptionsasyncfalseundefineMutableBuilder[Self <: Optionsasyncfalseundefine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  /* Inlined ejs.ejs.Options & {  async :false | undefined,   client :true} */
  trait OptionsasyncfalseundefineAsync extends StObject {
    
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
    var async: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
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
    var client: js.UndefOr[Boolean] & `true`
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object OptionsasyncfalseundefineAsync {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] & js.UndefOr[`false`], client: js.UndefOr[Boolean] & `true`): OptionsasyncfalseundefineAsync = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsasyncfalseundefineAsync]
    }
    
    @scala.inline
    implicit class OptionsasyncfalseundefineAsyncMutableBuilder[Self <: OptionsasyncfalseundefineAsync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  /* Inlined ejs.ejs.Options & {  async :never | undefined} */
  trait Optionsasyncneverundefine extends StObject {
    
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
    var async: js.UndefOr[Boolean] & js.UndefOr[scala.Nothing]
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object Optionsasyncneverundefine {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] & js.UndefOr[scala.Nothing]): Optionsasyncneverundefine = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasyncneverundefine]
    }
    
    @scala.inline
    implicit class OptionsasyncneverundefineMutableBuilder[Self <: Optionsasyncneverundefine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & js.UndefOr[scala.Nothing]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  /* Inlined ejs.ejs.Options & {  async :true} */
  trait Optionsasynctrue extends StObject {
    
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
    var async: js.UndefOr[Boolean] & `true`
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object Optionsasynctrue {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] & `true`): Optionsasynctrue = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasynctrue]
    }
    
    @scala.inline
    implicit class OptionsasynctrueMutableBuilder[Self <: Optionsasynctrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  /* Inlined ejs.ejs.Options & {  async :true,   client :false | undefined} */
  trait Optionsasynctrueclientfal extends StObject {
    
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
    var async: js.UndefOr[Boolean] & `true`
    
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
    var client: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object Optionsasynctrueclientfal {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] & `true`, client: js.UndefOr[Boolean] & js.UndefOr[`false`]): Optionsasynctrueclientfal = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasynctrueclientfal]
    }
    
    @scala.inline
    implicit class OptionsasynctrueclientfalMutableBuilder[Self <: Optionsasynctrueclientfal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  /* Inlined ejs.ejs.Options & {  async :true,   client :true} */
  trait Optionsasynctrueclienttru extends StObject {
    
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
    var async: js.UndefOr[Boolean] & `true`
    
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
    var client: js.UndefOr[Boolean] & `true`
    
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
      * Character to use with angle brackets for open/close
      * @default '%'
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
  object Optionsasynctrueclienttru {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] & `true`, client: js.UndefOr[Boolean] & `true`): Optionsasynctrueclienttru = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasynctrueclienttru]
    }
    
    @scala.inline
    implicit class OptionsasynctrueclienttruMutableBuilder[Self <: Optionsasynctrueclienttru] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setClient(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiter(value: String): Self = StObject.set(x, "closeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelimiterUndefined: Self = StObject.set(x, "closeDelimiter", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestructuredLocals(value: js.Array[String]): Self = StObject.set(x, "destructuredLocals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructuredLocalsUndefined: Self = StObject.set(x, "destructuredLocals", js.undefined)
      
      @scala.inline
      def setDestructuredLocalsVarargs(value: String*): Self = StObject.set(x, "destructuredLocals", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: /* markup */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      @scala.inline
      def setOpenDelimiter(value: String): Self = StObject.set(x, "openDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelimiterUndefined: Self = StObject.set(x, "openDelimiter", js.undefined)
      
      @scala.inline
      def setOutputFunctionName(value: String): Self = StObject.set(x, "outputFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunctionNameUndefined: Self = StObject.set(x, "outputFunctionName", js.undefined)
      
      @scala.inline
      def setRmWhitespace(value: Boolean): Self = StObject.set(x, "rmWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmWhitespaceUndefined: Self = StObject.set(x, "rmWhitespace", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def set_with(value: Boolean): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
    }
  }
  
  trait ToString extends StObject
}
