package typings.djangoBananas.mod

import typings.djangoBananas.djangoBananasStrings.around
import typings.djangoBananas.djangoBananasStrings.between
import typings.djangoBananas.djangoBananasStrings.center
import typings.djangoBananas.djangoBananasStrings.end
import typings.djangoBananas.djangoBananasStrings.evenly
import typings.djangoBananas.djangoBananasStrings.paper
import typings.djangoBananas.djangoBananasStrings.primary
import typings.djangoBananas.djangoBananasStrings.secondary
import typings.djangoBananas.djangoBananasStrings.start
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarProps extends StObject {
  
  var back: js.UndefOr[Boolean | String] = js.undefined
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  
  var color: js.UndefOr[primary | secondary | paper] = js.undefined
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var justify: js.UndefOr[start | center | end | between | around | evenly] = js.undefined
  
  var overrides: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object TitleBarProps {
  
  inline def apply(): TitleBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleBarProps]
  }
  
  extension [Self <: TitleBarProps](x: Self) {
    
    inline def setBack(value: Boolean | String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setColor(value: primary | secondary | paper): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setJustify(value: start | center | end | between | around | evenly): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
