package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.SearchParams
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersOptionsSearchParams extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var searchParams: SearchParams
}

object Anon_HeadersOptionsSearchParams {
  @scala.inline
  def apply(searchParams: SearchParams, headers: Headers = null, options: Options = null): Anon_HeadersOptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersOptionsSearchParams]
  }
}

