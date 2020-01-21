package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the InterconnectsGetDiagnosticsRequest.
  */
@js.native
trait SchemaInterconnectsGetDiagnosticsResponse extends js.Object {
  var result: js.UndefOr[SchemaInterconnectDiagnostics] = js.native
}

object SchemaInterconnectsGetDiagnosticsResponse {
  @scala.inline
  def apply(result: SchemaInterconnectDiagnostics = null): SchemaInterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectsGetDiagnosticsResponse]
  }
}

