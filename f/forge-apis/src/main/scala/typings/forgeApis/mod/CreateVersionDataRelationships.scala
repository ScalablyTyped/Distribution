package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVersionDataRelationships extends StObject {
  
  var item: js.UndefOr[CreateVersionDataRelationshipsItem] = js.undefined
  
  var storage: js.UndefOr[CreateItemRelationshipsStorage] = js.undefined
}
object CreateVersionDataRelationships {
  
  @scala.inline
  def apply(): CreateVersionDataRelationships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionDataRelationships]
  }
  
  @scala.inline
  implicit class CreateVersionDataRelationshipsMutableBuilder[Self <: CreateVersionDataRelationships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: CreateVersionDataRelationshipsItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setStorage(value: CreateItemRelationshipsStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
