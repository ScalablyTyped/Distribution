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

object Args {
  @scala.inline
  def apply(
    apiDoc: expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs.ApiDefinition,
    app: expressLib.expressMod.eNs.Application,
    customFormats: CustomFormats,
    docPath: java.lang.String,
    errorTransformer: js.Function2[OpenapiError, JsonschemaError, js.Any],
    exposeApiDocs: scala.Boolean,
    routes: java.lang.String,
    validateApiDoc: scala.Boolean
  ): Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiDoc")(apiDoc)
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("customFormats")(customFormats)
    __obj.updateDynamic("docPath")(docPath)
    __obj.updateDynamic("errorTransformer")(errorTransformer)
    __obj.updateDynamic("exposeApiDocs")(exposeApiDocs)
    __obj.updateDynamic("routes")(routes)
    __obj.updateDynamic("validateApiDoc")(validateApiDoc)
    __obj.asInstanceOf[Args]
  }
}

