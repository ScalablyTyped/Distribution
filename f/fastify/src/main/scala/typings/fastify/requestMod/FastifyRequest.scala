package typings.fastify.requestMod

import typings.fastify.anon.Errorvalidationanyvalidat
import typings.fastify.fastifyStrings.http
import typings.fastify.fastifyStrings.https
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyRequest[RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */] extends js.Object {
  
  var body: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Body'] */ js.Any = js.native
  
  // Prefer `socket` over deprecated `connection` property in node 13.0.0 or higher
  // @deprecated
  val connection: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any = js.native
  
  val headers: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['headers'] */ js.Any = js.native
  
  val hostname: String = js.native
  
  var id: js.Any = js.native
  
   // this enables the developer to extend the existing http(s|2) headers list
  val ip: String = js.native
  
  val ips: js.UndefOr[js.Array[String]] = js.native
  
  val is404: Boolean = js.native
  
  var log: FastifyLoggerInstance = js.native
  
  val method: String = js.native
  
  var params: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Params'] */ js.Any = js.native
  
  val protocol: http | https = js.native
  
  var query: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Querystring'] */ js.Any = js.native
  
  var raw: RawRequest = js.native
  
  /**
    * @deprecated Use `raw` property
    */
  val req: RawRequest = js.native
  
  val routerMethod: String = js.native
  
  val routerPath: String = js.native
  
  val socket: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any = js.native
  
  val url: String = js.native
  
  /** in order for this to be used the user should ensure they have set the attachValidation option. */
  var validationError: js.UndefOr[Errorvalidationanyvalidat] = js.native
}
object FastifyRequest {
  
  @scala.inline
  def apply[RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */](
    body: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Body'] */ js.Any,
    connection: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any,
    headers: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['headers'] */ js.Any,
    hostname: String,
    id: js.Any,
    ip: String,
    is404: Boolean,
    log: FastifyLoggerInstance,
    method: String,
    params: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Params'] */ js.Any,
    protocol: http | https,
    query: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Querystring'] */ js.Any,
    raw: RawRequest,
    req: RawRequest,
    routerMethod: String,
    routerPath: String,
    socket: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any,
    url: String
  ): FastifyRequest[RouteGeneric, RawServer, RawRequest] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], is404 = is404.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], routerMethod = routerMethod.asInstanceOf[js.Any], routerPath = routerPath.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyRequest[RouteGeneric, RawServer, RawRequest]]
  }
  
  @scala.inline
  implicit class FastifyRequestOps[Self <: FastifyRequest[_, _, _], RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */] (val x: Self with (FastifyRequest[RouteGeneric, RawServer, RawRequest])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Body'] */ js.Any
    ): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any
    ): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['headers'] */ js.Any
    ): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs404(value: Boolean): Self = this.set("is404", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: FastifyLoggerInstance): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Params'] */ js.Any
    ): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Querystring'] */ js.Any
    ): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: RawRequest): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: RawRequest): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterMethod(value: String): Self = this.set("routerMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterPath(value: String): Self = this.set("routerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocket(
      value: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any
    ): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = this.set("ips", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = this.set("ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIps: Self = this.set("ips", js.undefined)
    
    @scala.inline
    def setValidationError(value: Errorvalidationanyvalidat): Self = this.set("validationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationError: Self = this.set("validationError", js.undefined)
  }
}
