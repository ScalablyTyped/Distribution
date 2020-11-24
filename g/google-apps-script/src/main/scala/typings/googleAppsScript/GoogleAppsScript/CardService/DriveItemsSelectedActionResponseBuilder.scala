package typings.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for DriveItemsSelectedActionResponse objects.
  */
@js.native
trait DriveItemsSelectedActionResponseBuilder extends js.Object {
  
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
  implicit class DriveItemsSelectedActionResponseBuilderOps[Self <: DriveItemsSelectedActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: () => DriveItemsSelectedActionResponse): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestFileScope(value: String => DriveItemsSelectedActionResponseBuilder): Self = this.set("requestFileScope", js.Any.fromFunction1(value))
  }
}
