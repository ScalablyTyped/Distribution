package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.FamilyMemberHistory
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyFamilyMemberHistory extends js.Object {
  var body: FamilyMemberHistory
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.FamilyMemberHistory
}

object Anon_BodyFamilyMemberHistory {
  @scala.inline
  def apply(
    body: FamilyMemberHistory,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.FamilyMemberHistory,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyFamilyMemberHistory = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyFamilyMemberHistory]
  }
}

