package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.egg.anon.Callback
import typings.egg.anon.CookieField
import typings.egg.anon.Csp
import typings.egg.anon.Enable
import typings.egg.anon.FastReady
import typings.egg.anon.Ignore
import typings.eggLogger.mod.EggLoggerOptions
import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EggAppConfig
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  /**
    * The current HOME directory
    */
  var HOME: String
  
  var baseDir: String
  
  /**
    * The option of `bodyParser` middleware
    *
    * @member Config#bodyParser
    * @property {Boolean} enable - enable bodyParser or not, default to true
    * @property {String | RegExp | Function | Array} ignore - won't parse request body when url path hit ignore pattern, can not set `ignore` when `match` presented
    * @property {String | RegExp | Function | Array} match - will parse request body only when url path hit match pattern
    * @property {String} encoding - body encoding config, default utf8
    * @property {String} formLimit - form body size limit, default 1mb
    * @property {String} jsonLimit - json body size limit, default 1mb
    * @property {String} textLimit - json body size limit, default 1mb
    * @property {Boolean} strict - json body strict mode, if set strict value true, then only receive object and array json body
    * @property {Number} queryString.arrayLimit - from item array length limit, default 100
    * @property {Number} queryString.depth - json value deep lenght, default 5
    * @property {Number} queryString.parameterLimit - paramter number limit ,default 1000
    * @property {string[]} enableTypes - parser will only parse when request type hits enableTypes, default is ['json', 'form']
    * @property {any} extendTypes - support extend types
    */
  var bodyParser: Enable
  
  /**
    * customLoader config
    */
  var customLoader: StringDictionary[CustomLoaderConfig]
  
  /** custom logger of egg */
  var customLogger: StringDictionary[EggLoggerOptions]
  
  var development: FastReady
  
  /**
    * It will ignore special keys when dumpConfig
    */
  var dump: Ignore
  
  /**
    * The environment of egg
    */
  var env: EggEnvType
  
  var hostHeaders: String
  
  /** Configuration of httpclient in egg. */
  var httpclient: HttpClientConfig
  
  /**
    * I18n options
    */
  var i18n: CookieField
  
  /**
    * Detect request' ip from specified headers, not case-sensitive. Only worked when config.proxy set to true.
    */
  var ipHeaders: String
  
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  var jsonp: Callback
  
  /**
    * The key that signing cookies. It can contain multiple keys seperated by .
    */
  var keys: String
  
  /**
    * logger options
    * @member Config#logger
    * @property {String} dir - directory of log files
    * @property {String} encoding - log file encloding, defaults to utf8
    * @property {String} level - default log level, could be: DEBUG, INFO, WARN, ERROR or NONE, defaults to INFO in production
    * @property {String} consoleLevel - log level of stdout, defaults to INFO in local serverEnv, defaults to WARN in unittest, defaults to NONE elsewise
    * @property {Boolean} disableConsoleAfterReady - disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`.
    * @property {Boolean} outputJSON - log as JSON or not, defaults to false
    * @property {Boolean} buffer - if enabled, flush logs to disk at a certain frequency to improve performance, defaults to true
    * @property {String} errorLogName - file name of errorLogger
    * @property {String} coreLogName - file name of coreLogger
    * @property {String} agentLogName - file name of agent worker log
    * @property {Object} coreLogger - custom config of coreLogger
    * @property {Boolean} allowDebugAtProd - allow debug log at prod, defaults to false
    * @property {Boolean} enablePerformanceTimer - using performance.now() timer instead of Date.now() for more more precise milliseconds, defaults to false. e.g.: logger will set 1.456ms instead of 1ms.
    */
  var logger: EggLoggerConfig
  
  var middleware: js.Array[String]
  
  /**
    * The name of the application
    */
  var name: String
  
  def onClientError(err: js.Error, socket: Socket, app: EggApplication): ClientErrorResponse | js.Promise[ClientErrorResponse]
  
  /**
    * package.json
    */
  var pkg: Any
  
  var rundir: String
  
  var security: Csp
  
  /**
    * server timeout in milliseconds, default to 2 minutes.
    *
    * for special request, just use `ctx.req.setTimeout(ms)`
    *
    * @see https://nodejs.org/api/http.html#http_server_timeout
    */
  var serverTimeout: Double | Null
  
  var siteFile: PlainObject[String | Buffer]
  
  var watcher: PlainObject[Any]
  
  var workerStartTimeout: Double
}
object EggAppConfig {
  
