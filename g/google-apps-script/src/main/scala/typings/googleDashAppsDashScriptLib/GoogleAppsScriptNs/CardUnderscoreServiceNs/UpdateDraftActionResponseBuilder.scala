package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDraftActionResponseBuilder extends js.Object {
  def build(): UpdateDraftActionResponse
  def setUpdateDraftBodyAction(updateDraftBodyAction: UpdateDraftBodyAction): UpdateDraftActionResponseBuilder
}

object UpdateDraftActionResponseBuilder {
  @scala.inline
  def apply(
    build: js.Function0[UpdateDraftActionResponse],
    setUpdateDraftBodyAction: js.Function1[UpdateDraftBodyAction, UpdateDraftActionResponseBuilder]
  ): UpdateDraftActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build, setUpdateDraftBodyAction = setUpdateDraftBodyAction)
  
    __obj.asInstanceOf[UpdateDraftActionResponseBuilder]
  }
}

