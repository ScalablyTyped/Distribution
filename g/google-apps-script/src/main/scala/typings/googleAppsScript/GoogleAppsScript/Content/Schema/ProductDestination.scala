package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductDestination extends js.Object {
  
  var destinationName: js.UndefOr[String] = js.native
  
  var intention: js.UndefOr[String] = js.native
}
object ProductDestination {
  
  @scala.inline
  def apply(): ProductDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDestination]
  }
  
  @scala.inline
  implicit class ProductDestinationOps[Self <: ProductDestination] (val x: Self) extends AnyVal {
    
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
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    
    @scala.inline
    def setIntention(value: String): Self = this.set("intention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntention: Self = this.set("intention", js.undefined)
  }
}
