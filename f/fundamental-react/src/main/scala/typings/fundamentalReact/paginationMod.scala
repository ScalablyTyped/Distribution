package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Next
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("fundamental-react/lib/Pagination/Pagination", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PaginationProps, js.Object, Any]
  
  type Pagination = Component[PaginationProps, js.Object, Any]
  
  trait PaginationProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var displayTotal: js.UndefOr[Boolean] = js.undefined
    
    var displayTotalProps: js.UndefOr[Any] = js.undefined
    
    var initialPage: js.UndefOr[Double] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var itemsTotal: Double
    
    var linkProps: js.UndefOr[Any] = js.undefined
    
    var localizedText: js.UndefOr[Next] = js.undefined
    
    var nextProps: js.UndefOr[Any] = js.undefined
    
    def onClick(args: Any*): Any
    
    var prevProps: js.UndefOr[Any] = js.undefined
    
    var totalText: js.UndefOr[String] = js.undefined
    
    var visiblePageTotal: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(itemsTotal: Double, onClick: /* repeated */ Any => Any): PaginationProps = {
      val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisplayTotal(value: Boolean): Self = StObject.set(x, "displayTotal", value.asInstanceOf[js.Any])
      
      inline def setDisplayTotalProps(value: Any): Self = StObject.set(x, "displayTotalProps", value.asInstanceOf[js.Any])
      
      inline def setDisplayTotalPropsUndefined: Self = StObject.set(x, "displayTotalProps", js.undefined)
      
      inline def setDisplayTotalUndefined: Self = StObject.set(x, "displayTotal", js.undefined)
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      inline def setItemsTotal(value: Double): Self = StObject.set(x, "itemsTotal", value.asInstanceOf[js.Any])
      
      inline def setLinkProps(value: Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      inline def setLocalizedText(value: Next): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setNextProps(value: Any): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      inline def setNextPropsUndefined: Self = StObject.set(x, "nextProps", js.undefined)
      
      inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPrevProps(value: Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      inline def setTotalText(value: String): Self = StObject.set(x, "totalText", value.asInstanceOf[js.Any])
      
      inline def setTotalTextUndefined: Self = StObject.set(x, "totalText", js.undefined)
      
      inline def setVisiblePageTotal(value: Double): Self = StObject.set(x, "visiblePageTotal", value.asInstanceOf[js.Any])
      
      inline def setVisiblePageTotalUndefined: Self = StObject.set(x, "visiblePageTotal", js.undefined)
    }
  }
}
