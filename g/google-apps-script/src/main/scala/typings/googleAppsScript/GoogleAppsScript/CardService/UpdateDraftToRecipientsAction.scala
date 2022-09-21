package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the To recipients of an email draft.
  */
trait UpdateDraftToRecipientsAction extends StObject {
  
  def addUpdateToRecipients(toRecipientEmails: js.Array[String]): UpdateDraftToRecipientsAction
}
object UpdateDraftToRecipientsAction {
  
  inline def apply(addUpdateToRecipients: js.Array[String] => UpdateDraftToRecipientsAction): UpdateDraftToRecipientsAction = {
    val __obj = js.Dynamic.literal(addUpdateToRecipients = js.Any.fromFunction1(addUpdateToRecipients))
    __obj.asInstanceOf[UpdateDraftToRecipientsAction]
  }
  
  extension [Self <: UpdateDraftToRecipientsAction](x: Self) {
    
    inline def setAddUpdateToRecipients(value: js.Array[String] => UpdateDraftToRecipientsAction): Self = StObject.set(x, "addUpdateToRecipients", js.Any.fromFunction1(value))
  }
}
