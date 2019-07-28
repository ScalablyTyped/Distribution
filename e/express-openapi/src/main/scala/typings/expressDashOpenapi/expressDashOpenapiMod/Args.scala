package typings.expressDashOpenapi.expressDashOpenapiMod

import typings.express.expressMod.Application
import typings.expressDashOpenapi.expressDashOpenapiMod.OpenApiNs.ApiDefinition
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var apiDoc: ApiDefinition = js.native
  @JSName("app")
  var app_Original: Application = js.native
  var customFormats: CustomFormats = js.native
  var docPath: String = js.native
  var exposeApiDocs: Boolean = js.native
  var routes: String = js.native
  var validateApiDoc: Boolean = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request, res: Response): js.Any = js.native
  def app(req: Request, res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def errorTransformer(openapiError: OpenapiError, jsonschemaError: JsonschemaError): js.Any = js.native
}

