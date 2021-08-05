package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var modified: js.UndefOr[Boolean] = js.undefined
  
  var restricted: js.UndefOr[Boolean] = js.undefined
  
  var starred: js.UndefOr[Boolean] = js.undefined
  
  var trashed: js.UndefOr[Boolean] = js.undefined
  
  var viewed: js.UndefOr[Boolean] = js.undefined
}
object Hidden {
  
  inline def apply(): Hidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hidden]
  }
  
  extension [Self <: Hidden](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setTrashed(value: Boolean): Self = StObject.set(x, "trashed", value.asInstanceOf[js.Any])
    
    inline def setTrashedUndefined: Self = StObject.set(x, "trashed", js.undefined)
    
    inline def setViewed(value: Boolean): Self = StObject.set(x, "viewed", value.asInstanceOf[js.Any])
    
    inline def setViewedUndefined: Self = StObject.set(x, "viewed", js.undefined)
  }
}
