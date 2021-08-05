package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemDataRelationshipsTip extends StObject {
  
  var data: js.UndefOr[CreateItemDataRelationshipsTipData] = js.undefined
}
object CreateItemDataRelationshipsTip {
  
  inline def apply(): CreateItemDataRelationshipsTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationshipsTip]
  }
  
  extension [Self <: CreateItemDataRelationshipsTip](x: Self) {
    
    inline def setData(value: CreateItemDataRelationshipsTipData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
