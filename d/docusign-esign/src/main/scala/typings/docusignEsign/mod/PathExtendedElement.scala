package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathExtendedElement extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var typeName: js.UndefOr[String] = js.undefined
}
object PathExtendedElement {
  
  inline def apply(): PathExtendedElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathExtendedElement]
  }
  
  extension [Self <: PathExtendedElement](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
