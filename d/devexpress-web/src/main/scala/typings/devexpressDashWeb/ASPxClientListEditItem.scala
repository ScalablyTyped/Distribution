package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ListEditItem object.
  */
@js.native
trait ASPxClientListEditItem extends js.Object {
  /**
    * Gets the item's associated image.
    * Value: A string value that represents the path to the image displayed by the item.
    */
  var imageUrl: String = js.native
  /**
    * Gets the item's index.
    * Value: An integer value that represents the item's index within the corresponding editor's item collection.
    */
  var index: Double = js.native
  /**
    * Gets an editor to which the current item belongs.
    * Value: An ASPxClientListEdit object that represents the item's owner editor.
    */
  var listEditBase: ASPxClientListEdit = js.native
  /**
    * Gets a value that indicates whether a list edit item is selected.
    * Value: true if a list edit item is selected; otherwise, false.
    */
  var selected: Boolean = js.native
  /**
    * Gets the item's display text.
    * Value: A string value that represents the item's display text.
    */
  var text: String = js.native
  /**
    * Gets the item's associated value.
    * Value: An object that represents the value associated with the item.
    */
  var value: js.Object = js.native
  /**
    * Returns the list item's value that corresponds to a column specified by its index.
    * @param columnIndex An integer value that specifies the column's index within the editor's Columns collection.
    */
  def GetColumnText(columnIndex: Double): String = js.native
  /**
    * Returns the list item's value that corresponds to a column specified by its field name.
    * @param columnName A string value that specifies the column's field name defined via the FieldName property.
    */
  def GetColumnText(columnName: String): String = js.native
}

