package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for DriveItemsSelectedActionResponse objects.
  */
@js.native
trait DriveItemsSelectedActionResponseBuilder extends StObject {
  
  def build(): DriveItemsSelectedActionResponse = js.native
  
  def requestFileScope(itemId: String): DriveItemsSelectedActionResponseBuilder = js.native
}
object DriveItemsSelectedActionResponseBuilder {
  
  @scala.inline
  def apply(
    build: () => DriveItemsSelectedActionResponse,
    requestFileScope: String => DriveItemsSelectedActionResponseBuilder
  ): DriveItemsSelectedActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requestFileScope = js.Any.fromFunction1(requestFileScope))
    __obj.asInstanceOf[DriveItemsSelectedActionResponseBuilder]
  }
  
  @scala.inline
  implicit class DriveItemsSelectedActionResponseBuilderMutableBuilder[Self <: DriveItemsSelectedActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => DriveItemsSelectedActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestFileScope(value: String => DriveItemsSelectedActionResponseBuilder): Self = StObject.set(x, "requestFileScope", js.Any.fromFunction1(value))
  }
}
