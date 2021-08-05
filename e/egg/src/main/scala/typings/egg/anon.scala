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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrayLimit extends StObject {
    
    var arrayLimit: Double
    
    var depth: Double
    
    var parameterLimit: Double
  }
  object ArrayLimit {
    
    inline def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): ArrayLimit = {
      val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLimit]
    }
    
    extension [Self <: ArrayLimit](x: Self) {
      
      inline def setArrayLimit(value: Double): Self = StObject.set(x, "arrayLimit", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setParameterLimit(value: Double): Self = StObject.set(x, "parameterLimit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callback extends StObject {
    
    var callback: String
    
    var csrf: Boolean
    
    var limit: Double
    
    var whiteList: String | RegExp | (js.Array[String | RegExp])
  }
  object Callback {
    
    inline def apply(
      callback: String,
      csrf: Boolean,
      limit: Double,
      whiteList: String | RegExp | (js.Array[String | RegExp])
    ): Callback = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCsrf(value: Boolean): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setWhiteList(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
      
      inline def setWhiteListVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whiteList", js.Array(value :_*))
    }
  }
  
  trait CookieField extends StObject {
    
    /**
      * The locale value key in the cookie, default is locale.
      */
    var cookieField: String
    
    /**
      * Locale cookie expire time, default `1y`, If pass number value, the unit will be ms
      */
    var cookieMaxAge: String | Double
    
    /**
      * default value EN_US
      */
    var defaultLocale: String
    
    /**
      * i18n resource file dir, not recommend to change default value
      */
    var dir: String
    
    /**
      * custom the locale value field, default `query.locale`, you can modify this config, such as `query.lang`
      */
    var queryField: String
  }
  object CookieField {
    
    inline def apply(
      cookieField: String,
      cookieMaxAge: String | Double,
      defaultLocale: String,
      dir: String,
      queryField: String
    ): CookieField = {
      val __obj = js.Dynamic.literal(cookieField = cookieField.asInstanceOf[js.Any], cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], queryField = queryField.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieField]
    }
    
    extension [Self <: CookieField](x: Self) {
      
      inline def setCookieField(value: String): Self = StObject.set(x, "cookieField", value.asInstanceOf[js.Any])
      
      inline def setCookieMaxAge(value: String | Double): Self = StObject.set(x, "cookieMaxAge", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setQueryField(value: String): Self = StObject.set(x, "queryField", value.asInstanceOf[js.Any])
    }
  }
  
  trait Csp extends StObject {
    
    var csp: js.Any
    
    var csrf: js.Any
    
    var defaultMiddleware: String
    
    var domainWhiteList: js.Array[String]
    
    var hsts: js.Any
    
    var methodnoallow: EnableBoolean
    
    var noopen: EnableBoolean
    
    var protocolWhiteList: js.Array[String]
    
    var xframe: Value
    
    var xssProtection: js.Any
  }
  object Csp {
    
    inline def apply(
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
    
    extension [Self <: Csp](x: Self) {
      
      inline def setCsp(value: js.Any): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      inline def setCsrf(value: js.Any): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      inline def setDefaultMiddleware(value: String): Self = StObject.set(x, "defaultMiddleware", value.asInstanceOf[js.Any])
      
      inline def setDomainWhiteList(value: js.Array[String]): Self = StObject.set(x, "domainWhiteList", value.asInstanceOf[js.Any])
      
      inline def setDomainWhiteListVarargs(value: String*): Self = StObject.set(x, "domainWhiteList", js.Array(value :_*))
      
      inline def setHsts(value: js.Any): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      inline def setMethodnoallow(value: EnableBoolean): Self = StObject.set(x, "methodnoallow", value.asInstanceOf[js.Any])
      
      inline def setNoopen(value: EnableBoolean): Self = StObject.set(x, "noopen", value.asInstanceOf[js.Any])
      
      inline def setProtocolWhiteList(value: js.Array[String]): Self = StObject.set(x, "protocolWhiteList", value.asInstanceOf[js.Any])
      
      inline def setProtocolWhiteListVarargs(value: String*): Self = StObject.set(x, "protocolWhiteList", js.Array(value :_*))
      
      inline def setXframe(value: Value): Self = StObject.set(x, "xframe", value.asInstanceOf[js.Any])
      
      inline def setXssProtection(value: js.Any): Self = StObject.set(x, "xssProtection", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enable extends StObject {
    
    var enable: Boolean
    
    var enableTypes: js.Array[String]
    
    var encoding: String
    
    var extendTypes: Form
    
    var formLimit: String
    
    var ignore: IgnoreOrMatch
    
    var jsonLimit: String
    
    var `match`: IgnoreOrMatch
    
    var queryString: ArrayLimit
    
    var strict: Boolean
    
    var textLimit: String
  }
  object Enable {
    
    inline def apply(
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
    
    extension [Self <: Enable](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableTypes(value: js.Array[String]): Self = StObject.set(x, "enableTypes", value.asInstanceOf[js.Any])
      
      inline def setEnableTypesVarargs(value: String*): Self = StObject.set(x, "enableTypes", js.Array(value :_*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setExtendTypes(value: Form): Self = StObject.set(x, "extendTypes", value.asInstanceOf[js.Any])
      
      inline def setFormLimit(value: String): Self = StObject.set(x, "formLimit", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: IgnoreOrMatch): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreVarargs(value: IgnoreItem*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setJsonLimit(value: String): Self = StObject.set(x, "jsonLimit", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: IgnoreOrMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchFunction1(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchVarargs(value: IgnoreItem*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      inline def setQueryString(value: ArrayLimit): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setTextLimit(value: String): Self = StObject.set(x, "textLimit", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnableBoolean extends StObject {
    
    var enable: Boolean
  }
  object EnableBoolean {
    
    inline def apply(enable: Boolean): EnableBoolean = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableBoolean]
    }
    
    extension [Self <: EnableBoolean](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastReady extends StObject {
    
    /**
      * don't wait all plugins ready, default is true.
      */
    var fastReady: Boolean
    
    /**
      * dirs don't need watch, including subdirectories, use relative path
      */
    var ignoreDirs: js.Array[String]
    
    /**
      * whether override default watchDirs, default is false.
      */
    var overrideDefault: Boolean
    
    /**
      * whether reload on debug, default is true.
      */
    var reloadOnDebug: Boolean
    
    /**
      * whether to reload, use https://github.com/sindresorhus/multimatch
      */
    var reloadPattern: js.Array[String] | String
    
    /**
      * dirs needed watch, when files under these change, application will reload, use relative path
      */
    var watchDirs: js.Array[String]
  }
  object FastReady {
    
    inline def apply(
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
    
    extension [Self <: FastReady](x: Self) {
      
      inline def setFastReady(value: Boolean): Self = StObject.set(x, "fastReady", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDirs(value: js.Array[String]): Self = StObject.set(x, "ignoreDirs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDirsVarargs(value: String*): Self = StObject.set(x, "ignoreDirs", js.Array(value :_*))
      
      inline def setOverrideDefault(value: Boolean): Self = StObject.set(x, "overrideDefault", value.asInstanceOf[js.Any])
      
      inline def setReloadOnDebug(value: Boolean): Self = StObject.set(x, "reloadOnDebug", value.asInstanceOf[js.Any])
      
      inline def setReloadPattern(value: js.Array[String] | String): Self = StObject.set(x, "reloadPattern", value.asInstanceOf[js.Any])
      
      inline def setReloadPatternVarargs(value: String*): Self = StObject.set(x, "reloadPattern", js.Array(value :_*))
      
      inline def setWatchDirs(value: js.Array[String]): Self = StObject.set(x, "watchDirs", value.asInstanceOf[js.Any])
      
      inline def setWatchDirsVarargs(value: String*): Self = StObject.set(x, "watchDirs", js.Array(value :_*))
    }
  }
  
  trait FieldNameSize extends StObject {
    
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    var fieldSize: js.UndefOr[Double] = js.undefined
    
    var fields: js.UndefOr[Double] = js.undefined
    
    var fileSize: js.UndefOr[Double] = js.undefined
    
    var files: js.UndefOr[Double] = js.undefined
    
    var headerPairs: js.UndefOr[Double] = js.undefined
    
    var parts: js.UndefOr[Double] = js.undefined
  }
  object FieldNameSize {
    
    inline def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    extension [Self <: FieldNameSize](x: Self) {
      
      inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      inline def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      inline def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
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
  
  trait Form extends StObject {
    
    var form: js.Array[String]
    
    var json: js.Array[String]
    
    var text: js.Array[String]
  }
  object Form {
    
    inline def apply(form: js.Array[String], json: js.Array[String], text: js.Array[String]): Form = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Form]
    }
    
    extension [Self <: Form](x: Self) {
      
      inline def setForm(value: js.Array[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormVarargs(value: String*): Self = StObject.set(x, "form", js.Array(value :_*))
      
      inline def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    }
  }
  
  trait Ignore extends StObject {
    
    var ignore: Set[String]
  }
  object Ignore {
    
    inline def apply(ignore: Set[String]): Ignore = {
      val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ignore]
    }
    
    extension [Self <: Ignore](x: Self) {
      
      inline def setIgnore(value: Set[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<egg-logger.egg-logger.EggLoggerOptions> */
  trait PartialEggLoggerOptions extends StObject {
    
    var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
    
    var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
    
    var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
    
    var jsonFile: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[LoggerLevel] = js.undefined
    
    var outputJSON: js.UndefOr[Boolean] = js.undefined
  }
  object PartialEggLoggerOptions {
    
    inline def apply(): PartialEggLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEggLoggerOptions]
    }
    
    extension [Self <: PartialEggLoggerOptions](x: Self) {
      
      inline def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
      
      inline def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
      
      inline def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
      
      inline def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
      
      inline def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
      
      inline def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
      
      inline def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
      
      inline def setJsonFileUndefined: Self = StObject.set(x, "jsonFile", js.undefined)
      
      inline def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
      
      inline def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var enable: Boolean
    
    var value: SAMEORIGIN | DENY | `ALLOW-FROM`
  }
  object Value {
    
    inline def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): Value = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SAMEORIGIN | DENY | `ALLOW-FROM`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
