package typings.egg.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.egg.anon.FnCall
import typings.eggCore.mod.EggCoreBase
import typings.eggCore.mod.EggCoreOptions
import typings.eggLogger.mod.EggContextLogger
import typings.eggLogger.mod.EggLoggers
import typings.eggLogger.mod.Logger
import typings.eggLogger.mod.LoggerOptions
import typings.node.urlMod.URL_
import typings.urllib.mod.Callback
import typings.urllib.mod.HttpClientResponse
import typings.urllib.mod.RequestOptions2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("egg", "EggApplication")
@js.native
class EggApplication () extends EggCoreBase[EggAppConfig] {
  def this(options: EggCoreOptions) = this()
  
  /**
    * export context base classes, let framework can impl sub class and over context extend easily.
    */
  var ContextCookies: Instantiable0[typings.eggCookies.mod.^] = js.native
  
  var ContextHttpClient: EggContextHttpClientConstructor = js.native
  
  var ContextLogger: Instantiable2[/* ctx */ js.Any, /* logger */ Logger[LoggerOptions], EggContextLogger] = js.native
  
  var Controller: Instantiable0[typings.egg.mod.Controller] = js.native
  
  var HttpClient: EggHttpConstructor = js.native
  
  var Service: Instantiable0[typings.egg.mod.Service] = js.native
  
  var Subscription: Instantiable0[typings.egg.mod.Subscription] = js.native
  
  /**
    * create a singleton instance
    */
  def addSingleton(name: String, create: js.Any): Unit = js.native
  
  /**
    * core logger for framework and plugins, log file is $HOME/logs/{appname}/egg-web
    */
  var coreLogger: EggLogger = js.native
  
  /**
    * Create an anonymous context, the context isn't request level, so the request is mocked.
    * then you can use context level API like `ctx.service`
    * @member {String} EggApplication#createAnonymousContext
    * @param {Request} req - if you want to mock request like querystring, you can pass an object to this function.
    * @return {Context} context
    */
  def createAnonymousContext(): Context = js.native
  def createAnonymousContext(req: Request): Context = js.native
  
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: String, callback: Callback[T]): Unit = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: String, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: String, options: RequestOptions2, callback: Callback[T]): Unit = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: URL_, callback: Callback[T]): Unit = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: URL_, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: URL_, options: RequestOptions2, callback: Callback[T]): Unit = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  @JSName("curl")
  var curl_Original: FnCall = js.native
  
  /**
    * Get logger by name, it's equal to app.loggers['name'], but you can extend it with your own logical
    */
  def getLogger(name: String): EggLogger = js.native
  
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
  var logger: EggLogger = js.native
  
  /**
    * All loggers contain logger, coreLogger and customLogger
    */
  var loggers: EggLoggers = js.native
  
  /**
    * messenger instance
    */
  var messenger: Messenger = js.native
  
  /**
    * get router
    */
  var router: Router = js.native
  
  def runSchedule(schedulePath: String): js.Promise[_] = js.native
  
  /**
    * Alias to Router#url
    */
  def url(name: String, params: js.Any): js.Any = js.native
}
