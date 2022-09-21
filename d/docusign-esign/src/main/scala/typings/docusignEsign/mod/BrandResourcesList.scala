package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandResourcesList extends StObject {
  
  /**
    * A list of resources that the brand uses.
    */
  var resourcesContentTypes: js.UndefOr[js.Array[BrandResources]] = js.undefined
}
object BrandResourcesList {
  
  inline def apply(): BrandResourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandResourcesList]
  }
  
  extension [Self <: BrandResourcesList](x: Self) {
    
    inline def setResourcesContentTypes(value: js.Array[BrandResources]): Self = StObject.set(x, "resourcesContentTypes", value.asInstanceOf[js.Any])
    
    inline def setResourcesContentTypesUndefined: Self = StObject.set(x, "resourcesContentTypes", js.undefined)
    
    inline def setResourcesContentTypesVarargs(value: BrandResources*): Self = StObject.set(x, "resourcesContentTypes", js.Array(value*))
  }
}
