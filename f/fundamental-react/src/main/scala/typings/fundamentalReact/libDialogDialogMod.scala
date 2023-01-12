package typings.fundamentalReact

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogDialogMod {
  
  @JSImport("fundamental-react/lib/Dialog/Dialog", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DialogProps, js.Object, Any]
  
  type Dialog = Component[DialogProps, js.Object, Any]
  
  trait DialogProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var actions: js.Array[ReactNode]
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var bodyProps: js.UndefOr[Any] = js.undefined
    
    var contentProps: js.UndefOr[Any] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var footerProps: js.UndefOr[Any] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerProps: js.UndefOr[Any] = js.undefined
    
    var headingLevel: js.UndefOr[Any] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Any] = js.undefined
    
    var subheader: js.UndefOr[String] = js.undefined
    
    var titleProps: js.UndefOr[Any] = js.undefined
    
    @JSName("title")
    var title_DialogProps: String
  }
  object DialogProps {
    
    inline def apply(actions: js.Array[ReactNode], title: String): DialogProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ReactNode]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ReactNode*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBodyProps(value: Any): Self = StObject.set(x, "bodyProps", value.asInstanceOf[js.Any])
      
      inline def setBodyPropsUndefined: Self = StObject.set(x, "bodyProps", js.undefined)
      
      inline def setContentProps(value: Any): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      inline def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setFooterProps(value: Any): Self = StObject.set(x, "footerProps", value.asInstanceOf[js.Any])
      
      inline def setFooterPropsUndefined: Self = StObject.set(x, "footerProps", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderProps(value: Any): Self = StObject.set(x, "headerProps", value.asInstanceOf[js.Any])
      
      inline def setHeaderPropsUndefined: Self = StObject.set(x, "headerProps", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeadingLevel(value: Any): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
      
      inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
      
      inline def setOnClose(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: Any): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    }
  }
}
