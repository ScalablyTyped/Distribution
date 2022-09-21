package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeriesmembership extends StObject {
  
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var member: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
  
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSeriesmembership {
  
  inline def apply(): SchemaSeriesmembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeriesmembership]
  }
  
  extension [Self <: SchemaSeriesmembership](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMember(value: js.Array[SchemaVolume]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: SchemaVolume*): Self = StObject.set(x, "member", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
