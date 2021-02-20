package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentGuid extends StObject {
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
object ParentGuid {
  
  @scala.inline
  def apply(): ParentGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentGuid]
  }
  
  @scala.inline
  implicit class ParentGuidMutableBuilder[Self <: ParentGuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "parentGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGuidUndefined: Self = StObject.set(x, "parentGuid", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
  }
}
