package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanComment extends StObject {
  
  var canComment: js.UndefOr[Boolean] = js.undefined
  
  var canPlusone: js.UndefOr[Boolean] = js.undefined
  
  var canUpdate: js.UndefOr[Boolean] = js.undefined
  
  var isPlusOned: js.UndefOr[Boolean] = js.undefined
  
  var resharingDisabled: js.UndefOr[Boolean] = js.undefined
}
object CanComment {
  
  inline def apply(): CanComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanComment]
  }
  
  extension [Self <: CanComment](x: Self) {
    
    inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
    
    inline def setCanPlusone(value: Boolean): Self = StObject.set(x, "canPlusone", value.asInstanceOf[js.Any])
    
    inline def setCanPlusoneUndefined: Self = StObject.set(x, "canPlusone", js.undefined)
    
    inline def setCanUpdate(value: Boolean): Self = StObject.set(x, "canUpdate", value.asInstanceOf[js.Any])
    
    inline def setCanUpdateUndefined: Self = StObject.set(x, "canUpdate", js.undefined)
    
    inline def setIsPlusOned(value: Boolean): Self = StObject.set(x, "isPlusOned", value.asInstanceOf[js.Any])
    
    inline def setIsPlusOnedUndefined: Self = StObject.set(x, "isPlusOned", js.undefined)
    
    inline def setResharingDisabled(value: Boolean): Self = StObject.set(x, "resharingDisabled", value.asInstanceOf[js.Any])
    
    inline def setResharingDisabledUndefined: Self = StObject.set(x, "resharingDisabled", js.undefined)
  }
}
