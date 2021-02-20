package typings.emberData.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipMetaOptions
  extends /* k */ StringDictionary[js.Any] {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[String] = js.native
  
  var polymorphic: js.UndefOr[Boolean] = js.native
}
object RelationshipMetaOptions {
  
  @scala.inline
  def apply(): RelationshipMetaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipMetaOptions]
  }
  
  @scala.inline
  implicit class RelationshipMetaOptionsMutableBuilder[Self <: RelationshipMetaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setInverse(value: String): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    
    @scala.inline
    def setPolymorphic(value: Boolean): Self = StObject.set(x, "polymorphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolymorphicUndefined: Self = StObject.set(x, "polymorphic", js.undefined)
  }
}
