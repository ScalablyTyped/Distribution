package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ListEditItem object.
  */
@js.native
trait ASPxClientListEditItem extends js.Object {
  
  def GetColumnText(columnIndex: String): String = js.native
  /**
    * Returns the list item's value that corresponds to the specified column. Specifies the list item's value that corresponds to the specified column.
    * @param columnIndex Specifies the column's index or name in the Columns collection.
    */
  def GetColumnText(columnIndex: Double): String = js.native
  
  /**
    * Gets the item's associated image.
    */
  var imageUrl: String = js.native
  
  /**
    * Gets the item's index.
    */
  var index: Double = js.native
  
  /**
    * Gets an editor to which the current item belongs.
    */
  var listEditBase: ASPxClientListEdit = js.native
  
  /**
    * Gets a value that indicates whether a list edit item is selected.
    */
  var selected: Boolean = js.native
  
  /**
    * Gets the item's display text.
    */
  var text: String = js.native
  
  /**
    * Gets the item's associated value.
    */
  var value: js.Any = js.native
}
