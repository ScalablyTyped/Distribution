package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoSetModify extends StObject {
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.undefined
  
  var noSetModify: js.UndefOr[Boolean] = js.undefined
  
  var noSetReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.undefined
}
object NoSetModify {
  
  inline def apply(): NoSetModify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoSetModify]
  }
  
  extension [Self <: NoSetModify](x: Self) {
    
    inline def setNoSetFullAccess(value: Boolean): Self = StObject.set(x, "noSetFullAccess", value.asInstanceOf[js.Any])
    
    inline def setNoSetFullAccessUndefined: Self = StObject.set(x, "noSetFullAccess", js.undefined)
    
    inline def setNoSetModify(value: Boolean): Self = StObject.set(x, "noSetModify", value.asInstanceOf[js.Any])
    
    inline def setNoSetModifyUndefined: Self = StObject.set(x, "noSetModify", js.undefined)
    
    inline def setNoSetReadOnly(value: Boolean): Self = StObject.set(x, "noSetReadOnly", value.asInstanceOf[js.Any])
    
    inline def setNoSetReadOnlyUndefined: Self = StObject.set(x, "noSetReadOnly", js.undefined)
    
    inline def setNoSetReadPlusActivity(value: Boolean): Self = StObject.set(x, "noSetReadPlusActivity", value.asInstanceOf[js.Any])
    
    inline def setNoSetReadPlusActivityUndefined: Self = StObject.set(x, "noSetReadPlusActivity", js.undefined)
  }
}
