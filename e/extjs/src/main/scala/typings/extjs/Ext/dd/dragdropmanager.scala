package typings.extjs.Ext.dd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragdropmanager {
  
  trait IElementWrapper extends StObject {
    
    /** [Property] (Object) */
    var css: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Object) */
    var el: js.UndefOr[Any] = js.undefined
    
    /** [Property] (Object) */
    var id: js.UndefOr[Any] = js.undefined
  }
  object IElementWrapper {
    
    inline def apply(): IElementWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IElementWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IElementWrapper] (val x: Self) extends AnyVal {
      
      inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setEl(value: Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
