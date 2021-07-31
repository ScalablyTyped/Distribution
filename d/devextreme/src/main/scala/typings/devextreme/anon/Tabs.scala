package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.collapsed
import typings.devextreme.devextremeStrings.disabled
import typings.devextreme.devextremeStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tabs extends StObject {
  
  var tabs: js.UndefOr[js.Array[Groups]] = js.undefined
  
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.undefined
}
object Tabs {
  
  @scala.inline
  def apply(): Tabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tabs]
  }
  
  @scala.inline
  implicit class TabsMutableBuilder[Self <: Tabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabs(value: js.Array[Groups]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTabsVarargs(value: Groups*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: auto | visible | collapsed | disabled): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
