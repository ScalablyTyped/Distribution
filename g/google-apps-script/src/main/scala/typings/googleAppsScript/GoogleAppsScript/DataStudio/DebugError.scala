package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error that is only visible to admins of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newDebugError()
  *       .setText("This is the debug error text.")
  *       .throwException();
  */
trait DebugError extends StObject {
  
  def printJson(): String
  
  def setText(text: String): DebugError
  
  def throwException(): scala.Nothing
}
object DebugError {
  
  inline def apply(printJson: () => String, setText: String => DebugError, throwException: () => scala.Nothing): DebugError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
    __obj.asInstanceOf[DebugError]
  }
  
  extension [Self <: DebugError](x: Self) {
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    inline def setSetText(value: String => DebugError): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setThrowException(value: () => scala.Nothing): Self = StObject.set(x, "throwException", js.Any.fromFunction0(value))
  }
}
