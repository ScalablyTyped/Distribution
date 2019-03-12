package typings
package expressDashOpenapiLib.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var apiDoc: expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs.ApiDefinition = js.native
  @JSName("app")
  var app_Original: expressLib.expressMod.eNs.Application = js.native
  var customFormats: CustomFormats = js.native
  var docPath: java.lang.String = js.native
  var exposeApiDocs: scala.Boolean = js.native
  var routes: java.lang.String = js.native
  var validateApiDoc: scala.Boolean = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def app(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  def errorTransformer(openapiError: OpenapiError, jsonschemaError: JsonschemaError): js.Any = js.native
}