  inline def apply(
    HOME: String,
    baseDir: String,
    bodyParser: Enable,
    customLoader: StringDictionary[CustomLoaderConfig],
    customLogger: StringDictionary[EggLoggerOptions],
    development: FastReady,
    dump: Ignore,
    env: EggEnvType,
    hostHeaders: String,
    httpclient: HttpClientConfig,
    i18n: CookieField,
    ipHeaders: String,
    jsonp: Callback,
    keys: String,
    logger: EggLoggerConfig,
    middleware: js.Array[String],
    name: String,
    onClientError: (js.Error, Socket, EggApplication) => ClientErrorResponse | js.Promise[ClientErrorResponse],
    pkg: Any,
    rundir: String,
    security: Csp,
    siteFile: PlainObject[String | Buffer],
    watcher: PlainObject[Any],
    workerStartTimeout: Double
  ): EggAppConfig = {
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], bodyParser = bodyParser.asInstanceOf[js.Any], customLoader = customLoader.asInstanceOf[js.Any], customLogger = customLogger.asInstanceOf[js.Any], development = development.asInstanceOf[js.Any], dump = dump.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], hostHeaders = hostHeaders.asInstanceOf[js.Any], httpclient = httpclient.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], ipHeaders = ipHeaders.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClientError = js.Any.fromFunction3(onClientError), pkg = pkg.asInstanceOf[js.Any], rundir = rundir.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], siteFile = siteFile.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any], workerStartTimeout = workerStartTimeout.asInstanceOf[js.Any], serverTimeout = null)
    __obj.asInstanceOf[EggAppConfig]
  }
  
  extension [Self <: EggAppConfig](x: Self) {
    
    inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    inline def setBodyParser(value: Enable): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
    
    inline def setCustomLoader(value: StringDictionary[CustomLoaderConfig]): Self = StObject.set(x, "customLoader", value.asInstanceOf[js.Any])
    
    inline def setCustomLogger(value: StringDictionary[EggLoggerOptions]): Self = StObject.set(x, "customLogger", value.asInstanceOf[js.Any])
    
    inline def setDevelopment(value: FastReady): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
    
    inline def setDump(value: Ignore): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: EggEnvType): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setHOME(value: String): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
    
    inline def setHostHeaders(value: String): Self = StObject.set(x, "hostHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpclient(value: HttpClientConfig): Self = StObject.set(x, "httpclient", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: CookieField): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setIpHeaders(value: String): Self = StObject.set(x, "ipHeaders", value.asInstanceOf[js.Any])
    
    inline def setJsonp(value: Callback): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: EggLoggerConfig): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMiddleware(value: js.Array[String]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareVarargs(value: String*): Self = StObject.set(x, "middleware", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnClientError(value: (js.Error, Socket, EggApplication) => ClientErrorResponse | js.Promise[ClientErrorResponse]): Self = StObject.set(x, "onClientError", js.Any.fromFunction3(value))
    
    inline def setPkg(value: Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setRundir(value: String): Self = StObject.set(x, "rundir", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: Csp): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setServerTimeout(value: Double): Self = StObject.set(x, "serverTimeout", value.asInstanceOf[js.Any])
    
    inline def setServerTimeoutNull: Self = StObject.set(x, "serverTimeout", null)
    
    inline def setSiteFile(value: PlainObject[String | Buffer]): Self = StObject.set(x, "siteFile", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: PlainObject[Any]): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
    
    inline def setWorkerStartTimeout(value: Double): Self = StObject.set(x, "workerStartTimeout", value.asInstanceOf[js.Any])
  }
}
