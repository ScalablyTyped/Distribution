package typings
package expressDashOpenapiLib.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Args extends js.Object {
  var apiDoc: expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs.ApiDefinition
  var app: expressLib.expressMod.eNs.Application
  var customFormats: CustomFormats
  var docPath: java.lang.String
  var exposeApiDocs: scala.Boolean
  var routes: java.lang.String
  var validateApiDoc: scala.Boolean
  def errorTransformer(openapiError: OpenapiError, jsonschemaError: JsonschemaError): js.Any
}

