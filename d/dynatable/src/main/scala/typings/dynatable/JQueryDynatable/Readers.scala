package typings.dynatable.JQueryDynatable

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var _attributeReader: js.UndefOr[js.Function2[/* cell */ Element, /* record */ js.Any, _]] = js.native
  
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
  var _rowReader: js.UndefOr[js.Function3[/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any, _]] = js.native
}
object Readers {
  
  @scala.inline
  def apply(): Readers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readers]
  }
  
  @scala.inline
  implicit class ReadersOps[Self <: Readers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_attributeReader(value: (/* cell */ Element, /* record */ js.Any) => _): Self = this.set("_attributeReader", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete_attributeReader: Self = this.set("_attributeReader", js.undefined)
    
    @scala.inline
    def set_rowReader(value: (/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any) => _): Self = this.set("_rowReader", js.Any.fromFunction3(value))
    
    @scala.inline
    def delete_rowReader: Self = this.set("_rowReader", js.undefined)
  }
}
