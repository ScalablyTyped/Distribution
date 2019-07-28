package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DetectedIssue
import typings.jsonDashPatch.jsonDashPatchMod.OpPatch
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectedIssueHeaders extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: DetectedIssue
}

object Anon_DetectedIssueHeaders {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: DetectedIssue,
    headers: Headers = null,
    options: Options = null
  ): Anon_DetectedIssueHeaders = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DetectedIssueHeaders]
  }
}

