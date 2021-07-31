package typings.gestalt.mod

import typings.gestalt.anon.ActiveIndex
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentedControlProps extends StObject {
  
  var items: js.Array[ReactNode]
  
  def onChange(args: ActiveIndex): Unit
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var selectedItemIndex: Double
  
  var size: js.UndefOr[md | lg] = js.undefined
}
object SegmentedControlProps {
  
  @scala.inline
  def apply(items: js.Array[ReactNode], onChange: ActiveIndex => Unit, selectedItemIndex: Double): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
  
  @scala.inline
  implicit class SegmentedControlPropsMutableBuilder[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOnChange(value: ActiveIndex => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
