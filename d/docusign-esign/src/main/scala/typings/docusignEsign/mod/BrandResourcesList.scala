package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandResourcesList extends js.Object {
  
  /**
    * A list of resources that the brand uses.
    */
  var resourcesContentTypes: js.UndefOr[js.Array[BrandResources]] = js.native
}
object BrandResourcesList {
  
  @scala.inline
  def apply(): BrandResourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandResourcesList]
  }
  
  @scala.inline
  implicit class BrandResourcesListOps[Self <: BrandResourcesList] (val x: Self) extends AnyVal {
    
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
    def setResourcesContentTypesVarargs(value: BrandResources*): Self = this.set("resourcesContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourcesContentTypes(value: js.Array[BrandResources]): Self = this.set("resourcesContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesContentTypes: Self = this.set("resourcesContentTypes", js.undefined)
  }
}
