package typings.fhirDashKitDashClient

import typings.fhir.fhir.QuestionnaireResponse
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsQuestionnaireResponse extends js.Object {
  var body: QuestionnaireResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.QuestionnaireResponse
}

object Anon_BodyHeadersIdOptionsQuestionnaireResponse {
  @scala.inline
  def apply(
    body: QuestionnaireResponse,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.QuestionnaireResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdOptionsQuestionnaireResponse = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsQuestionnaireResponse]
  }
}

