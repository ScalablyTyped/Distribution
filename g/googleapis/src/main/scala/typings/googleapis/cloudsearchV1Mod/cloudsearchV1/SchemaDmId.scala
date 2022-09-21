package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDmId extends StObject {
  
  /**
    * Unique server assigned Id, per Direct Message Space.
    */
  var dmId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDmId {
  
  inline def apply(): SchemaDmId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDmId]
  }
  
  extension [Self <: SchemaDmId](x: Self) {
    
    inline def setDmId(value: String): Self = StObject.set(x, "dmId", value.asInstanceOf[js.Any])
    
    inline def setDmIdNull: Self = StObject.set(x, "dmId", null)
    
    inline def setDmIdUndefined: Self = StObject.set(x, "dmId", js.undefined)
  }
}
