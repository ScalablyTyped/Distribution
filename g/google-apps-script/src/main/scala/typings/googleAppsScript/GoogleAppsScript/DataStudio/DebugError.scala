package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait DebugError extends StObject {
  
  def printJson(): String = js.native
  
  def setText(text: String): DebugError = js.native
  
  def throwException(): scala.Nothing = js.native
}
object DebugError {
  
  @scala.inline
  def apply(printJson: () => String, setText: String => DebugError, throwException: () => scala.Nothing): DebugError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
    __obj.asInstanceOf[DebugError]
  }
  
  @scala.inline
  implicit class DebugErrorMutableBuilder[Self <: DebugError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetText(value: String => DebugError): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrowException(value: () => scala.Nothing): Self = StObject.set(x, "throwException", js.Any.fromFunction0(value))
  }
}
