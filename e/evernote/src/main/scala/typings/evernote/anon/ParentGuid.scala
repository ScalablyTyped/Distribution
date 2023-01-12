package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentGuid extends StObject {
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parentGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}
object ParentGuid {
  
  inline def apply(): ParentGuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentGuid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentGuid] (val x: Self) extends AnyVal {
    
    inline def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "parentGuid", value.asInstanceOf[js.Any])
    
    inline def setParentGuidUndefined: Self = StObject.set(x, "parentGuid", js.undefined)
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
  }
}
