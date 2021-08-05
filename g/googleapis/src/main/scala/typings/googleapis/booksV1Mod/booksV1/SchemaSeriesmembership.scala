package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeriesmembership extends StObject {
  
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var member: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaSeriesmembership {
  
  inline def apply(): SchemaSeriesmembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeriesmembership]
  }
  
  extension [Self <: SchemaSeriesmembership](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMember(value: js.Array[SchemaVolume]): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setMemberVarargs(value: SchemaVolume*): Self = StObject.set(x, "member", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
