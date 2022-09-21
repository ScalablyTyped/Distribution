package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsUpdateCategory extends StObject {
  
  /**
    * The identifier of the windows update category.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the windows update category.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaWindowsUpdateCategory {
  
  inline def apply(): SchemaWindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsUpdateCategory]
  }
  
  extension [Self <: SchemaWindowsUpdateCategory](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
