package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.FamilyMemberHistory
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyFamilyMemberHistoryHeaders extends js.Object {
  var body: FamilyMemberHistory
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.FamilyMemberHistory
}

object Anon_BodyFamilyMemberHistoryHeaders {
  @scala.inline
  def apply(
    body: FamilyMemberHistory,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.FamilyMemberHistory,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyFamilyMemberHistoryHeaders = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyFamilyMemberHistoryHeaders]
  }
}

