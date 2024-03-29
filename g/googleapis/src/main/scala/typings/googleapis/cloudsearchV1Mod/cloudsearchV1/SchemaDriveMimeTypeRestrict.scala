package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveMimeTypeRestrict extends StObject {
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveMimeTypeRestrict {
  
  inline def apply(): SchemaDriveMimeTypeRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveMimeTypeRestrict]
  }
  
  extension [Self <: SchemaDriveMimeTypeRestrict](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
