package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParams extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.mod.ResourceType
  var searchParams: typings.fhirKitClient.mod.SearchParams
}

object SearchParams {
  @scala.inline
  def apply(
    resourceType: typings.fhirKitClient.mod.ResourceType,
    searchParams: typings.fhirKitClient.mod.SearchParams,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): SearchParams = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
}

