package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yRemovalMessage[Item] extends StObject {
  
  var activeIndex: Double = js.native
  
  var activeSelectedItem: Item = js.native
  
  def itemToString(item: Item): String = js.native
  
  var removedSelectedItem: Item = js.native
  
  var resultCount: Double = js.native
}
object A11yRemovalMessage {
  
  @scala.inline
  def apply[Item](
    activeIndex: Double,
    activeSelectedItem: Item,
    itemToString: Item => String,
    removedSelectedItem: Item,
    resultCount: Double
  ): A11yRemovalMessage[Item] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], activeSelectedItem = activeSelectedItem.asInstanceOf[js.Any], itemToString = js.Any.fromFunction1(itemToString), removedSelectedItem = removedSelectedItem.asInstanceOf[js.Any], resultCount = resultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yRemovalMessage[Item]]
  }
  
  @scala.inline
  implicit class A11yRemovalMessageMutableBuilder[Self <: A11yRemovalMessage[_], Item] (val x: Self with A11yRemovalMessage[Item]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSelectedItem(value: Item): Self = StObject.set(x, "activeSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemToString(value: Item => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovedSelectedItem(value: Item): Self = StObject.set(x, "removedSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCount(value: Double): Self = StObject.set(x, "resultCount", value.asInstanceOf[js.Any])
  }
}
