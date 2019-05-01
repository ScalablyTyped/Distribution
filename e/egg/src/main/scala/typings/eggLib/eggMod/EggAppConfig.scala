package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggAppConfig
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The current HOME directory
    */
  var HOME: java.lang.String = js.native
  var baseDir: java.lang.String = js.native
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
  var bodyParser: eggLib.Anon_Enable = js.native
  /**
    * customLoader config
    */
  var customLoader: org.scalablytyped.runtime.StringDictionary[CustomLoaderConfig] = js.native
  var development: eggLib.Anon_FastReady = js.native
  /**
    * It will ignore special keys when dumpConfig
    */
  var dump: eggLib.Anon_Ignore = js.native
  /**
    * The environment of egg
    */
  var env: EggEnvType = js.native
  var hostHeaders: java.lang.String = js.native
  /** Configuration of httpclient in egg. */
  var httpclient: HttpClientConfig = js.native
  /**
    * I18n options
    */
  var i18n: eggLib.Anon_CookieField = js.native
  /**
    * Detect request' ip from specified headers, not case-sensitive. Only worked when config.proxy set to true.
    */
  var ipHeaders: java.lang.String = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  @JSName("jsonp")
  var jsonp_Original: eggLib.Anon_Callback = js.native
  /**
    * The key that signing cookies. It can contain multiple keys seperated by .
    */
  var keys: java.lang.String = js.native
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
  var logger: eggLib.Anon_AgentLogName = js.native
  var middleware: js.Array[java.lang.String] = js.native
  /**
    * The name of the application
    */
  var name: java.lang.String = js.native
  /**
    * package.json
    */
  var pkg: js.Any = js.native
  var rundir: java.lang.String = js.native
  var security: eggLib.Anon_Csp = js.native
  /**
    * server timeout in milliseconds, default to 2 minutes.
    *
    * for special request, just use `ctx.req.setTimeout(ms)`
    *
    * @see https://nodejs.org/api/http.html#http_server_timeout
    */
  var serverTimeout: scala.Double | scala.Null = js.native
  var siteFile: PlainObject[java.lang.String | nodeLib.Buffer] = js.native
  var static: eggLib.Anon_Buffer with PlainObject[_] = js.native
  var watcher: PlainObject[_] = js.native
  var workerStartTimeout: scala.Double = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  def jsonp(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  def jsonp(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  def jsonp(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  def jsonp(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.fsMod.MakeDirectoryOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  def jsonp(
    path: nodeLib.fsMod.PathLike,
    options: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  def jsonp(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def onClientError(err: stdLib.Error, socket: nodeLib.netMod.Socket, app: EggApplication): ClientErrorResponse | js.Promise[ClientErrorResponse] = js.native
}

