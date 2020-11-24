package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an action that updates the email draft that the user is currently editing.
  *
  *     // A UpdateDraftActionResponse that inserts non-editable content (a link in this case) into an
  *     // email draft.
  *     var updateDraftActionResponse = CardService.newUpdateDraftActionResponseBuilder()
  *         .setUpdateDraftBodyAction(CardService.newUpdateDraftBodyAction()
  *             .addUpdateContent(
  *                     "<a href=\"https://www.google.com\">Google</a>",
  *                     ContentType.IMMUTABLE_HTML)
  *             .setUpdateType(UpdateDraftBodyType.IN_PLACE_INSERT))
  *         .build();
  *
  *     // A UpdateDraftActionResponse that inserts a link into an email draft. The added content can be
  *     // edited further.
  *     var updateDraftActionResponse = CardService.newUpdateDraftActionResponseBuilder()
  *         .setUpdateDraftBodyAction(CardService.newUpdateDraftBodyAction()
  *             .addUpdateContent(
  *                     "<a href=\"https://www.google.com\">Google</a>",
  *                     ContentType.MUTABLE_HTML)
  *             .setUpdateType(UpdateDraftBodyType.IN_PLACE_INSERT))
  *         .build();
  *
  *     // A UpdateDraftActionResponse that inserts multiple values of different types.
  *     // The example action response inserts two lines next to each other in the email
  *     // draft, at the cursor position. Each line contains the content added by
  *     // {@link UpdateDraftActionResponseBuilder#addUpdateContent}.
  *     var updateDraftActionResponse = CardService.newUpdateDraftActionResponseBuilder()
  *         .setUpdateDraftBodyAction(CardService.newUpdateDraftBodyAction()
  *             .addUpdateContent(
  *                     "<a href=\"https://www.google.com\">Google</a>",
  *                     ContentType.MUTABLE_HTML)
  *             .addUpdateContent("Above is a google link.", ContentType.PLAIN_TEXT)
  *             .setUpdateType(UpdateDraftBodyType.IN_PLACE_INSERT))
  *         .build();
  */
@js.native
trait UpdateDraftActionResponse extends js.Object {
  
  def printJson(): String = js.native
}
object UpdateDraftActionResponse {
  
  @scala.inline
  def apply(printJson: () => String): UpdateDraftActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[UpdateDraftActionResponse]
  }
  
  @scala.inline
  implicit class UpdateDraftActionResponseOps[Self <: UpdateDraftActionResponse] (val x: Self) extends AnyVal {
    
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
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
  }
}
