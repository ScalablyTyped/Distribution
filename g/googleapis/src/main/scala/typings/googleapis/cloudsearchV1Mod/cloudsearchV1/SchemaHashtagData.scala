package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHashtagData extends StObject {
  
  var searchText: js.UndefOr[String | Null] = js.undefined
}
object SchemaHashtagData {
  
  inline def apply(): SchemaHashtagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHashtagData]
  }
  
  extension [Self <: SchemaHashtagData](x: Self) {
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextNull: Self = StObject.set(x, "searchText", null)
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
