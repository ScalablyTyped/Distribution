package typings
package expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationObject
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[Parameters] = js.undefined
  var produces: js.UndefOr[MimeTypes] = js.undefined
  var responses: ResponsesObject
  var schemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OperationObject {
  @scala.inline
  def apply(
    responses: ResponsesObject,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    consumes: MimeTypes = null,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    externalDocs: ExternalDocumentationObject = null,
    operationId: java.lang.String = null,
    parameters: Parameters = null,
    produces: MimeTypes = null,
    schemes: js.Array[java.lang.String] = null,
    security: js.Array[SecurityRequirementObject] = null,
    summary: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): OperationObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responses")(responses)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (consumes != null) __obj.updateDynamic("consumes")(consumes)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (produces != null) __obj.updateDynamic("produces")(produces)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (security != null) __obj.updateDynamic("security")(security)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[OperationObject]
  }
}

