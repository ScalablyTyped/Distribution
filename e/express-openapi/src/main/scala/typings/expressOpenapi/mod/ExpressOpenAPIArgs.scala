package typings.expressOpenapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.openapiFramework.typesMod.OpenAPIFrameworkArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOpenAPIArgs extends OpenAPIFrameworkArgs {
  @JSName("app")
  var app_Original: Application_ = js.native
  var consumesMiddleware: js.UndefOr[StringDictionary[RequestHandler[ParamsDictionary]]] = js.native
  var docsPath: js.UndefOr[String] = js.native
  var errorMiddleware: js.UndefOr[ErrorRequestHandler[ParamsDictionary]] = js.native
  var exposeApiDocs: js.UndefOr[Boolean] = js.native
  var promiseMode: js.UndefOr[Boolean] = js.native
  var securityFilter: js.UndefOr[RequestHandler[ParamsDictionary]] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

