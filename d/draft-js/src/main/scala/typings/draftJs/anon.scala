package typings.draftJs

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Html extends StObject {
    
    var html: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object Html {
    
    inline def apply(text: String): Html = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<draft-js.draft-js.Draft.Model.ImmutableData.SelectionStateProperties> */
  trait PartialSelectionStateProp extends StObject {
    
    var anchorKey: js.UndefOr[String] = js.undefined
    
    var anchorOffset: js.UndefOr[Double] = js.undefined
    
    var focusKey: js.UndefOr[String] = js.undefined
    
    var focusOffset: js.UndefOr[Double] = js.undefined
    
    var hasFocus: js.UndefOr[Boolean] = js.undefined
    
    var isBackward: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSelectionStateProp {
    
    inline def apply(): PartialSelectionStateProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSelectionStateProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSelectionStateProp] (val x: Self) extends AnyVal {
      
      inline def setAnchorKey(value: String): Self = StObject.set(x, "anchorKey", value.asInstanceOf[js.Any])
      
      inline def setAnchorKeyUndefined: Self = StObject.set(x, "anchorKey", js.undefined)
      
      inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
      
      inline def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
      
      inline def setFocusKey(value: String): Self = StObject.set(x, "focusKey", value.asInstanceOf[js.Any])
      
      inline def setFocusKeyUndefined: Self = StObject.set(x, "focusKey", js.undefined)
      
      inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
      
      inline def setFocusOffsetUndefined: Self = StObject.set(x, "focusOffset", js.undefined)
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
      
      inline def setIsBackward(value: Boolean): Self = StObject.set(x, "isBackward", value.asInstanceOf[js.Any])
      
      inline def setIsBackwardUndefined: Self = StObject.set(x, "isBackward", js.undefined)
    }
  }
  
  trait TypeofComponent extends StObject {
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://react.dev/reference/react/Component#static-contexttype
      */
    /* static member */
    var contextType: js.UndefOr[Context[Any]] = js.undefined
  }
  object TypeofComponent {
    
    inline def apply(): TypeofComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeofComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofComponent] (val x: Self) extends AnyVal {
      
      inline def setContextType(value: Context[Any]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    }
  }
}
