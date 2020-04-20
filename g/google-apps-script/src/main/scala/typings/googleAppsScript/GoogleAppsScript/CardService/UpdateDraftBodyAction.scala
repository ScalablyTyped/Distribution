package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an action that updates the email draft body.
  */
trait UpdateDraftBodyAction extends js.Object {
  def addUpdateContent(content: String, contentType: ContentType): UpdateDraftBodyAction
  def setUpdateType(updateType: UpdateDraftBodyType): UpdateDraftBodyAction
}

object UpdateDraftBodyAction {
  @scala.inline
  def apply(
    addUpdateContent: (String, ContentType) => UpdateDraftBodyAction,
    setUpdateType: UpdateDraftBodyType => UpdateDraftBodyAction
  ): UpdateDraftBodyAction = {
    val __obj = js.Dynamic.literal(addUpdateContent = js.Any.fromFunction2(addUpdateContent), setUpdateType = js.Any.fromFunction1(setUpdateType))
    __obj.asInstanceOf[UpdateDraftBodyAction]
  }
}

