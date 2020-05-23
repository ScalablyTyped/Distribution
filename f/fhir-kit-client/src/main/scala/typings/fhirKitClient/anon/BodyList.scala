package typings.fhirKitClient.anon

import typings.fhir.fhir.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyList extends js.Object {
  var body: List
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.List
}

object BodyList {
  @scala.inline
  def apply(
    body: List,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.List,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyList = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyList]
  }
}

