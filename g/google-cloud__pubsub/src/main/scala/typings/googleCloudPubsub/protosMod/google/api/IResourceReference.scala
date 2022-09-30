package typings.googleCloudPubsub.protosMod.google.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ResourceReference. */
trait IResourceReference extends StObject {
  
  /** ResourceReference childType */
  var childType: js.UndefOr[String | Null] = js.undefined
  
  /** ResourceReference type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object IResourceReference {
  
  inline def apply(): IResourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceReference]
  }
  
  extension [Self <: IResourceReference](x: Self) {
    
    inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
    
    inline def setChildTypeNull: Self = StObject.set(x, "childType", null)
    
    inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
