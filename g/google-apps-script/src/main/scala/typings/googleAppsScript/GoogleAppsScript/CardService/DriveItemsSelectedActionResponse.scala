package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response that makes changes to Drive while Drive items are selected and in reaction to an action taken in the UI, such as a button click.
  */
trait DriveItemsSelectedActionResponse extends StObject {
  
  def printJson(): String
}
object DriveItemsSelectedActionResponse {
  
  @scala.inline
  def apply(printJson: () => String): DriveItemsSelectedActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[DriveItemsSelectedActionResponse]
  }
  
  @scala.inline
  implicit class DriveItemsSelectedActionResponseMutableBuilder[Self <: DriveItemsSelectedActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
