package typings.devextreme.mod.DevExpress.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMenuBase[TProperties /* <: dxMenuBaseOptions[Any, TItem, TKey] */, TItem /* <: dxMenuBaseItem */, TKey]
  extends StObject
     with CollectionWidget[TProperties, TItem, TKey] {
  
  /**
    * Selects an item found using its DOM node.
    */
  def selectItem(itemElement: Element): Unit = js.native
  
  /**
    * Cancels the selection of an item found using its DOM node.
    */
  def unselectItem(itemElement: Element): Unit = js.native
}
