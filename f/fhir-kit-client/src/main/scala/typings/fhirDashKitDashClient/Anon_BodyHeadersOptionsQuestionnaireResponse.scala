package typings.fhirDashKitDashClient

import typings.fhir.fhir.QuestionnaireResponse
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsQuestionnaireResponse extends js.Object {
  var body: QuestionnaireResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.QuestionnaireResponse
}

object Anon_BodyHeadersOptionsQuestionnaireResponse {
  @scala.inline
  def apply(
    body: QuestionnaireResponse,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.QuestionnaireResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsQuestionnaireResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsQuestionnaireResponse]
  }
}

