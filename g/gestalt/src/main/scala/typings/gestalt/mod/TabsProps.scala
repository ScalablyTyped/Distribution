package typings.gestalt.mod

import typings.gestalt.anon.ActiveTabIndex
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps extends StObject {
  
  var activeTabIndex: Double = js.native
  
  def onChange(args: ActiveTabIndex): Unit = js.native
  
  var size: js.UndefOr[md | lg] = js.native
  
  var tabs: js.Array[typings.gestalt.anon.Text] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object TabsProps {
  
  @scala.inline
  def apply(
    activeTabIndex: Double,
    onChange: ActiveTabIndex => Unit,
    tabs: js.Array[typings.gestalt.anon.Text]
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: ActiveTabIndex => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTabs(value: js.Array[typings.gestalt.anon.Text]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: typings.gestalt.anon.Text*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
