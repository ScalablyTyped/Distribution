package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupId extends StObject {
  
  /**
    * Unique, immutable ID of the Direct Message Space
    */
  var dmId: js.UndefOr[SchemaDmId] = js.undefined
  
  /**
    * Unique, immutable ID of the Space
    */
  var spaceId: js.UndefOr[SchemaSpaceId] = js.undefined
}
object SchemaGroupId {
  
  inline def apply(): SchemaGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupId]
  }
  
  extension [Self <: SchemaGroupId](x: Self) {
    
    inline def setDmId(value: SchemaDmId): Self = StObject.set(x, "dmId", value.asInstanceOf[js.Any])
    
    inline def setDmIdUndefined: Self = StObject.set(x, "dmId", js.undefined)
    
    inline def setSpaceId(value: SchemaSpaceId): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    inline def setSpaceIdUndefined: Self = StObject.set(x, "spaceId", js.undefined)
  }
}
