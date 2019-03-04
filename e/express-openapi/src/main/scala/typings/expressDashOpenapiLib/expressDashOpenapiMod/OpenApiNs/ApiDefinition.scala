package typings
package expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiDefinition extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  var definitions: js.UndefOr[DefinitionsObject] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var info: InfoObject
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.undefined
  var paths: PathsObject
  var produces: js.UndefOr[MimeTypes] = js.undefined
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.undefined
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.undefined
  var swagger: java.lang.String
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}

object ApiDefinition {
  @scala.inline
  def apply(
    info: InfoObject,
    paths: PathsObject,
    swagger: java.lang.String,
    basePath: java.lang.String = null,
    consumes: MimeTypes = null,
    definitions: DefinitionsObject = null,
    externalDocs: ExternalDocumentationObject = null,
    host: java.lang.String = null,
    parameters: ParametersDefinitionsObject = null,
    produces: MimeTypes = null,
    responses: ResponsesDefinitionsObject = null,
    schemes: js.Array[java.lang.String] = null,
    security: js.Array[SecurityRequirementObject] = null,
    securityDefinitions: SecurityDefinitionsObject = null,
    tags: js.Array[TagObject] = null
  ): ApiDefinition = {
    val __obj = js.Dynamic.literal(info = info, paths = paths, swagger = swagger)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (consumes != null) __obj.updateDynamic("consumes")(consumes)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (host != null) __obj.updateDynamic("host")(host)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (produces != null) __obj.updateDynamic("produces")(produces)
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (security != null) __obj.updateDynamic("security")(security)
    if (securityDefinitions != null) __obj.updateDynamic("securityDefinitions")(securityDefinitions)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ApiDefinition]
  }
}

