package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for DriveItemsSelectedActionResponse objects.
  */
trait DriveItemsSelectedActionResponseBuilder extends StObject {
  
  def build(): DriveItemsSelectedActionResponse
  
  def requestFileScope(itemId: String): DriveItemsSelectedActionResponseBuilder
}
object DriveItemsSelectedActionResponseBuilder {
  
  inline def apply(
    build: () => DriveItemsSelectedActionResponse,
    requestFileScope: String => DriveItemsSelectedActionResponseBuilder
  ): DriveItemsSelectedActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requestFileScope = js.Any.fromFunction1(requestFileScope))
    __obj.asInstanceOf[DriveItemsSelectedActionResponseBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveItemsSelectedActionResponseBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => DriveItemsSelectedActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequestFileScope(value: String => DriveItemsSelectedActionResponseBuilder): Self = StObject.set(x, "requestFileScope", js.Any.fromFunction1(value))
  }
}
