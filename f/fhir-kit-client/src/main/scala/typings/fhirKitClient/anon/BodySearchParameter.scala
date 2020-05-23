package typings.fhirKitClient.anon

import typings.fhir.fhir.SearchParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySearchParameter extends js.Object {
  var body: SearchParameter
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.SearchParameter
}

object BodySearchParameter {
  @scala.inline
  def apply(
    body: SearchParameter,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.SearchParameter,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodySearchParameter = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySearchParameter]
  }
}

