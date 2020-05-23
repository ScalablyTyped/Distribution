package typings.fhirKitClient.anon

import typings.fhir.fhir.QuestionnaireResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyQuestionnaireResponse extends js.Object {
  var body: QuestionnaireResponse
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse
}

object BodyQuestionnaireResponse {
  @scala.inline
  def apply(
    body: QuestionnaireResponse,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyQuestionnaireResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyQuestionnaireResponse]
  }
}

