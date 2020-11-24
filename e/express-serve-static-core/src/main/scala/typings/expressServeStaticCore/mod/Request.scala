package typings.expressServeStaticCore.mod

import typings.expressServeStaticCore.expressServeStaticCoreBooleans.`false`
import typings.expressServeStaticCore.expressServeStaticCoreStrings.`set-cookie`
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.rangeParser.mod.Options
import typings.rangeParser.mod.Ranges
import typings.rangeParser.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request[P, ResBody, ReqBody, ReqQuery]
  extends IncomingMessage
     with typings.expressServeStaticCore.mod.global.Express.Request {
  
  /**
    * Return an array of Accepted media types
    * ordered from highest quality to lowest.
    */
  var accepted: js.Array[MediaType] = js.native
  
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
  def accepts(): js.Array[String] = js.native
  def accepts(`type`: String*): String | `false` = js.native
  def accepts(`type`: String): String | `false` = js.native
  def accepts(`type`: js.Array[String]): String | `false` = js.native
  
  /**
    * Returns the first accepted charset of the specified character sets,
    * based on the request's Accept-Charset HTTP header field.
    * If none of the specified charsets is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsCharsets(): js.Array[String] = js.native
  def acceptsCharsets(charset: String*): String | `false` = js.native
  def acceptsCharsets(charset: String): String | `false` = js.native
  def acceptsCharsets(charset: js.Array[String]): String | `false` = js.native
  
  /**
    * Returns the first accepted encoding of the specified encodings,
    * based on the request's Accept-Encoding HTTP header field.
    * If none of the specified encodings is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsEncodings(): js.Array[String] = js.native
  def acceptsEncodings(encoding: String*): String | `false` = js.native
  def acceptsEncodings(encoding: String): String | `false` = js.native
  def acceptsEncodings(encoding: js.Array[String]): String | `false` = js.native
  
  /**
    * Returns the first accepted language of the specified languages,
    * based on the request's Accept-Language HTTP header field.
    * If none of the specified languages is accepted, returns false.
    *
    * For more information, or if you have issues or concerns, see accepts.
    */
  def acceptsLanguages(): js.Array[String] = js.native
  def acceptsLanguages(lang: String*): String | `false` = js.native
  def acceptsLanguages(lang: String): String | `false` = js.native
  def acceptsLanguages(lang: js.Array[String]): String | `false` = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("app")
  var app_Original: Application = js.native
  
  var baseUrl: String = js.native
  
  //body: { username: string; password: string; remember: boolean; title: string; };
  var body: ReqBody = js.native
  
  //cookies: { string; remember: boolean; };
  var cookies: js.Any = js.native
  
  /**
    * Check if the request is fresh, aka
    * Last-Modified and/or the ETag
    * still match.
    */
  var fresh: Boolean = js.native
  
  def get(name: String): js.UndefOr[String] = js.native
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
  def get_setcookie(name: `set-cookie`): js.UndefOr[js.Array[String]] = js.native
  
  def header(name: String): js.UndefOr[String] = js.native
  @JSName("header")
  def header_setcookie(name: `set-cookie`): js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @deprecated Use hostname instead.
    */
  var host: String = js.native
  
  /**
    * Parse the "Host" header field hostname.
    */
  var hostname: String = js.native
  
  /**
    * Return the remote address, or when
    * "trust proxy" is `true` return
    * the upstream addr.
    */
  var ip: String = js.native
  
  /**
    * When "trust proxy" is `true`, parse
    * the "X-Forwarded-For" ip address list.
    *
    * For example if the value were "client, proxy1, proxy2"
    * you would receive the array `["client", "proxy1", "proxy2"]`
    * where "proxy2" is the furthest down-stream.
    */
  var ips: js.Array[String] = js.native
  
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
  def is(`type`: String): String | `false` | Null = js.native
  def is(`type`: js.Array[String]): String | `false` | Null = js.native
  
  var next: js.UndefOr[NextFunction] = js.native
  
  var originalUrl: String = js.native
  
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
  def param(name: String): String = js.native
  def param(name: String, defaultValue: js.Any): String = js.native
  
  var params: P = js.native
  
  /**
    * Short-hand for `url.parse(req.url).pathname`.
    */
  var path: String = js.native
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  /**
    * Return the protocol string "http" or "https"
    * when requested with TLS. When the "trust proxy"
    * setting is enabled the "X-Forwarded-Proto" header
    * field will be trusted. If you're running behind
    * a reverse proxy that supplies https for you this
    * may be enabled.
    */
  var protocol: String = js.native
  
  var query: ReqQuery = js.native
  
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
  def range(size: Double): js.UndefOr[Ranges | Result] = js.native
  def range(size: Double, options: Options): js.UndefOr[Ranges | Result] = js.native
  
  /**
    * After middleware.init executed, Request will contain res and next properties
    * See: express/lib/middleware/init.js
    */
  var res: js.UndefOr[Response[ResBody, Double]] = js.native
  
  var route: js.Any = js.native
  
  /**
    * Short-hand for:
    *
    *    req.protocol == 'https'
    */
  var secure: Boolean = js.native
  
  var signedCookies: js.Any = js.native
  
  /**
    * Check if the request is stale, aka
    * "Last-Modified" and / or the "ETag" for the
    * resource has changed.
    */
  var stale: Boolean = js.native
  
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
  var subdomains: js.Array[String] = js.native
  
  /**
    * Check if the request was an _XMLHttpRequest_.
    */
  var xhr: Boolean = js.native
}
