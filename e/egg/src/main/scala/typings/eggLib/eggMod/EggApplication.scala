package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "EggApplication")
@js.native
class EggApplication ()
  extends eggDashCoreLib.eggDashCoreMod.EggCoreBase[eggDashViewLib.eggMod.EggAppConfig] {
  def this(options: eggDashCoreLib.eggDashCoreMod.EggCoreOptions) = this()
  /**
    * export context base classes, let framework can impl sub class and over context extend easily.
    */
  var ContextCookies: org.scalablytyped.runtime.Instantiable0[eggDashCookiesLib.eggDashCookiesMod.^] = js.native
  var ContextHttpClient: EggContextHttpClientConstructor = js.native
  var ContextLogger: org.scalablytyped.runtime.Instantiable2[
    /* ctx */ js.Any, 
    /* logger */ eggDashLoggerLib.eggDashLoggerMod.Logger[eggDashLoggerLib.eggDashLoggerMod.LoggerOptions], 
    eggDashLoggerLib.eggDashLoggerMod.EggContextLogger
  ] = js.native
  var Controller: org.scalablytyped.runtime.Instantiable0[Controller] = js.native
  var HttpClient: EggHttpConstructor = js.native
  var Service: org.scalablytyped.runtime.Instantiable0[Service] = js.native
  var Subscription: org.scalablytyped.runtime.Instantiable0[Subscription] = js.native
  /**
    * core logger for framework and plugins, log file is $HOME/logs/{appname}/egg-web
    */
  var coreLogger: eggDashLoggerLib.eggDashLoggerMod.EggLogger = js.native
  // tslint:disable-line
  /**
    * HttpClient instance
    */
  var httpclient: EggHttpClient = js.native
  /**
    * Logger for Application, wrapping app.coreLogger with context infomation
    *
    * @member {ContextLogger} Context#logger
    * @since 1.0.0
    * @example
    * ```js
    * this.logger.info('some request data: %j', this.request.body);
    * this.logger.warn('WARNING!!!!');
    * ```
    */
  var logger: eggDashLoggerLib.eggDashLoggerMod.EggLogger = js.native
  /**
    * All loggers contain logger, coreLogger and customLogger
    */
  var loggers: eggDashLoggerLib.eggDashLoggerMod.EggLoggers = js.native
  /**
    * messenger instance
    */
  var messenger: Messenger = js.native
  /**
    * get router
    */
  var router: Router = js.native
  /**
    * create a singleton instance
    */
  def addSingleton(name: java.lang.String, create: js.Any): scala.Unit = js.native
  /**
    * Create an anonymous context, the context isn't request level, so the request is mocked.
    * then you can use context level API like `ctx.service`
    * @member {String} EggApplication#createAnonymousContext
    * @param {Request} req - if you want to mock request like querystring, you can pass an object to this function.
    * @return {Context} context
    */
  def createAnonymousContext(): eggDashViewLib.eggMod.Context = js.native
  def createAnonymousContext(req: stdLib.Request): eggDashViewLib.eggMod.Context = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: java.lang.String): js.Promise[T] = js.native
  def curl[T](url: java.lang.String, opt: urllibLib.urllibMod.RequestOptions): js.Promise[T] = js.native
  /**
    * Get logger by name, it's equal to app.loggers['name'], but you can extend it with your own logical
    */
  def getLogger(name: java.lang.String): eggDashLoggerLib.eggDashLoggerMod.EggLogger = js.native
  def runSchedule(schedulePath: java.lang.String): js.Promise[_] = js.native
  /**
    * Alias to Router#url
    */
  def url(name: java.lang.String, params: js.Any): js.Any = js.native
}

