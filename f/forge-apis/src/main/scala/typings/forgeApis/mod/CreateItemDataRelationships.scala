package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemDataRelationships extends StObject {
  
  var parent: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.undefined
  
  var tip: js.UndefOr[CreateItemDataRelationshipsTip] = js.undefined
}
object CreateItemDataRelationships {
  
  inline def apply(): CreateItemDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationships]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateItemDataRelationships] (val x: Self) extends AnyVal {
    
    inline def setParent(value: CreateStorageDataRelationshipsTarget): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTip(value: CreateItemDataRelationshipsTip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}
