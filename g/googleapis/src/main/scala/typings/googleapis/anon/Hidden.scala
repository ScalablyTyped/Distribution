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
  
  @scala.inline
  def apply(): Hidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hidden]
  }
  
  @scala.inline
  implicit class HiddenMutableBuilder[Self <: Hidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setTrashed(value: Boolean): Self = StObject.set(x, "trashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashedUndefined: Self = StObject.set(x, "trashed", js.undefined)
    
    @scala.inline
    def setViewed(value: Boolean): Self = StObject.set(x, "viewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewedUndefined: Self = StObject.set(x, "viewed", js.undefined)
  }
}
