package typings.extjs.Ext.dd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragdropmanager {
  
  @js.native
  trait IElementWrapper extends StObject {
    
    /** [Property] (Object) */
    var css: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Object) */
    var el: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Object) */
    var id: js.UndefOr[js.Any] = js.native
  }
  object IElementWrapper {
    
    @scala.inline
    def apply(): IElementWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IElementWrapper]
    }
    
    @scala.inline
    implicit class IElementWrapperMutableBuilder[Self <: IElementWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setEl(value: js.Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
