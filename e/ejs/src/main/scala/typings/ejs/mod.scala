package typings.ejs

import org.scalablytyped.runtime.StringDictionary
import typings.ejs.anon.Optionsasyncfalse
import typings.ejs.anon.Optionsasyncfalseundefine
import typings.ejs.anon.OptionsasyncfalseundefineAsync
import typings.ejs.anon.Optionsasyncneverundefine
import typings.ejs.anon.Optionsasynctrue
import typings.ejs.anon.Optionsasynctrueclientfal
import typings.ejs.anon.Optionsasynctrueclienttru
import typings.ejs.anon.ToString
import typings.std.Error
import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ejs", "Template")
  @js.native
  class Template protected () extends StObject {
    def this(text: String) = this()
    def this(text: String, opts: Options) = this()
    
    /**
      * Compiles the EJS template.
      */
    def compile(): TemplateFunction | AsyncTemplateFunction | ClientFunction | AsyncClientFunction = js.native
    
    /**
      * The compiled JavaScript function source, or the empty string
      * if the template hasn't been compiled yet.
      */
    val source: String = js.native
    
    /**
      * The EJS template source text.
      */
    val templateText: String = js.native
  }
  object Template {
    
    @js.native
    sealed trait modes extends StObject
    @JSImport("ejs", "Template.modes")
    @js.native
    object modes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[modes & String] = js.native
      
      @js.native
      sealed trait COMMENT
        extends StObject
           with modes
      /* "comment" */ val COMMENT: typings.ejs.mod.Template.modes.COMMENT & String = js.native
      
      @js.native
      sealed trait ESCAPED
        extends StObject
           with modes
      /* "escaped" */ val ESCAPED: typings.ejs.mod.Template.modes.ESCAPED & String = js.native
      
      @js.native
      sealed trait EVAL
        extends StObject
           with modes
      /* "eval" */ val EVAL: typings.ejs.mod.Template.modes.EVAL & String = js.native
      
      @js.native
      sealed trait LITERAL
        extends StObject
           with modes
      /* "literal" */ val LITERAL: typings.ejs.mod.Template.modes.LITERAL & String = js.native
      
      @js.native
      sealed trait RAW
        extends StObject
           with modes
      /* "raw" */ val RAW: typings.ejs.mod.Template.modes.RAW & String = js.native
    }
  }
  
  @JSImport("ejs", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ejs", "cache")
  @js.native
  def cache: Cache_ = js.native
  @scala.inline
  def cache_=(x: Cache_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  @JSImport("ejs", "closeDelimiter")
  @js.native
  def closeDelimiter: String = js.native
  @scala.inline
  def closeDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeDelimiter")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def compile(template: String): TemplateFunction | AsyncTemplateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFunction | AsyncTemplateFunction]
  @scala.inline
  def compile(template: String, opts: Optionsasyncfalseundefine): TemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TemplateFunction]
  @scala.inline
  def compile(template: String, opts: OptionsasyncfalseundefineAsync): ClientFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClientFunction]
  @scala.inline
  def compile(template: String, opts: Optionsasynctrueclientfal): AsyncTemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncTemplateFunction]
  @scala.inline
  def compile(template: String, opts: Optionsasynctrueclienttru): AsyncClientFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncClientFunction]
  @scala.inline
  def compile(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TemplateFunction | AsyncTemplateFunction]
  
  @scala.inline
  def compile_ClientFunction(template: String): ClientFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[ClientFunction]
  
  @scala.inline
  def compile_TemplateFunction(template: String): TemplateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFunction]
  
  @JSImport("ejs", "delimiter")
  @js.native
  def delimiter: js.UndefOr[String] = js.native
  @scala.inline
  def delimiter_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def escapeXML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")().asInstanceOf[String]
  @scala.inline
  def escapeXML(markup: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(markup.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ejs", "fileLoader")
  @js.native
  def fileLoader: fileLoader = js.native
  type fileLoader = js.Function1[/* path */ String, String | ToString]
  @scala.inline
  def fileLoader_=(x: fileLoader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileLoader")(x.asInstanceOf[js.Any])
  
  @JSImport("ejs", "localsName")
  @js.native
  def localsName: String = js.native
  @scala.inline
  def localsName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localsName")(x.asInstanceOf[js.Any])
  
  @JSImport("ejs", "name")
  @js.native
  val name: typings.ejs.ejsStrings.ejs = js.native
  
  @JSImport("ejs", "openDelimiter")
  @js.native
  def openDelimiter: String = js.native
  @scala.inline
  def openDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openDelimiter")(x.asInstanceOf[js.Any])
  
  @JSImport("ejs", "promiseImpl")
  @js.native
  def promiseImpl: js.UndefOr[PromiseConstructorLike] = js.native
  @scala.inline
  def promiseImpl_=(x: js.UndefOr[PromiseConstructorLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promiseImpl")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def render(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def render(template: String, data: Unit, opts: Optionsasyncfalse): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def render(template: String, data: Unit, opts: Optionsasyncneverundefine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def render(template: String, data: Unit, opts: Optionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def render(template: String, data: Unit, opts: Options): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
  @scala.inline
  def render(template: String, data: Data): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def render(template: String, data: Data, opts: Optionsasyncfalse): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def render(template: String, data: Data, opts: Optionsasyncneverundefine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def render(template: String, data: Data, opts: Optionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def render(template: String, data: Data, opts: Options): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
  
  @scala.inline
  def renderFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def renderFile(path: String, data: Unit, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def renderFile(path: String, data: Data): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def renderFile(path: String, data: Data, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def renderFile[T](path: String, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def renderFile[T](path: String, data: Data, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def renderFile[T](path: String, data: Data, opts: Options, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def render_Union(template: String): String | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String | js.Promise[String]]
  @scala.inline
  def render_Union(template: String, data: Data): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
  
  @scala.inline
  def resolveInclude(name: String, filename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInclude")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def resolveInclude(name: String, filename: String, isDir: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInclude")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], isDir.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type AsyncClientFunction = js.Function4[
    /* locals */ js.UndefOr[Data], 
    /* escape */ js.UndefOr[EscapeCallback], 
    /* include */ js.UndefOr[IncludeCallback], 
    /* rethrow */ js.UndefOr[RethrowCallback], 
    js.Promise[String]
  ]
  
  type AsyncTemplateFunction = js.Function1[/* data */ js.UndefOr[Data], js.Promise[String]]
  
  trait Cache_ extends StObject {
    
    /**
      * Get the cached intermediate JavaScript function for a template.
      *
      * @param key key for caching
      */
    def get(key: String): js.UndefOr[TemplateFunction]
    
    /**
      * Clear the entire cache.
      */
    def reset(): Unit
    
    /**
      * Cache the intermediate JavaScript function for a template.
      *
      * @param key key for caching
      * @param val cached function
      */
    def set(key: String, `val`: TemplateFunction): Unit
  }
  object Cache_ {
    
    @scala.inline
    def apply(
      get: String => js.UndefOr[TemplateFunction],
      reset: () => Unit,
      set: (String, TemplateFunction) => Unit
    ): Cache_ = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache_]
    }
    
    @scala.inline
    implicit class Cache_MutableBuilder[Self <: Cache_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => js.UndefOr[TemplateFunction]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, TemplateFunction) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type ClientFunction = js.Function4[
    /* locals */ js.UndefOr[Data], 
    /* escape */ js.UndefOr[EscapeCallback], 
    /* include */ js.UndefOr[IncludeCallback], 
    /* rethrow */ js.UndefOr[RethrowCallback], 
    String
  ]
  
  type Data = StringDictionary[js.Any]
  
  type EscapeCallback = js.Function1[/* markup */ js.UndefOr[js.Any], String]
  
  type IncludeCallback = js.Function2[/* path */ String, /* data */ js.UndefOr[Data], String]
  
  trait Options extends StObject {
    
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
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
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
  
  type RenderFileCallback[T] = js.Function2[/* err */ Error | Null, /* str */ String, T]
  
  type RethrowCallback = js.Function5[
    /* err */ Error, 
    /* str */ String, 
    /* filename */ js.UndefOr[String | Null], 
    /* lineno */ Double, 
    /* esc */ EscapeCallback, 
    scala.Nothing
  ]
  
  type TemplateFunction = js.Function1[/* data */ js.UndefOr[Data], String]
}
