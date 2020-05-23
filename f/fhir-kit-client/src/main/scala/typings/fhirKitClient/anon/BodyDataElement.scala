package typings.fhirKitClient.anon

import typings.fhir.fhir.DataElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyDataElement extends js.Object {
  var body: DataElement
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DataElement
}

object BodyDataElement {
  @scala.inline
  def apply(
    body: DataElement,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DataElement,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyDataElement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDataElement]
  }
}

