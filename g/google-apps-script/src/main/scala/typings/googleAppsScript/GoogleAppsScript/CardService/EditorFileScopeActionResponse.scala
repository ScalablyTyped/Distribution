package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Makes changes to an Editor, such as Google Docs, Sheets, or Slides in reaction to an action taken in the UI.
  */
trait EditorFileScopeActionResponse extends StObject {
  
  /**
    * Prints the JSON representation of this object.
    */
  def printJson(): String
}
object EditorFileScopeActionResponse {
  
  inline def apply(printJson: () => String): EditorFileScopeActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[EditorFileScopeActionResponse]
  }
  
  extension [Self <: EditorFileScopeActionResponse](x: Self) {
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
