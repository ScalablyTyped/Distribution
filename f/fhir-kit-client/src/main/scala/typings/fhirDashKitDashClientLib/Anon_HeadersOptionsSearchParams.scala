package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersOptionsSearchParams extends js.Object {
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var searchParams: fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams
}

object Anon_HeadersOptionsSearchParams {
  @scala.inline
  def apply(
    searchParams: fhirDashKitDashClientLib.fhirDashKitDashClientMod.SearchParams,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_HeadersOptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersOptionsSearchParams]
  }
}

