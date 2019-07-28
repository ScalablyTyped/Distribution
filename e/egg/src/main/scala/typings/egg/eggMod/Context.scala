package typings.egg.eggMod

import typings.accepts.acceptsMod.Accepts
import typings.eggDashLogger.eggDashLoggerMod.EggLogger
import typings.koa.koaMod.BaseContext
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.urllib.urllibMod.RequestOptions2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends BaseContext {
  /**
    * @see Request#accept
    */
  var accept: Accepts = js.native
  /**
    * @see Request#acceptJSON
    */
  var acceptJSON: Boolean = js.native
  var app: typings.eggDashView.eggMod.Application = js.native
  // The new 'cookies' instead of Koa's.
  var cookies: typings.eggDashCookies.eggDashCookiesMod.^ = js.native
  /**
    * Set the ctx.body.data value
    *
    * @member {Object} Context#data=
    * @example
    * ```js
    * ctx.data = {
    *   id: 1,
    *   name: 'fengmk2'
    * };
    * ```
    *
    * will get responce
    *
    * ```js
    * HTTP/1.1 200 OK
    *
    * {
    *   "data": {
    *     "id": 1,
    *     "name": "fengmk2"
    *   }
    * }
    * ```
    */
  var data: js.Any = js.native
  var helper: IHelper = js.native
  /**
    * locals is an object for view, you can use `app.locals` and `ctx.locals` to set variables,
    * which will be used as data when view is rendering.
    * The difference between `app.locals` and `ctx.locals` is the context level, `app.locals` is global level, and `ctx.locals` is request level. when you get `ctx.locals`, it will merge `app.locals`.
    *
    * when you set locals, only object is available
    *
    * ```js
    * this.locals = {
    *   a: 1
    * };
    * this.locals = {
    *   b: 1
    * };
    * this.locals.c = 1;
    * console.log(this.locals);
    * {
    *   a: 1,
    *   b: 1,
    *   c: 1,
    * };
    * ```
    *
    * `ctx.locals` has cache, it only merges `app.locals` once in one request.
    *
    * @member {Object} Context#locals
    */
  var locals: IApplicationLocals with IContextLocals = js.native
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
    * set ctx.body.meta value
    *
    * @example
    * ```js
    * ctx.meta = {
    *   count: 100
    * };
    * ```
    * will get responce
    *
    * ```js
    * HTTP/1.1 200 OK
    *
    * {
    *   "meta": {
    *     "count": 100
    *   }
    * }
    * ```
    */
  var meta: js.Any = js.native
  var originalUrl: String = js.native
  /**
    * Resource Parameters
    * @example
    * ##### ctx.params.id {string}
    *
    * `GET /api/users/1` => `'1'`
    *
    * ##### ctx.params.ids {Array<String>}
    *
    * `GET /api/users/1,2,3` => `['1', '2', '3']`
    *
    * ##### ctx.params.fields {Array<String>}
    *
    * Expect request return data fields, for example
    * `GET /api/users/1?fields=name,title` => `['name', 'title']`.
    *
    * ##### ctx.params.data {Object}
    *
    * Tht request data object
    *
    * ##### ctx.params.page {Number}
    *
    * Page number, `GET /api/users?page=10` => `10`
    *
    * ##### ctx.params.per_page {Number}
    *
    * The number of every page, `GET /api/users?per_page=20` => `20`
    */
  var params: js.Any = js.native
  /**
    * @see Request#accept
    */
  var queries: PlainObject[js.Array[String]] = js.native
  /**
    * @see Response#realStatus
    */
  var realStatus: Double = js.native
  // properties of koa.Context
  var req: IncomingMessage = js.native
  var request: typings.std.Request = js.native
  var res: ServerResponse = js.native
  var respond: js.UndefOr[Boolean] = js.native
  var response: typings.std.Response = js.native
  var service: IService = js.native
  /**
    * Request start time
    */
  var starttime: Double = js.native
  /**
    * alias to {@link locals}, compatible with koa that use this variable
    */
  var state: js.Any = js.native
  def __(key: String, values: String*): String = js.native
  /**
    * http request helper base on httpclient, it will auto save httpclient log.
    * Keep the same api with httpclient.request(url, args).
    * See https://github.com/node-modules/urllib#api-doc for more details.
    */
  def curl[T](url: String): js.Promise[T] = js.native
  def curl[T](url: String, opt: RequestOptions2): js.Promise[T] = js.native
  /**
    * get upload file stream
    * @example
    * ```js
    * const stream = await this.getFileStream();
    * // get other fields
    * console.log(stream.fields);
    * ```
    * @method Context#getFileStream
    * @param {Object} options
    * @return {ReadStream} stream
    * @since 1.0.0
    */
  def getFileStream(): js.Promise[FileStream] = js.native
  def getFileStream(options: GetFileStreamOptions): js.Promise[FileStream] = js.native
  /**
    * Get logger by name, it's equal to app.loggers['name'], but you can extend it with your own logical
    */
  def getLogger(name: String): EggLogger = js.native
  def gettext(key: String, values: String*): String = js.native
}

