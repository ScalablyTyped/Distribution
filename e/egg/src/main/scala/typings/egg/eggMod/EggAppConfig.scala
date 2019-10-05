package typings.egg.eggMod

import org.scalablytyped.runtime.StringDictionary
import typings.egg.Anon_Buffer
import typings.egg.Anon_Callback
import typings.egg.Anon_CookieField
import typings.egg.Anon_Csp
import typings.egg.Anon_Enable
import typings.egg.Anon_FastReady
import typings.egg.Anon_Ignore
import typings.eggDashLogger.eggDashLoggerMod.EggLoggerOptions
import typings.node.Buffer
import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppConfig
  extends /* prop */ StringDictionary[js.Any] {
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
    * @property {String} formLimit - form body size limit, default 100kb
    * @property {String} jsonLimit - json body size limit, default 100kb
    * @property {Boolean} strict - json body strict mode, if set strict value true, then only receive object and array json body
    * @property {Number} queryString.arrayLimit - from item array length limit, default 100
    * @property {Number} queryString.depth - json value deep lenght, default 5
    * @property {Number} queryString.parameterLimit - paramter number limit ,default 1000
    * @property {string[]} enableTypes - parser will only parse when request type hits enableTypes, default is ['json', 'form']
    * @property {any} extendTypes - support extend types
    */
  var bodyParser: Anon_Enable
  /**
    * customLoader config
    */
  var customLoader: StringDictionary[CustomLoaderConfig]
  /** custom logger of egg */
  var customLogger: StringDictionary[EggLoggerOptions]
  var development: Anon_FastReady
  /**
    * It will ignore special keys when dumpConfig
    */
  var dump: Anon_Ignore
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
  var i18n: Anon_CookieField
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
  var jsonp: Anon_Callback
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
    * @property {Boolean} allowDebugAtProd - allow debug log at prod, defaults to true
    */
  var logger: EggLoggerConfig
  var middleware: js.Array[String]
  /**
    * The name of the application
    */
  var name: String
  /**
    * package.json
    */
  var pkg: js.Any
  var rundir: String
  var security: Anon_Csp
  /**
    * server timeout in milliseconds, default to 2 minutes.
    *
    * for special request, just use `ctx.req.setTimeout(ms)`
    *
    * @see https://nodejs.org/api/http.html#http_server_timeout
    */
  var serverTimeout: Double | Null
  var siteFile: PlainObject[String | Buffer]
  var static: Anon_Buffer with PlainObject[_]
  var watcher: PlainObject[_]
  var workerStartTimeout: Double
  def onClientError(err: Error, socket: Socket, app: EggApplication): ClientErrorResponse | js.Promise[ClientErrorResponse]
}

object EggAppConfig {
  @scala.inline
  def apply(
    HOME: String,
    baseDir: String,
    bodyParser: Anon_Enable,
    customLoader: StringDictionary[CustomLoaderConfig],
    customLogger: StringDictionary[EggLoggerOptions],
    development: Anon_FastReady,
    dump: Anon_Ignore,
    env: EggEnvType,
    hostHeaders: String,
    httpclient: HttpClientConfig,
    i18n: Anon_CookieField,
    ipHeaders: String,
    jsonp: Anon_Callback,
    keys: String,
    logger: EggLoggerConfig,
    middleware: js.Array[String],
    name: String,
    onClientError: (Error, Socket, EggApplication) => ClientErrorResponse | js.Promise[ClientErrorResponse],
    pkg: js.Any,
    rundir: String,
    security: Anon_Csp,
    siteFile: PlainObject[String | Buffer],
    static: Anon_Buffer with PlainObject[_],
    watcher: PlainObject[_],
    workerStartTimeout: Double,
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    serverTimeout: Int | Double = null
  ): EggAppConfig = {
    val __obj = js.Dynamic.literal(HOME = HOME, baseDir = baseDir, bodyParser = bodyParser, customLoader = customLoader, customLogger = customLogger, development = development, dump = dump, env = env.asInstanceOf[js.Any], hostHeaders = hostHeaders, httpclient = httpclient, i18n = i18n, ipHeaders = ipHeaders, jsonp = jsonp, keys = keys, logger = logger, middleware = middleware, name = name, onClientError = js.Any.fromFunction3(onClientError), pkg = pkg, rundir = rundir, security = security, siteFile = siteFile, static = static, watcher = watcher, workerStartTimeout = workerStartTimeout)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (serverTimeout != null) __obj.updateDynamic("serverTimeout")(serverTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
}

