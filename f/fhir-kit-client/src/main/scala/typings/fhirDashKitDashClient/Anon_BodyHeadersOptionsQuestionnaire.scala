package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Questionnaire
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsQuestionnaire extends js.Object {
  var body: Questionnaire
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Questionnaire
}

object Anon_BodyHeadersOptionsQuestionnaire {
  @scala.inline
  def apply(
    body: Questionnaire,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Questionnaire,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsQuestionnaire = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsQuestionnaire]
  }
}

