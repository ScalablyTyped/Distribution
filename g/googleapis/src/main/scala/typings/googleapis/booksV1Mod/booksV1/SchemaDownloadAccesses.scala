package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDownloadAccesses extends StObject {
  
  /**
    * A list of download access responses.
    */
  var downloadAccessList: js.UndefOr[js.Array[SchemaDownloadAccessRestriction]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDownloadAccesses {
  
  inline def apply(): SchemaDownloadAccesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccesses]
  }
  
  extension [Self <: SchemaDownloadAccesses](x: Self) {
    
    inline def setDownloadAccessList(value: js.Array[SchemaDownloadAccessRestriction]): Self = StObject.set(x, "downloadAccessList", value.asInstanceOf[js.Any])
    
    inline def setDownloadAccessListUndefined: Self = StObject.set(x, "downloadAccessList", js.undefined)
    
    inline def setDownloadAccessListVarargs(value: SchemaDownloadAccessRestriction*): Self = StObject.set(x, "downloadAccessList", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
