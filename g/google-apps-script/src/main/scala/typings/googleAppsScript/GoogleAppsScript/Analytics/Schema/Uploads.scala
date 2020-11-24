package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uploads extends js.Object {
  
  var items: js.UndefOr[js.Array[Upload]] = js.native
  
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextLink: js.UndefOr[String] = js.native
  
  var previousLink: js.UndefOr[String] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var totalResults: js.UndefOr[Double] = js.native
}
object Uploads {
  
  @scala.inline
  def apply(): Uploads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uploads]
  }
  
  @scala.inline
  implicit class UploadsOps[Self <: Uploads] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Upload*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Upload]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    
    @scala.inline
    def setPreviousLink(value: String): Self = this.set("previousLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousLink: Self = this.set("previousLink", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
}
