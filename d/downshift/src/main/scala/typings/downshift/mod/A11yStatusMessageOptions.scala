package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yStatusMessageOptions[Item] extends js.Object {
  
  var highlightedIndex: Double | Null = js.native
  
  var highlightedItem: Item = js.native
  
  var inputValue: String = js.native
  
  var isOpen: Boolean = js.native
  
  def itemToString(): String = js.native
  def itemToString(item: Item): String = js.native
  
  var previousResultCount: Double = js.native
  
  var resultCount: Double = js.native
  
  var selectedItem: Item | Null = js.native
}
