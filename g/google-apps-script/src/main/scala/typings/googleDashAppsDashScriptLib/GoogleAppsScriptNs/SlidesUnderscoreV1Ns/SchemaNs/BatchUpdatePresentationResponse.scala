package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePresentationResponse extends js.Object {
  var presentationId: js.UndefOr[java.lang.String] = js.undefined
  var replies: js.UndefOr[js.Array[Response]] = js.undefined
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}

object BatchUpdatePresentationResponse {
  @scala.inline
  def apply(
    presentationId: java.lang.String = null,
    replies: js.Array[Response] = null,
    writeControl: WriteControl = null
  ): BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl)
    __obj.asInstanceOf[BatchUpdatePresentationResponse]
  }
}

