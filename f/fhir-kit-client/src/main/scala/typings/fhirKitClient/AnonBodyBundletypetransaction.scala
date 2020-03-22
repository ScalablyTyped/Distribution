package typings.fhirKitClient

import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyBundletypetransaction extends js.Object {
  var body: Bundletypetransaction
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
}

object AnonBodyBundletypetransaction {
  @scala.inline
  def apply(body: Bundletypetransaction, headers: Headers = null, options: Options = null): AnonBodyBundletypetransaction = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyBundletypetransaction]
  }
}

