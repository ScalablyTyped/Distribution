package typings.expressWinston

import typings.express.mod.ErrorRequestHandler
import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.expressWinston.anon.Body
import typings.logform.mod.Format_
import typings.std.Error
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-winston", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-winston", "bodyBlacklist")
  @js.native
  def bodyBlacklist: js.Array[String] = js.native
  inline def bodyBlacklist_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyBlacklist")(x.asInstanceOf[js.Any])
  
  @JSImport("express-winston", "bodyWhitelist")
  @js.native
  def bodyWhitelist: js.Array[String] = js.native
  inline def bodyWhitelist_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyWhitelist")(x.asInstanceOf[js.Any])
  
  @JSImport("express-winston", "defaultRequestFilter")
  @js.native
  def defaultRequestFilter: RequestFilter = js.native
  inline def defaultRequestFilter_=(x: RequestFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRequestFilter")(x.asInstanceOf[js.Any])
  
  @JSImport("express-winston", "defaultResponseFilter")
  @js.native
  def defaultResponseFilter: ResponseFilter = js.native
  inline def defaultResponseFilter_=(x: ResponseFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResponseFilter")(x.asInstanceOf[js.Any])
  
  inline def defaultSkip(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSkip")().asInstanceOf[Boolean]
  
  inline def errorLogger(options: ErrorLoggerOptions): ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorLogger")(options.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-winston", "ignoredRoutes")
  @js.native
  def ignoredRoutes: js.Array[String] = js.native
  inline def ignoredRoutes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoredRoutes")(x.asInstanceOf[js.Any])
  
  inline def logger(options: LoggerOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("express-winston", "requestWhitelist")
  @js.native
  def requestWhitelist: js.Array[String] = js.native
  inline def requestWhitelist_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestWhitelist")(x.asInstanceOf[js.Any])
  
  @JSImport("express-winston", "responseWhitelist")
  @js.native
  def responseWhitelist: js.Array[String] = js.native
  inline def responseWhitelist_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("responseWhitelist")(x.asInstanceOf[js.Any])
  
  trait BaseErrorLoggerOptions extends StObject {
    
    var baseMeta: js.UndefOr[js.Object] = js.undefined
    
    var blacklistedMetaFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.undefined
    
    var exceptionToMeta: js.UndefOr[ExceptionToMetaFunction] = js.undefined
    
    var format: js.UndefOr[Format_] = js.undefined
    
    var headerBlacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[String | DynamicLevelFunction] = js.undefined
    
    var meta: js.UndefOr[Boolean] = js.undefined
    
    var metaField: js.UndefOr[String] = js.undefined
    
    var msg: js.UndefOr[MessageTemplate] = js.undefined
    
    var requestField: js.UndefOr[String] = js.undefined
    
    var requestFilter: js.UndefOr[RequestFilter] = js.undefined
    
    var requestWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var responseField: js.UndefOr[String] = js.undefined
    
    var skip: js.UndefOr[ErrorRouteFilter] = js.undefined
  }
  object BaseErrorLoggerOptions {
    
    inline def apply(): BaseErrorLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseErrorLoggerOptions]
    }
    
    extension [Self <: BaseErrorLoggerOptions](x: Self) {
      
      inline def setBaseMeta(value: js.Object): Self = StObject.set(x, "baseMeta", value.asInstanceOf[js.Any])
      
      inline def setBaseMetaUndefined: Self = StObject.set(x, "baseMeta", js.undefined)
      
      inline def setBlacklistedMetaFields(value: js.Array[String]): Self = StObject.set(x, "blacklistedMetaFields", value.asInstanceOf[js.Any])
      
      inline def setBlacklistedMetaFieldsUndefined: Self = StObject.set(x, "blacklistedMetaFields", js.undefined)
      
      inline def setBlacklistedMetaFieldsVarargs(value: String*): Self = StObject.set(x, "blacklistedMetaFields", js.Array(value :_*))
      
      inline def setDynamicMeta(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => js.Object
      ): Self = StObject.set(x, "dynamicMeta", js.Any.fromFunction3(value))
      
      inline def setDynamicMetaUndefined: Self = StObject.set(x, "dynamicMeta", js.undefined)
      
      inline def setExceptionToMeta(value: /* err */ Error => js.Object): Self = StObject.set(x, "exceptionToMeta", js.Any.fromFunction1(value))
      
      inline def setExceptionToMetaUndefined: Self = StObject.set(x, "exceptionToMeta", js.undefined)
      
      inline def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeaderBlacklist(value: js.Array[String]): Self = StObject.set(x, "headerBlacklist", value.asInstanceOf[js.Any])
      
      inline def setHeaderBlacklistUndefined: Self = StObject.set(x, "headerBlacklist", js.undefined)
      
      inline def setHeaderBlacklistVarargs(value: String*): Self = StObject.set(x, "headerBlacklist", js.Array(value :_*))
      
      inline def setLevel(value: String | DynamicLevelFunction): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelFunction3(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => String
      ): Self = StObject.set(x, "level", js.Any.fromFunction3(value))
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaField(value: String): Self = StObject.set(x, "metaField", value.asInstanceOf[js.Any])
      
      inline def setMetaFieldUndefined: Self = StObject.set(x, "metaField", js.undefined)
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMsg(value: MessageTemplate): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgFunction2(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
      ): Self = StObject.set(x, "msg", js.Any.fromFunction2(value))
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setRequestField(value: String): Self = StObject.set(x, "requestField", value.asInstanceOf[js.Any])
      
      inline def setRequestFieldUndefined: Self = StObject.set(x, "requestField", js.undefined)
      
      inline def setRequestFilter(value: (/* req */ FilterRequest, /* propName */ String) => js.Any): Self = StObject.set(x, "requestFilter", js.Any.fromFunction2(value))
      
      inline def setRequestFilterUndefined: Self = StObject.set(x, "requestFilter", js.undefined)
      
      inline def setRequestWhitelist(value: js.Array[String]): Self = StObject.set(x, "requestWhitelist", value.asInstanceOf[js.Any])
      
      inline def setRequestWhitelistUndefined: Self = StObject.set(x, "requestWhitelist", js.undefined)
      
      inline def setRequestWhitelistVarargs(value: String*): Self = StObject.set(x, "requestWhitelist", js.Array(value :_*))
      
      inline def setResponseField(value: String): Self = StObject.set(x, "responseField", value.asInstanceOf[js.Any])
      
      inline def setResponseFieldUndefined: Self = StObject.set(x, "responseField", js.undefined)
      
      inline def setSkip(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => Boolean
      ): Self = StObject.set(x, "skip", js.Any.fromFunction3(value))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  trait BaseLoggerOptions extends StObject {
    
    var baseMeta: js.UndefOr[js.Object] = js.undefined
    
    var bodyBlacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var bodyWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.undefined
    
    var expressFormat: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Format_] = js.undefined
    
    var headerBlacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreRoute: js.UndefOr[RouteFilter] = js.undefined
    
    var ignoredRoutes: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[String | DynamicLevelFunction] = js.undefined
    
    var meta: js.UndefOr[Boolean] = js.undefined
    
    var metaField: js.UndefOr[String] = js.undefined
    
    var msg: js.UndefOr[MessageTemplate] = js.undefined
    
    var requestField: js.UndefOr[String] = js.undefined
    
    var requestFilter: js.UndefOr[RequestFilter] = js.undefined
    
    var requestWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var responseField: js.UndefOr[String] = js.undefined
    
    var responseFilter: js.UndefOr[ResponseFilter] = js.undefined
    
    var responseWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var skip: js.UndefOr[RouteFilter] = js.undefined
    
    var statusLevels: js.UndefOr[Boolean | StatusLevels] = js.undefined
  }
  object BaseLoggerOptions {
    
    inline def apply(): BaseLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLoggerOptions]
    }
    
    extension [Self <: BaseLoggerOptions](x: Self) {
      
      inline def setBaseMeta(value: js.Object): Self = StObject.set(x, "baseMeta", value.asInstanceOf[js.Any])
      
      inline def setBaseMetaUndefined: Self = StObject.set(x, "baseMeta", js.undefined)
      
      inline def setBodyBlacklist(value: js.Array[String]): Self = StObject.set(x, "bodyBlacklist", value.asInstanceOf[js.Any])
      
      inline def setBodyBlacklistUndefined: Self = StObject.set(x, "bodyBlacklist", js.undefined)
      
      inline def setBodyBlacklistVarargs(value: String*): Self = StObject.set(x, "bodyBlacklist", js.Array(value :_*))
      
      inline def setBodyWhitelist(value: js.Array[String]): Self = StObject.set(x, "bodyWhitelist", value.asInstanceOf[js.Any])
      
      inline def setBodyWhitelistUndefined: Self = StObject.set(x, "bodyWhitelist", js.undefined)
      
      inline def setBodyWhitelistVarargs(value: String*): Self = StObject.set(x, "bodyWhitelist", js.Array(value :_*))
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setDynamicMeta(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => js.Object
      ): Self = StObject.set(x, "dynamicMeta", js.Any.fromFunction3(value))
      
      inline def setDynamicMetaUndefined: Self = StObject.set(x, "dynamicMeta", js.undefined)
      
      inline def setExpressFormat(value: Boolean): Self = StObject.set(x, "expressFormat", value.asInstanceOf[js.Any])
      
      inline def setExpressFormatUndefined: Self = StObject.set(x, "expressFormat", js.undefined)
      
      inline def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeaderBlacklist(value: js.Array[String]): Self = StObject.set(x, "headerBlacklist", value.asInstanceOf[js.Any])
      
      inline def setHeaderBlacklistUndefined: Self = StObject.set(x, "headerBlacklist", js.undefined)
      
      inline def setHeaderBlacklistVarargs(value: String*): Self = StObject.set(x, "headerBlacklist", js.Array(value :_*))
      
      inline def setIgnoreRoute(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
      ): Self = StObject.set(x, "ignoreRoute", js.Any.fromFunction2(value))
      
      inline def setIgnoreRouteUndefined: Self = StObject.set(x, "ignoreRoute", js.undefined)
      
      inline def setIgnoredRoutes(value: js.Array[String]): Self = StObject.set(x, "ignoredRoutes", value.asInstanceOf[js.Any])
      
      inline def setIgnoredRoutesUndefined: Self = StObject.set(x, "ignoredRoutes", js.undefined)
      
      inline def setIgnoredRoutesVarargs(value: String*): Self = StObject.set(x, "ignoredRoutes", js.Array(value :_*))
      
      inline def setLevel(value: String | DynamicLevelFunction): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelFunction3(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ Error) => String
      ): Self = StObject.set(x, "level", js.Any.fromFunction3(value))
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaField(value: String): Self = StObject.set(x, "metaField", value.asInstanceOf[js.Any])
      
      inline def setMetaFieldUndefined: Self = StObject.set(x, "metaField", js.undefined)
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMsg(value: MessageTemplate): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgFunction2(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
      ): Self = StObject.set(x, "msg", js.Any.fromFunction2(value))
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setRequestField(value: String): Self = StObject.set(x, "requestField", value.asInstanceOf[js.Any])
      
      inline def setRequestFieldUndefined: Self = StObject.set(x, "requestField", js.undefined)
      
      inline def setRequestFilter(value: (/* req */ FilterRequest, /* propName */ String) => js.Any): Self = StObject.set(x, "requestFilter", js.Any.fromFunction2(value))
      
      inline def setRequestFilterUndefined: Self = StObject.set(x, "requestFilter", js.undefined)
      
      inline def setRequestWhitelist(value: js.Array[String]): Self = StObject.set(x, "requestWhitelist", value.asInstanceOf[js.Any])
      
      inline def setRequestWhitelistUndefined: Self = StObject.set(x, "requestWhitelist", js.undefined)
      
      inline def setRequestWhitelistVarargs(value: String*): Self = StObject.set(x, "requestWhitelist", js.Array(value :_*))
      
      inline def setResponseField(value: String): Self = StObject.set(x, "responseField", value.asInstanceOf[js.Any])
      
      inline def setResponseFieldUndefined: Self = StObject.set(x, "responseField", js.undefined)
      
      inline def setResponseFilter(value: (/* res */ FilterResponse, /* propName */ String) => js.Any): Self = StObject.set(x, "responseFilter", js.Any.fromFunction2(value))
      
      inline def setResponseFilterUndefined: Self = StObject.set(x, "responseFilter", js.undefined)
      
      inline def setResponseWhitelist(value: js.Array[String]): Self = StObject.set(x, "responseWhitelist", value.asInstanceOf[js.Any])
      
      inline def setResponseWhitelistUndefined: Self = StObject.set(x, "responseWhitelist", js.undefined)
      
      inline def setResponseWhitelistVarargs(value: String*): Self = StObject.set(x, "responseWhitelist", js.Array(value :_*))
      
      inline def setSkip(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
      ): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStatusLevels(value: Boolean | StatusLevels): Self = StObject.set(x, "statusLevels", value.asInstanceOf[js.Any])
      
      inline def setStatusLevelsUndefined: Self = StObject.set(x, "statusLevels", js.undefined)
    }
  }
  
  type DynamicLevelFunction = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* err */ Error, 
    String
  ]
  
  type DynamicMetaFunction = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* err */ Error, 
    js.Object
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressWinston.mod.ErrorLoggerOptionsWithTransports
    - typings.expressWinston.mod.ErrorLoggerOptionsWithWinstonInstance
  */
  trait ErrorLoggerOptions extends StObject
  object ErrorLoggerOptions {
    
    inline def ErrorLoggerOptionsWithTransports(transports: js.Array[typings.winstonTransport.mod.^]): typings.expressWinston.mod.ErrorLoggerOptionsWithTransports = {
      val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressWinston.mod.ErrorLoggerOptionsWithTransports]
    }
    
    inline def ErrorLoggerOptionsWithWinstonInstance(winstonInstance: Logger): typings.expressWinston.mod.ErrorLoggerOptionsWithWinstonInstance = {
      val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressWinston.mod.ErrorLoggerOptionsWithWinstonInstance]
    }
  }
  
  trait ErrorLoggerOptionsWithTransports
    extends StObject
       with BaseErrorLoggerOptions
       with ErrorLoggerOptions {
    
    var transports: js.Array[typings.winstonTransport.mod.^]
  }
  object ErrorLoggerOptionsWithTransports {
    
    inline def apply(transports: js.Array[typings.winstonTransport.mod.^]): ErrorLoggerOptionsWithTransports = {
      val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLoggerOptionsWithTransports]
    }
    
    extension [Self <: ErrorLoggerOptionsWithTransports](x: Self) {
      
      inline def setTransports(value: js.Array[typings.winstonTransport.mod.^]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsVarargs(value: typings.winstonTransport.mod.^ *): Self = StObject.set(x, "transports", js.Array(value :_*))
    }
  }
  
  trait ErrorLoggerOptionsWithWinstonInstance
    extends StObject
       with BaseErrorLoggerOptions
       with ErrorLoggerOptions {
    
    var winstonInstance: Logger
  }
  object ErrorLoggerOptionsWithWinstonInstance {
    
    inline def apply(winstonInstance: Logger): ErrorLoggerOptionsWithWinstonInstance = {
      val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLoggerOptionsWithWinstonInstance]
    }
    
    extension [Self <: ErrorLoggerOptionsWithWinstonInstance](x: Self) {
      
      inline def setWinstonInstance(value: Logger): Self = StObject.set(x, "winstonInstance", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorRouteFilter = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* err */ Error, 
    Boolean
  ]
  
  type ExceptionToMetaFunction = js.Function1[/* err */ Error, js.Object]
  
  @js.native
  trait ExpressWinstonRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var _routeWhitelists: Body = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait FilterRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait FilterResponse
    extends Response[js.Any, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressWinston.mod.LoggerOptionsWithTransports
    - typings.expressWinston.mod.LoggerOptionsWithWinstonInstance
  */
  trait LoggerOptions extends StObject
  object LoggerOptions {
    
    inline def LoggerOptionsWithTransports(transports: js.Array[typings.winstonTransport.mod.^]): typings.expressWinston.mod.LoggerOptionsWithTransports = {
      val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressWinston.mod.LoggerOptionsWithTransports]
    }
    
    inline def LoggerOptionsWithWinstonInstance(winstonInstance: Logger): typings.expressWinston.mod.LoggerOptionsWithWinstonInstance = {
      val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressWinston.mod.LoggerOptionsWithWinstonInstance]
    }
  }
  
  trait LoggerOptionsWithTransports
    extends StObject
       with BaseLoggerOptions
       with LoggerOptions {
    
    var transports: js.Array[typings.winstonTransport.mod.^]
  }
  object LoggerOptionsWithTransports {
    
    inline def apply(transports: js.Array[typings.winstonTransport.mod.^]): LoggerOptionsWithTransports = {
      val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerOptionsWithTransports]
    }
    
    extension [Self <: LoggerOptionsWithTransports](x: Self) {
      
      inline def setTransports(value: js.Array[typings.winstonTransport.mod.^]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsVarargs(value: typings.winstonTransport.mod.^ *): Self = StObject.set(x, "transports", js.Array(value :_*))
    }
  }
  
  trait LoggerOptionsWithWinstonInstance
    extends StObject
       with BaseLoggerOptions
       with LoggerOptions {
    
    var winstonInstance: Logger
  }
  object LoggerOptionsWithWinstonInstance {
    
    inline def apply(winstonInstance: Logger): LoggerOptionsWithWinstonInstance = {
      val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerOptionsWithWinstonInstance]
    }
    
    extension [Self <: LoggerOptionsWithWinstonInstance](x: Self) {
      
      inline def setWinstonInstance(value: Logger): Self = StObject.set(x, "winstonInstance", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageTemplate = String | (js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    String
  ])
  
  type RequestFilter = js.Function2[/* req */ FilterRequest, /* propName */ String, js.Any]
  
  type ResponseFilter = js.Function2[/* res */ FilterResponse, /* propName */ String, js.Any]
  
  type RouteFilter = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    Boolean
  ]
  
  trait StatusLevels extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var warn: js.UndefOr[String] = js.undefined
  }
  object StatusLevels {
    
    inline def apply(): StatusLevels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusLevels]
    }
    
    extension [Self <: StatusLevels](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
