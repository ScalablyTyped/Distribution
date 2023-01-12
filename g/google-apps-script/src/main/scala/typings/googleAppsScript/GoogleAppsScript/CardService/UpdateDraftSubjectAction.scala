package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the subject line of an email draft.
  */
trait UpdateDraftSubjectAction extends StObject {
  
  def addUpdateSubject(subject: String): UpdateDraftSubjectAction
}
object UpdateDraftSubjectAction {
  
  inline def apply(addUpdateSubject: String => UpdateDraftSubjectAction): UpdateDraftSubjectAction = {
    val __obj = js.Dynamic.literal(addUpdateSubject = js.Any.fromFunction1(addUpdateSubject))
    __obj.asInstanceOf[UpdateDraftSubjectAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDraftSubjectAction] (val x: Self) extends AnyVal {
    
    inline def setAddUpdateSubject(value: String => UpdateDraftSubjectAction): Self = StObject.set(x, "addUpdateSubject", js.Any.fromFunction1(value))
  }
}
