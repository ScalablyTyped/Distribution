package typings.emberData.mod.DS

import typings.emberData.mod.RelationshipsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipOptions[M /* <: Model */] extends StObject {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[RelationshipsFor[M] | Null] = js.native
  
  var polymorphic: js.UndefOr[Boolean] = js.native
}
object RelationshipOptions {
  
  @scala.inline
  def apply[M /* <: Model */](): RelationshipOptions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipOptions[M]]
  }
  
  @scala.inline
  implicit class RelationshipOptionsMutableBuilder[Self <: RelationshipOptions[_], M /* <: Model */] (val x: Self with RelationshipOptions[M]) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setInverse(value: RelationshipsFor[M]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseNull: Self = StObject.set(x, "inverse", null)
    
    @scala.inline
    def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    
    @scala.inline
    def setPolymorphic(value: Boolean): Self = StObject.set(x, "polymorphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolymorphicUndefined: Self = StObject.set(x, "polymorphic", js.undefined)
  }
}
