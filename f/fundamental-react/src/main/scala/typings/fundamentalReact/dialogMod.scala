package typings.fundamentalReact

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("fundamental-react/lib/Dialog/Dialog", JSImport.Default)
  @js.native
  class default ()
    extends Component[DialogProps, js.Object, js.Any]
  
  type Dialog = Component[DialogProps, js.Object, js.Any]
  
  trait DialogProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var actions: js.Array[ReactNode]
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var bodyProps: js.UndefOr[js.Any] = js.undefined
    
    var contentProps: js.UndefOr[js.Any] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var footerProps: js.UndefOr[js.Any] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerProps: js.UndefOr[js.Any] = js.undefined
    
    var headingLevel: js.UndefOr[js.Any] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[js.Any] = js.undefined
    
    var subheader: js.UndefOr[String] = js.undefined
    
    var titleProps: js.UndefOr[js.Any] = js.undefined
    
    @JSName("title")
    var title_DialogProps: String
  }
  object DialogProps {
    
    @scala.inline
    def apply(actions: js.Array[ReactNode], title: String): DialogProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ReactNode]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: ReactNode*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      @scala.inline
      def setBodyProps(value: js.Any): Self = StObject.set(x, "bodyProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPropsUndefined: Self = StObject.set(x, "bodyProps", js.undefined)
      
      @scala.inline
      def setContentProps(value: js.Any): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setFooterProps(value: js.Any): Self = StObject.set(x, "footerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterPropsUndefined: Self = StObject.set(x, "footerProps", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderProps(value: js.Any): Self = StObject.set(x, "headerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPropsUndefined: Self = StObject.set(x, "headerProps", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeadingLevel(value: js.Any): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleProps(value: js.Any): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    }
  }
}
