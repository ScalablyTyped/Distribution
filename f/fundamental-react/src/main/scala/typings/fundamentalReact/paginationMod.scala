package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Next
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("fundamental-react/lib/Pagination/Pagination", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationProps, js.Object, js.Any]
  
  type Pagination = Component[PaginationProps, js.Object, js.Any]
  
  @js.native
  trait PaginationProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var displayTotal: js.UndefOr[Boolean] = js.native
    
    var displayTotalProps: js.UndefOr[js.Any] = js.native
    
    var initialPage: js.UndefOr[Double] = js.native
    
    var itemsPerPage: js.UndefOr[Double] = js.native
    
    var itemsTotal: Double = js.native
    
    var linkProps: js.UndefOr[js.Any] = js.native
    
    var localizedText: js.UndefOr[Next] = js.native
    
    var nextProps: js.UndefOr[js.Any] = js.native
    
    def onClick(args: js.Any*): js.Any = js.native
    
    var prevProps: js.UndefOr[js.Any] = js.native
    
    var totalText: js.UndefOr[String] = js.native
    
    var visiblePageTotal: js.UndefOr[Double] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(itemsTotal: Double, onClick: /* repeated */ js.Any => js.Any): PaginationProps = {
      val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisplayTotal(value: Boolean): Self = StObject.set(x, "displayTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTotalProps(value: js.Any): Self = StObject.set(x, "displayTotalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTotalPropsUndefined: Self = StObject.set(x, "displayTotalProps", js.undefined)
      
      @scala.inline
      def setDisplayTotalUndefined: Self = StObject.set(x, "displayTotal", js.undefined)
      
      @scala.inline
      def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      @scala.inline
      def setItemsTotal(value: Double): Self = StObject.set(x, "itemsTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      @scala.inline
      def setLocalizedText(value: Next): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setNextProps(value: js.Any): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPropsUndefined: Self = StObject.set(x, "nextProps", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrevProps(value: js.Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      @scala.inline
      def setTotalText(value: String): Self = StObject.set(x, "totalText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTextUndefined: Self = StObject.set(x, "totalText", js.undefined)
      
      @scala.inline
      def setVisiblePageTotal(value: Double): Self = StObject.set(x, "visiblePageTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisiblePageTotalUndefined: Self = StObject.set(x, "visiblePageTotal", js.undefined)
    }
  }
}
