package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an action that updates the email draft body.
  */
@js.native
trait UpdateDraftBodyAction extends js.Object {
  def addUpdateContent(content: String, contentType: ContentType): UpdateDraftBodyAction = js.native
  def setUpdateType(updateType: UpdateDraftBodyType): UpdateDraftBodyAction = js.native
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
  @scala.inline
  implicit class UpdateDraftBodyActionOps[Self <: UpdateDraftBodyAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddUpdateContent(value: (String, ContentType) => UpdateDraftBodyAction): Self = this.set("addUpdateContent", js.Any.fromFunction2(value))
    @scala.inline
    def setSetUpdateType(value: UpdateDraftBodyType => UpdateDraftBodyAction): Self = this.set("setUpdateType", js.Any.fromFunction1(value))
  }
  
}

