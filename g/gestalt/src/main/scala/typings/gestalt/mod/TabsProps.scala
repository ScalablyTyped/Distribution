package typings.gestalt.mod

import typings.gestalt.anon.ActiveTabIndex
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  var activeTabIndex: Double
  
  def onChange(args: ActiveTabIndex): Unit
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var tabs: js.Array[typings.gestalt.anon.Text]
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object TabsProps {
  
  inline def apply(
    activeTabIndex: Double,
    onChange: ActiveTabIndex => Unit,
    tabs: js.Array[typings.gestalt.anon.Text]
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  extension [Self <: TabsProps](x: Self) {
    
    inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: ActiveTabIndex => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTabs(value: js.Array[typings.gestalt.anon.Text]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: typings.gestalt.anon.Text*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
