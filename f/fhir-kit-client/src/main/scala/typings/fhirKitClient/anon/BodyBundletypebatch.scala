package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyBundletypebatch extends js.Object {
  var body: Bundletypebatch
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
}

object BodyBundletypebatch {
  @scala.inline
  def apply(
    body: Bundletypebatch,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyBundletypebatch = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyBundletypebatch]
  }
}

