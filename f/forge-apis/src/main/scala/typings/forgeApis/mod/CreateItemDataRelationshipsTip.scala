package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItemDataRelationshipsTip extends StObject {
  
  var data: js.UndefOr[CreateItemDataRelationshipsTipData] = js.undefined
}
object CreateItemDataRelationshipsTip {
  
  @scala.inline
  def apply(): CreateItemDataRelationshipsTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemDataRelationshipsTip]
  }
  
  @scala.inline
  implicit class CreateItemDataRelationshipsTipMutableBuilder[Self <: CreateItemDataRelationshipsTip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CreateItemDataRelationshipsTipData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
