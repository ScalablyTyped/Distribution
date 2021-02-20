package typings.draftJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Html extends StObject {
    
    var html: js.UndefOr[String] = js.native
    
    var text: String = js.native
  }
  object Html {
    
    @scala.inline
    def apply(text: String): Html = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<draft-js.draft-js.Draft.Model.ImmutableData.SelectionStateProperties> */
  @js.native
  trait PartialSelectionStateProp extends StObject {
    
    var anchorKey: js.UndefOr[String] = js.native
    
    var anchorOffset: js.UndefOr[Double] = js.native
    
    var focusKey: js.UndefOr[String] = js.native
    
    var focusOffset: js.UndefOr[Double] = js.native
    
    var hasFocus: js.UndefOr[Boolean] = js.native
    
    var isBackward: js.UndefOr[Boolean] = js.native
  }
  object PartialSelectionStateProp {
    
    @scala.inline
    def apply(): PartialSelectionStateProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSelectionStateProp]
    }
    
    @scala.inline
    implicit class PartialSelectionStatePropMutableBuilder[Self <: PartialSelectionStateProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorKey(value: String): Self = StObject.set(x, "anchorKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorKeyUndefined: Self = StObject.set(x, "anchorKey", js.undefined)
      
      @scala.inline
      def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
      
      @scala.inline
      def setFocusKey(value: String): Self = StObject.set(x, "focusKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusKeyUndefined: Self = StObject.set(x, "focusKey", js.undefined)
      
      @scala.inline
      def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOffsetUndefined: Self = StObject.set(x, "focusOffset", js.undefined)
      
      @scala.inline
      def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
      
      @scala.inline
      def setIsBackward(value: Boolean): Self = StObject.set(x, "isBackward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBackwardUndefined: Self = StObject.set(x, "isBackward", js.undefined)
    }
  }
}
