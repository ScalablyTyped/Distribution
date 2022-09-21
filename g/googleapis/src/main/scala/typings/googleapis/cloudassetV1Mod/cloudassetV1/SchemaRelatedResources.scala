package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelatedResources extends StObject {
  
  /**
    * The detailed related resources of the primary resource.
    */
  var relatedResources: js.UndefOr[js.Array[SchemaRelatedResource]] = js.undefined
}
object SchemaRelatedResources {
  
  inline def apply(): SchemaRelatedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelatedResources]
  }
  
  extension [Self <: SchemaRelatedResources](x: Self) {
    
    inline def setRelatedResources(value: js.Array[SchemaRelatedResource]): Self = StObject.set(x, "relatedResources", value.asInstanceOf[js.Any])
    
    inline def setRelatedResourcesUndefined: Self = StObject.set(x, "relatedResources", js.undefined)
    
    inline def setRelatedResourcesVarargs(value: SchemaRelatedResource*): Self = StObject.set(x, "relatedResources", js.Array(value*))
  }
}
