package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItemDataRelationships extends StObject {
  
  var parent: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.native
  
  var tip: js.UndefOr[CreateItemDataRelationshipsTip] = js.native
}
object CreateItemDataRelationships {
  
  @scala.inline
  def apply(): CreateItemDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationships]
  }
  
  @scala.inline
  implicit class CreateItemDataRelationshipsMutableBuilder[Self <: CreateItemDataRelationships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: CreateStorageDataRelationshipsTarget): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTip(value: CreateItemDataRelationshipsTip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}
