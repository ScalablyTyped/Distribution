package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandResourcesList extends StObject {
  
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
  implicit class BrandResourcesListMutableBuilder[Self <: BrandResourcesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcesContentTypes(value: js.Array[BrandResources]): Self = StObject.set(x, "resourcesContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesContentTypesUndefined: Self = StObject.set(x, "resourcesContentTypes", js.undefined)
    
    @scala.inline
    def setResourcesContentTypesVarargs(value: BrandResources*): Self = StObject.set(x, "resourcesContentTypes", js.Array(value :_*))
  }
}
