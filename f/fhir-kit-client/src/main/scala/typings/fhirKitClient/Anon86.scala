package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.TestReport
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon86 extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: TestReport
  var version: String
}

object Anon86 {
  @scala.inline
  def apply(
    id: String,
    resourceType: TestReport,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon86 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon86]
  }
}

