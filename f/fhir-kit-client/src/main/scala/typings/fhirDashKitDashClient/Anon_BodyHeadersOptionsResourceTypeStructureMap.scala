package typings.fhirDashKitDashClient

import typings.fhir.fhir.StructureMap
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeStructureMap extends js.Object {
  var body: StructureMap
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.StructureMap
}

object Anon_BodyHeadersOptionsResourceTypeStructureMap {
  @scala.inline
  def apply(
    body: StructureMap,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.StructureMap,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeStructureMap = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeStructureMap]
  }
}

