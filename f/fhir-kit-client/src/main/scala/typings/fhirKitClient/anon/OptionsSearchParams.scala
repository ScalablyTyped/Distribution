package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSearchParams extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var searchParams: typings.fhirKitClient.mod.SearchParams
}

object OptionsSearchParams {
  @scala.inline
  def apply(
    searchParams: typings.fhirKitClient.mod.SearchParams,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): OptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSearchParams]
  }
}

