package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.ChargeItem
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionsOptionsResourceType extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ChargeItem
}

object AnonOptionsOptionsResourceType {
  @scala.inline
  def apply(id: String, resourceType: ChargeItem, headers: Headers = null, options: Options = null): AnonOptionsOptionsResourceType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsOptionsResourceType]
  }
}

