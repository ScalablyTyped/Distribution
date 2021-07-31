package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an action that updates the email draft body.
  */
trait UpdateDraftBodyAction extends StObject {
  
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
  
  @scala.inline
  implicit class UpdateDraftBodyActionMutableBuilder[Self <: UpdateDraftBodyAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddUpdateContent(value: (String, ContentType) => UpdateDraftBodyAction): Self = StObject.set(x, "addUpdateContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetUpdateType(value: UpdateDraftBodyType => UpdateDraftBodyAction): Self = StObject.set(x, "setUpdateType", js.Any.fromFunction1(value))
  }
}
