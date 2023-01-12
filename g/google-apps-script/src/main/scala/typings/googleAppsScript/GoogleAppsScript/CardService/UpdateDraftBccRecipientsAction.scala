package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sets an action that updates the email Bcc recipients of a draft.
  */
trait UpdateDraftBccRecipientsAction extends StObject {
  
  def addUpdateBccRecipients(bccRecipientEmails: js.Array[String]): UpdateDraftBccRecipientsAction
}
object UpdateDraftBccRecipientsAction {
  
  inline def apply(addUpdateBccRecipients: js.Array[String] => UpdateDraftBccRecipientsAction): UpdateDraftBccRecipientsAction = {
    val __obj = js.Dynamic.literal(addUpdateBccRecipients = js.Any.fromFunction1(addUpdateBccRecipients))
    __obj.asInstanceOf[UpdateDraftBccRecipientsAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDraftBccRecipientsAction] (val x: Self) extends AnyVal {
    
    inline def setAddUpdateBccRecipients(value: js.Array[String] => UpdateDraftBccRecipientsAction): Self = StObject.set(x, "addUpdateBccRecipients", js.Any.fromFunction1(value))
  }
}
