package typings.fhirKitClient.anon

import typings.fhir.fhir.RequestGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyRequestGroup extends js.Object {
  var body: RequestGroup
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.RequestGroup
}

object BodyRequestGroup {
  @scala.inline
  def apply(
    body: RequestGroup,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.RequestGroup,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyRequestGroup = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRequestGroup]
  }
}

