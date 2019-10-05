package typings.dynatable.JQueryDynatable

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Readers extends js.Object {
  /**
    * Function that interprets the cell into data
    *
    * @param cell A html node of the target cell
    * @param record A data object representing the current line of data
    * @return the data for the current cell
    *
    * @default defaultAttributeReader
    *
    * @example
    * function exampleAttributeReader(cell, record) {
    *    return $(cell).html();
    * };
    */
  var _attributeReader: js.UndefOr[js.Function2[/* cell */ Element, /* record */ js.Any, _]] = js.undefined
  /**
    * Function that interprets the row into data
    *
    * @param index The index of the current row (from 0 to the perPage value)
    * @param thisRef
    * @param record
    * @return the data for the current row
    *
    * @default null
    *
    * @example
    * function exampleRowReader(index, this, record) {
    *     //...
    * };
    */
  var _rowReader: js.UndefOr[js.Function3[/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any, _]] = js.undefined
}

object Readers {
  @scala.inline
  def apply(
    _attributeReader: (/* cell */ Element, /* record */ js.Any) => _ = null,
    _rowReader: (/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any) => _ = null
  ): Readers = {
    val __obj = js.Dynamic.literal()
    if (_attributeReader != null) __obj.updateDynamic("_attributeReader")(js.Any.fromFunction2(_attributeReader))
    if (_rowReader != null) __obj.updateDynamic("_rowReader")(js.Any.fromFunction3(_rowReader))
    __obj.asInstanceOf[Readers]
  }
}

