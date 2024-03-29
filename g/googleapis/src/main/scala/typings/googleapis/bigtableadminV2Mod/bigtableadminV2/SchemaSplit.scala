package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSplit extends StObject {
  
  /**
    * Row key to use as an initial tablet boundary.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaSplit {
  
  inline def apply(): SchemaSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplit]
  }
  
  extension [Self <: SchemaSplit](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
