package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedUserBlockRelationship extends StObject {
  
  var hasBlockedRequester: js.UndefOr[Boolean | Null] = js.undefined
  
  var isBlockedByRequester: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAppsDynamiteSharedUserBlockRelationship {
  
  inline def apply(): SchemaAppsDynamiteSharedUserBlockRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedUserBlockRelationship]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedUserBlockRelationship](x: Self) {
    
    inline def setHasBlockedRequester(value: Boolean): Self = StObject.set(x, "hasBlockedRequester", value.asInstanceOf[js.Any])
    
    inline def setHasBlockedRequesterNull: Self = StObject.set(x, "hasBlockedRequester", null)
    
    inline def setHasBlockedRequesterUndefined: Self = StObject.set(x, "hasBlockedRequester", js.undefined)
    
    inline def setIsBlockedByRequester(value: Boolean): Self = StObject.set(x, "isBlockedByRequester", value.asInstanceOf[js.Any])
    
    inline def setIsBlockedByRequesterNull: Self = StObject.set(x, "isBlockedByRequester", null)
    
    inline def setIsBlockedByRequesterUndefined: Self = StObject.set(x, "isBlockedByRequester", js.undefined)
  }
}
