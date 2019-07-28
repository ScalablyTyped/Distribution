package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Flag
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flag extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: Flag
  var version: String
}

object Anon_Flag {
  @scala.inline
  def apply(id: String, resourceType: Flag, version: String, headers: Headers = null, options: Options = null): Anon_Flag = {
    val __obj = js.Dynamic.literal(id = id, resourceType = resourceType, version = version)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Flag]
  }
}

