package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownshiftState[Item] extends StObject {
  
  var highlightedIndex: Double | Null = js.native
  
  var inputValue: String | Null = js.native
  
  var isOpen: Boolean = js.native
  
  var selectedItem: Item | Null = js.native
}
object DownshiftState {
  
  @scala.inline
  def apply[Item](isOpen: Boolean): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftState[Item]]
  }
  
  @scala.inline
  implicit class DownshiftStateMutableBuilder[Self <: DownshiftState[_], Item] (val x: Self with DownshiftState[Item]) extends AnyVal {
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexNull: Self = StObject.set(x, "highlightedIndex", null)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueNull: Self = StObject.set(x, "inputValue", null)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
  }
}
