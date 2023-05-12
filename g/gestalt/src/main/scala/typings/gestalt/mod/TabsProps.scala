package typings.gestalt.mod

import typings.gestalt.anon.ActiveTabIndex
import typings.gestalt.anon.Event
import typings.gestalt.anon.Id
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.transparent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  var activeTabIndex: Double
  
  var bgColor: js.UndefOr[default | transparent] = js.undefined
  
  var onChange: AbstractEventHandler[
    (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement]), 
    ActiveTabIndex
  ]
  
  var tabs: js.Array[Id]
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object TabsProps {
  
  inline def apply(
    activeTabIndex: Double,
    onChange: /* arg */ ActiveTabIndex & (Event[
      (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
    ]) => Unit,
    tabs: js.Array[Id]
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    inline def setBgColor(value: default | transparent): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setOnChange(
      value: /* arg */ ActiveTabIndex & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLDivElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLDivElement])
        ]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setTabs(value: js.Array[Id]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: Id*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
