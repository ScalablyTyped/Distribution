package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends nodeLib.httpMod.IncomingMessage
     with expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request {
  /**
    * Return an array of Accepted media types
    * ordered from highest quality to lowest.
    */
  var accepted: js.Array[MediaType] = js.native
  @JSName("app")
  var app_Original: Application = js.native
  var baseUrl: java.lang.String = js.native
  //body: { username: string; password: string; remember: boolean; title: string; };
  var body: js.Any = js.native
  //cookies: { string; remember: boolean; };
  var cookies: js.Any = js.native
  /**
    * Check if the request is fresh, aka
    * Last-Modified and/or the ETag
    * still match.
    */
  var fresh: scala.Boolean = js.native
  /**
    * @deprecated Use hostname instead.
    */
  var host: java.lang.String = js.native
  /**
    * Parse the "Host" header field hostname.
    */
  var hostname: java.lang.String = js.native
  /**
    * Return the remote address, or when
    * "trust proxy" is `true` return
    * the upstream addr.
    */
  var ip: java.lang.String = js.native
  /**
    * When "trust proxy" is `true`, parse
    * the "X-Forwarded-For" ip address list.
    *
    * For example if the value were "client, proxy1, proxy2"
    * you would receive the array `["client", "proxy1", "proxy2"]`
    * where "proxy2" is the furthest down-stream.
    */
  var ips: js.Array[java.lang.String] = js.native
  @JSName("method")
  var method_Request: java.lang.String = js.native
  var next: js.UndefOr[NextFunction] = js.native
  var originalUrl: java.lang.String = js.native
  var params: js.Any = js.native
  /**
    * Short-hand for `url.parse(req.url).pathname`.
    */
  var path: java.lang.String = js.native
  /**
    * Return the protocol string "http" or "https"
    * when requested with TLS. When the "trust proxy"
    * setting is enabled the "X-Forwarded-Proto" header
    * field will be trusted. If you're running behind
    * a reverse proxy that supplies https for you this
    * may be enabled.
    */
  var protocol: java.lang.String = js.native
  var query: js.Any = js.native
  /**
    * After middleware.init executed, Request will contain res and next properties
    * See: express/lib/middleware/init.js
    */
  var res: js.UndefOr[Response] = js.native
  var route: js.Any = js.native
  /**
    * Short-hand for:
    *
    *    req.protocol == 'https'
    */
  var secure: scala.Boolean = js.native
  var signedCookies: js.Any = js.native
  /**
    * Check if the request is stale, aka
    * "Last-Modified" and / or the "ETag" for the
    * resource has changed.
    */
  var stale: scala.Boolean = js.native
  /**
    * Return subdomains as an array.
    *
    * Subdomains are the dot-separated parts of the host before the main domain of
    * the app. By default, the domain of the app is assumed to be the last two
    * parts of the host. This can be changed by setting "subdomain offset".
    *
    * For example, if the domain is "tobi.ferrets.example.com":
    * If "subdomain offset" is not set, req.subdomains is `["ferrets", "tobi"]`.
    * If "subdomain offset" is 3, req.subdomains is `["tobi"]`.
    */
  var subdomains: js.Array[java.lang.String] = js.native
  @JSName("url")
  var url_Request: java.lang.String = js.native
  /**
    * Check if the request was an _XMLHttpRequest_.
    */
  var xhr: scala.Boolean = js.native
  /**
    * Check if the given `type(s)` is acceptable, returning
    * the best match when true, otherwise `undefined`, in which
    * case you should respond with 406 "Not Acceptable".
    *
    * The `type` value may be a single mime type string
    * such as "application/json", the extension name
    * such as "json", a comma-delimted list such as "json, html, text/plain",
    * or an array `["json", "html", "text/plain"]`. When a list
    * or array is given the _best_ match, if any is returned.
    *
    * Examples:
    *
    *     // Accept: text/html
    *     req.accepts('html');
    *     // => "html"
    *
    *     // Accept: text/ *, application/json
    *     req.accepts('html');
    *     // => "html"
    *     req.accepts('text/html');
    *     // => "text/html"
    *     req.accepts('json, text');
    *     // => "json"
    *     req.accepts('application/json');
    *     // => "application/json"
    *
    *     // Accept: text/ *, application/json
    *     req.accepts('image/png');
    *     req.accepts('png');
    *     // => undefined
    *
    *     // Accept: text/ *;q=.5, application/json
    *     req.accepts(['html', 'json']);
    *     req.accepts('html, json');
    *     // => "json"
    */
  def accepts(): js.Array[java.lang.String] = js.native
  def accepts(`type`: java.lang.String*): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def accepts(`type`: java.lang.String): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def accepts(`type`: js.Array[java.lang.String]): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  /**
    * Returns the first accepted charset of the specified character sets,
    * based on the request's Accept-Charset HTTP header field.
    * If none of the specified charsets is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsCharsets(): js.Array[java.lang.String] = js.native
  def acceptsCharsets(charset: java.lang.String*): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def acceptsCharsets(charset: java.lang.String): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def acceptsCharsets(charset: js.Array[java.lang.String]): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  /**
    * Returns the first accepted encoding of the specified encodings,
    * based on the request's Accept-Encoding HTTP header field.
    * If none of the specified encodings is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsEncodings(): js.Array[java.lang.String] = js.native
  def acceptsEncodings(encoding: java.lang.String*): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def acceptsEncodings(encoding: java.lang.String): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def acceptsEncodings(encoding: js.Array[java.lang.String]): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  /**
    * Returns the first accepted language of the specified languages,
    * based on the request's Accept-Language HTTP header field.
    * If none of the specified languages is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsLanguages(): js.Array[java.lang.String] = js.native
  def acceptsLanguages(lang: java.lang.String*): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def acceptsLanguages(lang: java.lang.String): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  def acceptsLanguages(lang: js.Array[java.lang.String]): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request, res: Response): js.Any = js.native
  def app(req: Request, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: Response): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  /** Clear cookie `name`. */
  def clearCookie(name: java.lang.String): Response = js.native
  def clearCookie(name: java.lang.String, options: js.Any): Response = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def get(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /**
    * Return request header.
    *
    * The `Referrer` header field is special-cased,
    * both `Referrer` and `Referer` are interchangeable.
    *
    * Examples:
    *
    *     req.get('Content-Type');
    *     // => "text/plain"
    *
    *     req.get('content-type');
    *     // => "text/plain"
    *
    *     req.get('Something');
    *     // => undefined
    *
    * Aliased as `req.header()`.
    */
  @JSName("get")
  def `get_set-cookie`(
    name: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibStrings.`set-cookie`
  ): js.UndefOr[js.Array[java.lang.String]] = js.native
  def header(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  @JSName("header")
  def `header_set-cookie`(
    name: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibStrings.`set-cookie`
  ): js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Check if the incoming request contains the "Content-Type"
    * header field, and it contains the give mime `type`.
    *
    * Examples:
    *
    *      // With Content-Type: text/html; charset=utf-8
    *      req.is('html');
    *      req.is('text/html');
    *      req.is('text/ *');
    *      // => true
    *
    *      // When Content-Type is application/json
    *      req.is('json');
    *      req.is('application/json');
    *      req.is('application/ *');
    *      // => true
    *
    *      req.is('html');
    *      // => false
    */
  def is(`type`: java.lang.String): java.lang.String | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibNumbers.`false` = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * @deprecated since 4.11 Use either req.params, req.body or req.query, as applicable.
    *
    * Return the value of param `name` when present or `defaultValue`.
    *
    *  - Checks route placeholders, ex: _/user/:id_
    *  - Checks body params, ex: id=12, {"id":12}
    *  - Checks query string params, ex: ?id=12
    *
    * To utilize request bodies, `req.body`
    * should be an object. This can be done by using
    * the `connect.bodyParser()` middleware.
    */
  def param(name: java.lang.String): java.lang.String = js.native
  def param(name: java.lang.String, defaultValue: js.Any): java.lang.String = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Parse Range header field, capping to the given `size`.
    *
    * Unspecified ranges such as "0-" require knowledge of your resource length. In
    * the case of a byte range this is of course the total number of bytes.
    * If the Range header field is not given `undefined` is returned.
    * If the Range header field is given, return value is a result of range-parser.
    * See more ./types/range-parser/index.d.ts
    *
    * NOTE: remember that ranges are inclusive, so for example "Range: users=0-3"
    * should respond with 4 users when available, not 3.
    *
    */
  def range(size: scala.Double): js.UndefOr[
    rangeDashParserLib.rangeDashParserMod.Ranges | rangeDashParserLib.rangeDashParserMod.Result
  ] = js.native
  def range(size: scala.Double, options: rangeDashParserLib.rangeDashParserMod.Options): js.UndefOr[
    rangeDashParserLib.rangeDashParserMod.Ranges | rangeDashParserLib.rangeDashParserMod.Result
  ] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
}

