package typings.gestalt.mod

import typings.gestalt.anon.ActiveTabIndex
import typings.gestalt.anon.Id
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  var activeTabIndex: Double
  
  var bgColor: js.UndefOr[default | transparent] = js.undefined
  
  def onChange(args: ActiveTabIndex): Unit
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var tabs: js.Array[Id]
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object TabsProps {
  
  inline def apply(activeTabIndex: Double, onChange: ActiveTabIndex => Unit, tabs: js.Array[Id]): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  extension [Self <: TabsProps](x: Self) {
    
    inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    inline def setBgColor(value: default | transparent): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setOnChange(value: ActiveTabIndex => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTabs(value: js.Array[Id]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: Id*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
