package typings.egg

import typings.egg.eggStrings.DENY
import typings.egg.eggStrings.SAMEORIGIN
import typings.egg.eggStrings.`ALLOW-FROM`
import typings.egg.eggStrings.duplicate
import typings.egg.eggStrings.ignore
import typings.egg.eggStrings.redirect
import typings.egg.mod.Context
import typings.egg.mod.IgnoreItem
import typings.egg.mod.IgnoreOrMatch
import typings.eggLogger.mod.LoggerLevel
import typings.node.urlMod.URL_
import typings.std.RegExp
import typings.std.Set
import typings.urllib.mod.HttpClientResponse
import typings.urllib.mod.RequestOptions2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ArrayLimit extends StObject {
    
    var arrayLimit: Double = js.native
    
    var depth: Double = js.native
    
    var parameterLimit: Double = js.native
  }
  object ArrayLimit {
    
    @scala.inline
    def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): ArrayLimit = {
      val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLimit]
    }
    
    @scala.inline
    implicit class ArrayLimitMutableBuilder[Self <: ArrayLimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    var callback: String = js.native
    
    var csrf: Boolean = js.native
    
    var limit: Double = js.native
    
    var whiteList: String | RegExp | (js.Array[String | RegExp]) = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(
      callback: String,
      csrf: Boolean,
      limit: Double,
      whiteList: String | RegExp | (js.Array[String | RegExp])
    ): Callback = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrf(value: Boolean): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteList(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteListVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whiteList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CookieField extends StObject {
    
    /**
      * The locale value key in the cookie, default is locale.
      */
    var cookieField: String = js.native
    
    /**
      * Locale cookie expire time, default `1y`, If pass number value, the unit will be ms
      */
    var cookieMaxAge: String | Double = js.native
    
    /**
      * default value EN_US
      */
    var defaultLocale: String = js.native
    
    /**
      * i18n resource file dir, not recommend to change default value
      */
    var dir: String = js.native
    
    /**
      * custom the locale value field, default `query.locale`, you can modify this config, such as `query.lang`
      */
    var queryField: String = js.native
  }
  object CookieField {
    
    @scala.inline
    def apply(
      cookieField: String,
      cookieMaxAge: String | Double,
      defaultLocale: String,
      dir: String,
      queryField: String
    ): CookieField = {
      val __obj = js.Dynamic.literal(cookieField = cookieField.asInstanceOf[js.Any], cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], queryField = queryField.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieField]
    }
    
    @scala.inline
    implicit class CookieFieldMutableBuilder[Self <: CookieField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieField(value: String): Self = StObject.set(x, "cookieField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieMaxAge(value: String | Double): Self = StObject.set(x, "cookieMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryField(value: String): Self = StObject.set(x, "queryField", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Csp extends StObject {
    
    var csp: js.Any = js.native
    
    var csrf: js.Any = js.native
    
    var defaultMiddleware: String = js.native
    
    var domainWhiteList: js.Array[String] = js.native
    
    var hsts: js.Any = js.native
    
    var methodnoallow: EnableBoolean = js.native
    
    var noopen: EnableBoolean = js.native
    
    var protocolWhiteList: js.Array[String] = js.native
    
    var xframe: Value = js.native
    
    var xssProtection: js.Any = js.native
  }
  object Csp {
    
    @scala.inline
    def apply(
      csp: js.Any,
      csrf: js.Any,
      defaultMiddleware: String,
      domainWhiteList: js.Array[String],
      hsts: js.Any,
      methodnoallow: EnableBoolean,
      noopen: EnableBoolean,
      protocolWhiteList: js.Array[String],
      xframe: Value,
      xssProtection: js.Any
    ): Csp = {
      val __obj = js.Dynamic.literal(csp = csp.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], defaultMiddleware = defaultMiddleware.asInstanceOf[js.Any], domainWhiteList = domainWhiteList.asInstanceOf[js.Any], hsts = hsts.asInstanceOf[js.Any], methodnoallow = methodnoallow.asInstanceOf[js.Any], noopen = noopen.asInstanceOf[js.Any], protocolWhiteList = protocolWhiteList.asInstanceOf[js.Any], xframe = xframe.asInstanceOf[js.Any], xssProtection = xssProtection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Csp]
    }
    
    @scala.inline
    implicit class CspMutableBuilder[Self <: Csp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsp(value: js.Any): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrf(value: js.Any): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMiddleware(value: String): Self = StObject.set(x, "defaultMiddleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWhiteList(value: js.Array[String]): Self = StObject.set(x, "domainWhiteList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWhiteListVarargs(value: String*): Self = StObject.set(x, "domainWhiteList", js.Array(value :_*))
      
      @scala.inline
      def setHsts(value: js.Any): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodnoallow(value: EnableBoolean): Self = StObject.set(x, "methodnoallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoopen(value: EnableBoolean): Self = StObject.set(x, "noopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolWhiteList(value: js.Array[String]): Self = StObject.set(x, "protocolWhiteList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolWhiteListVarargs(value: String*): Self = StObject.set(x, "protocolWhiteList", js.Array(value :_*))
      
      @scala.inline
      def setXframe(value: Value): Self = StObject.set(x, "xframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXssProtection(value: js.Any): Self = StObject.set(x, "xssProtection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Enable extends StObject {
    
    var enable: Boolean = js.native
    
    var enableTypes: js.Array[String] = js.native
    
    var encoding: String = js.native
    
    var extendTypes: Form = js.native
    
    var formLimit: String = js.native
    
    var ignore: IgnoreOrMatch = js.native
    
    var jsonLimit: String = js.native
    
    var `match`: IgnoreOrMatch = js.native
    
    var queryString: ArrayLimit = js.native
    
    var strict: Boolean = js.native
    
    var textLimit: String = js.native
  }
  object Enable {
    
    @scala.inline
    def apply(
      enable: Boolean,
      enableTypes: js.Array[String],
      encoding: String,
      extendTypes: Form,
      formLimit: String,
      ignore: IgnoreOrMatch,
      jsonLimit: String,
      `match`: IgnoreOrMatch,
      queryString: ArrayLimit,
      strict: Boolean,
      textLimit: String
    ): Enable = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enableTypes = enableTypes.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extendTypes = extendTypes.asInstanceOf[js.Any], formLimit = formLimit.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], textLimit = textLimit.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTypes(value: js.Array[String]): Self = StObject.set(x, "enableTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTypesVarargs(value: String*): Self = StObject.set(x, "enableTypes", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendTypes(value: Form): Self = StObject.set(x, "extendTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormLimit(value: String): Self = StObject.set(x, "formLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore(value: IgnoreOrMatch): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFunction1(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreVarargs(value: IgnoreItem*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setJsonLimit(value: String): Self = StObject.set(x, "jsonLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: IgnoreOrMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchFunction1(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatchVarargs(value: IgnoreItem*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      @scala.inline
      def setQueryString(value: ArrayLimit): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLimit(value: String): Self = StObject.set(x, "textLimit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnableBoolean extends StObject {
    
    var enable: Boolean = js.native
  }
  object EnableBoolean {
    
    @scala.inline
    def apply(enable: Boolean): EnableBoolean = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableBoolean]
    }
    
    @scala.inline
    implicit class EnableBooleanMutableBuilder[Self <: EnableBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FastReady extends StObject {
    
    /**
      * don't wait all plugins ready, default is true.
      */
    var fastReady: Boolean = js.native
    
    /**
      * dirs don't need watch, including subdirectories, use relative path
      */
    var ignoreDirs: js.Array[String] = js.native
    
    /**
      * whether override default watchDirs, default is false.
      */
    var overrideDefault: Boolean = js.native
    
    /**
      * whether reload on debug, default is true.
      */
    var reloadOnDebug: Boolean = js.native
    
    /**
      * whether to reload, use https://github.com/sindresorhus/multimatch
      */
    var reloadPattern: js.Array[String] | String = js.native
    
    /**
      * dirs needed watch, when files under these change, application will reload, use relative path
      */
    var watchDirs: js.Array[String] = js.native
  }
  object FastReady {
    
    @scala.inline
    def apply(
      fastReady: Boolean,
      ignoreDirs: js.Array[String],
      overrideDefault: Boolean,
      reloadOnDebug: Boolean,
      reloadPattern: js.Array[String] | String,
      watchDirs: js.Array[String]
    ): FastReady = {
      val __obj = js.Dynamic.literal(fastReady = fastReady.asInstanceOf[js.Any], ignoreDirs = ignoreDirs.asInstanceOf[js.Any], overrideDefault = overrideDefault.asInstanceOf[js.Any], reloadOnDebug = reloadOnDebug.asInstanceOf[js.Any], reloadPattern = reloadPattern.asInstanceOf[js.Any], watchDirs = watchDirs.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastReady]
    }
    
    @scala.inline
    implicit class FastReadyMutableBuilder[Self <: FastReady] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFastReady(value: Boolean): Self = StObject.set(x, "fastReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDirs(value: js.Array[String]): Self = StObject.set(x, "ignoreDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDirsVarargs(value: String*): Self = StObject.set(x, "ignoreDirs", js.Array(value :_*))
      
      @scala.inline
      def setOverrideDefault(value: Boolean): Self = StObject.set(x, "overrideDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadOnDebug(value: Boolean): Self = StObject.set(x, "reloadOnDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadPattern(value: js.Array[String] | String): Self = StObject.set(x, "reloadPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadPatternVarargs(value: String*): Self = StObject.set(x, "reloadPattern", js.Array(value :_*))
      
      @scala.inline
      def setWatchDirs(value: js.Array[String]): Self = StObject.set(x, "watchDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchDirsVarargs(value: String*): Self = StObject.set(x, "watchDirs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FieldNameSize extends StObject {
    
    var fieldNameSize: js.UndefOr[Double] = js.native
    
    var fieldSize: js.UndefOr[Double] = js.native
    
    var fields: js.UndefOr[Double] = js.native
    
    var fileSize: js.UndefOr[Double] = js.native
    
    var files: js.UndefOr[Double] = js.native
    
    var headerPairs: js.UndefOr[Double] = js.native
    
    var parts: js.UndefOr[Double] = js.native
  }
  object FieldNameSize {
    
    @scala.inline
    def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    @scala.inline
    implicit class FieldNameSizeMutableBuilder[Self <: FieldNameSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      @scala.inline
      def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      @scala.inline
      def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      @scala.inline
      def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
    def apply[T](url: String, callback: typings.urllib.mod.Callback[T]): Unit = js.native
    def apply[T](url: String, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
    def apply[T](url: String, options: RequestOptions2, callback: typings.urllib.mod.Callback[T]): Unit = js.native
    def apply[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
    def apply[T](url: URL_, callback: typings.urllib.mod.Callback[T]): Unit = js.native
    def apply[T](url: URL_, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
    def apply[T](url: URL_, options: RequestOptions2, callback: typings.urllib.mod.Callback[T]): Unit = js.native
  }
  
  @js.native
  trait Form extends StObject {
    
    var form: js.Array[String] = js.native
    
    var json: js.Array[String] = js.native
    
    var text: js.Array[String] = js.native
  }
  object Form {
    
    @scala.inline
    def apply(form: js.Array[String], json: js.Array[String], text: js.Array[String]): Form = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value :_*))
      
      @scala.inline
      def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Ignore extends StObject {
    
    var ignore: Set[String] = js.native
  }
  object Ignore {
    
    @scala.inline
    def apply(ignore: Set[String]): Ignore = {
      val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ignore]
    }
    
    @scala.inline
    implicit class IgnoreMutableBuilder[Self <: Ignore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: Set[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<egg-logger.egg-logger.EggLoggerOptions> */
  @js.native
  trait PartialEggLoggerOptions extends StObject {
    
    var allowDebugAtProd: js.UndefOr[Boolean] = js.native
    
    var buffer: js.UndefOr[Boolean] = js.native
    
    var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
    
    var consoleLevel: js.UndefOr[LoggerLevel] = js.native
    
    var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
    
    var jsonFile: js.UndefOr[String] = js.native
    
    var level: js.UndefOr[LoggerLevel] = js.native
    
    var outputJSON: js.UndefOr[Boolean] = js.native
  }
  object PartialEggLoggerOptions {
    
    @scala.inline
    def apply(): PartialEggLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEggLoggerOptions]
    }
    
    @scala.inline
    implicit class PartialEggLoggerOptionsMutableBuilder[Self <: PartialEggLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
      
      @scala.inline
      def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
      
      @scala.inline
      def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonFileUndefined: Self = StObject.set(x, "jsonFile", js.undefined)
      
      @scala.inline
      def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var enable: Boolean = js.native
    
    var value: SAMEORIGIN | DENY | `ALLOW-FROM` = js.native
  }
  object Value {
    
    @scala.inline
    def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): Value = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: SAMEORIGIN | DENY | `ALLOW-FROM`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
