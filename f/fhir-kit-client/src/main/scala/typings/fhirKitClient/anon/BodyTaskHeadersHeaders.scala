package typings.fhirKitClient.anon

import typings.fhir.fhir.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyTaskHeadersHeaders extends js.Object {
  var body: Task
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Task
}

object BodyTaskHeadersHeaders {
  @scala.inline
  def apply(
    body: Task,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Task,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyTaskHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyTaskHeadersHeaders]
  }
}

