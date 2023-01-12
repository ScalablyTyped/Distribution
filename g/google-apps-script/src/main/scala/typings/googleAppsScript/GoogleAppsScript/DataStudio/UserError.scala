package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error that is shown to users of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newUserError()
  *       .setText("This is the debug error text.")
  *       .setDebugText("This text is only shown to admins.")
  *       .throwException();
  */
trait UserError extends StObject {
  
  def printJson(): String
  
  def setDebugText(text: String): UserError
  
  def setText(text: String): UserError
  
  def throwException(): scala.Nothing
}
object UserError {
  
  inline def apply(
    printJson: () => String,
    setDebugText: String => UserError,
    setText: String => UserError,
    throwException: () => scala.Nothing
  ): UserError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setDebugText = js.Any.fromFunction1(setDebugText), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
    __obj.asInstanceOf[UserError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserError] (val x: Self) extends AnyVal {
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    inline def setSetDebugText(value: String => UserError): Self = StObject.set(x, "setDebugText", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => UserError): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setThrowException(value: () => scala.Nothing): Self = StObject.set(x, "throwException", js.Any.fromFunction0(value))
  }
}
