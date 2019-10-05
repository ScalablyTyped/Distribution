package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

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
    build: () => UpdateDraftActionResponse,
    setUpdateDraftBodyAction: UpdateDraftBodyAction => UpdateDraftActionResponseBuilder
  ): UpdateDraftActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setUpdateDraftBodyAction = js.Any.fromFunction1(setUpdateDraftBodyAction))
  
    __obj.asInstanceOf[UpdateDraftActionResponseBuilder]
  }
}

