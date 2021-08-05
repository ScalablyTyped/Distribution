package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestAccess extends StObject {
  
  /**
    * A concurrent access response.
    */
  var concurrentAccess: js.UndefOr[SchemaConcurrentAccessRestriction] = js.undefined
  
  /**
    * A download access response.
    */
  var downloadAccess: js.UndefOr[SchemaDownloadAccessRestriction] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaRequestAccess {
  
  inline def apply(): SchemaRequestAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestAccess]
  }
  
  extension [Self <: SchemaRequestAccess](x: Self) {
    
    inline def setConcurrentAccess(value: SchemaConcurrentAccessRestriction): Self = StObject.set(x, "concurrentAccess", value.asInstanceOf[js.Any])
    
    inline def setConcurrentAccessUndefined: Self = StObject.set(x, "concurrentAccess", js.undefined)
    
    inline def setDownloadAccess(value: SchemaDownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    inline def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
