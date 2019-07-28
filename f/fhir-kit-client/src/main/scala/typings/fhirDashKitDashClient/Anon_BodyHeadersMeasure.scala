package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Measure
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMeasure extends js.Object {
  var body: Measure
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Measure
}

object Anon_BodyHeadersMeasure {
  @scala.inline
  def apply(
    body: Measure,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Measure,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMeasure = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMeasure]
  }
}

