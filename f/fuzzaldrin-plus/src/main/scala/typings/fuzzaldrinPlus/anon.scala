package typings.fuzzaldrinPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TagClass extends StObject {
    
    var tagClass: js.UndefOr[String] = js.undefined
    
    var tagClose: js.UndefOr[String] = js.undefined
    
    var tagOpen: js.UndefOr[String] = js.undefined
  }
  object TagClass {
    
    @scala.inline
    def apply(): TagClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagClass]
    }
    
    @scala.inline
    implicit class TagClassMutableBuilder[Self <: TagClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagClass(value: String): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagClassUndefined: Self = StObject.set(x, "tagClass", js.undefined)
      
      @scala.inline
      def setTagClose(value: String): Self = StObject.set(x, "tagClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagCloseUndefined: Self = StObject.set(x, "tagClose", js.undefined)
      
      @scala.inline
      def setTagOpen(value: String): Self = StObject.set(x, "tagOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagOpenUndefined: Self = StObject.set(x, "tagOpen", js.undefined)
    }
  }
}
