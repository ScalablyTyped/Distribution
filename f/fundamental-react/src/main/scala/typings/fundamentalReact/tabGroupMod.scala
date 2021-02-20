package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabGroupMod {
  
  @JSImport("fundamental-react/lib/Tabs/TabGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[TabGroupProps, js.Object, js.Any]
  object default {
    
    @JSImport("fundamental-react/lib/Tabs/TabGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/Tabs/TabGroup", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.TabGroup = js.native
    @scala.inline
    def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type TabGroup = Component[TabGroupProps, js.Object, js.Any]
  
  @js.native
  trait TabGroupProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var onTabClick: js.UndefOr[
        js.Function2[/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double, Unit]
      ] = js.native
    
    var selectedIndex: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[js.Any] = js.native
    
    var tabGroupProps: js.UndefOr[js.Any] = js.native
  }
  object TabGroupProps {
    
    @scala.inline
    def apply(): TabGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabGroupProps]
    }
    
    @scala.inline
    implicit class TabGroupPropsMutableBuilder[Self <: TabGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setOnTabClick(value: (/* event */ MouseEvent[Element, NativeMouseEvent], /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabGroupProps(value: js.Any): Self = StObject.set(x, "tabGroupProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabGroupPropsUndefined: Self = StObject.set(x, "tabGroupProps", js.undefined)
    }
  }
}
