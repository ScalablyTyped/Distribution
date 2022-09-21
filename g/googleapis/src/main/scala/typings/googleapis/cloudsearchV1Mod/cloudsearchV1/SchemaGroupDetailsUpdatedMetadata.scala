package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupDetailsUpdatedMetadata extends StObject {
  
  var newGroupDetails: js.UndefOr[SchemaAppsDynamiteSharedGroupDetails] = js.undefined
  
  var prevGroupDetails: js.UndefOr[SchemaAppsDynamiteSharedGroupDetails] = js.undefined
}
object SchemaGroupDetailsUpdatedMetadata {
  
  inline def apply(): SchemaGroupDetailsUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupDetailsUpdatedMetadata]
  }
  
  extension [Self <: SchemaGroupDetailsUpdatedMetadata](x: Self) {
    
    inline def setNewGroupDetails(value: SchemaAppsDynamiteSharedGroupDetails): Self = StObject.set(x, "newGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setNewGroupDetailsUndefined: Self = StObject.set(x, "newGroupDetails", js.undefined)
    
    inline def setPrevGroupDetails(value: SchemaAppsDynamiteSharedGroupDetails): Self = StObject.set(x, "prevGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setPrevGroupDetailsUndefined: Self = StObject.set(x, "prevGroupDetails", js.undefined)
  }
}
