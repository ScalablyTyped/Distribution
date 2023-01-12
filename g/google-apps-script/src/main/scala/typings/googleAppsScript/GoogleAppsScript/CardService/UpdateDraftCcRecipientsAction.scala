package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sets an action that updates the Cc recipients of a draft.
  */
trait UpdateDraftCcRecipientsAction extends StObject {
  
  def addUpdateCcRecipients(ccRecipientEmails: js.Array[String]): UpdateDraftCcRecipientsAction
}
object UpdateDraftCcRecipientsAction {
  
  inline def apply(addUpdateCcRecipients: js.Array[String] => UpdateDraftCcRecipientsAction): UpdateDraftCcRecipientsAction = {
    val __obj = js.Dynamic.literal(addUpdateCcRecipients = js.Any.fromFunction1(addUpdateCcRecipients))
    __obj.asInstanceOf[UpdateDraftCcRecipientsAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDraftCcRecipientsAction] (val x: Self) extends AnyVal {
    
    inline def setAddUpdateCcRecipients(value: js.Array[String] => UpdateDraftCcRecipientsAction): Self = StObject.set(x, "addUpdateCcRecipients", js.Any.fromFunction1(value))
  }
}
