package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Writers extends StObject {
  
  /**
    * Function that returns the cell data to be written inside the cell
    *
    * @param record A data object representing the current line of data
    * @return the data for the current cell
    *
    * @default defaultAttributeWriter
    *
    * @example
    * function exampleAttributeWriter(record) {
    *     // `this` is the column object in settings.columns
    *    return record[this.id];
    * };
    */
  var _attributeWriter: js.UndefOr[js.Function1[/* record */ js.Any, _]] = js.native
  
  /**
    * Function that returns the HTML code that will be injected for the cell
    *
    * @param column The column object describing the config for the current column
    * @param record A data object representing the current line of data
    * @return the data for the current cell
    *
    * @default defaultCellWriter
    *
    * @example
    * function exampleCellWriter(column, record) {
    *     var html = column.attributeWriter(record),
    *     td = '<td';
    *
    *     if (column.hidden || column.textAlign) {
    *         td += ' style="';
    *
    *         // keep cells for hidden column headers hidden
    *         if (column.hidden) {
    *             td += 'display: none;';
    *         }
    *
    *         // keep cells aligned as their column headers are aligned
    *         if (column.textAlign) {
    *             td += 'text-align: ' + column.textAlign + ';';
    *         }
    *
    *         td += '"';
    *     }
    *
    *     return td + '>' + html + '</td>';
    * };
    */
  var _cellWriter: js.UndefOr[js.Function2[/* column */ Column, /* record */ js.Any, String]] = js.native
  
  /**
    * Function that write the data inside each row
    *
    * @param rowIndex The index of the current row (from 0 to the perPage value)
    * @param record A data object containing all the data for the current record (current line)
    * @param columns  An array of columns
    * @param cellWriter A reference to the function responsible for writing inside the cell
    * @return the data for the current cell
    *
    * @default defaultRowWriter
    *
    * @example
    * function exampleRowWriter(rowIndex, record, columns, cellWriter) {
    *     var tr = '';
    *     // grab the record's attribute for each column
    *     for (var i = 0, len = columns.length; i < len; i++) {
    *         tr += cellWriter(columns[i], record);
    *     }
    *     return '<tr>' + tr + '</tr>';
    * };
    */
  var _rowWriter: js.UndefOr[
    js.Function4[
      /* rowIndex */ Double, 
      /* record */ js.Any, 
      /* columns */ js.Array[Column], 
      /* cellWriter */ js.Function, 
      String
    ]
  ] = js.native
}
object Writers {
  
  @scala.inline
  def apply(): Writers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Writers]
  }
  
  @scala.inline
  implicit class WritersMutableBuilder[Self <: Writers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_attributeWriter(value: /* record */ js.Any => _): Self = StObject.set(x, "_attributeWriter", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_attributeWriterUndefined: Self = StObject.set(x, "_attributeWriter", js.undefined)
    
    @scala.inline
    def set_cellWriter(value: (/* column */ Column, /* record */ js.Any) => String): Self = StObject.set(x, "_cellWriter", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_cellWriterUndefined: Self = StObject.set(x, "_cellWriter", js.undefined)
    
    @scala.inline
    def set_rowWriter(
      value: (/* rowIndex */ Double, /* record */ js.Any, /* columns */ js.Array[Column], /* cellWriter */ js.Function) => String
    ): Self = StObject.set(x, "_rowWriter", js.Any.fromFunction4(value))
    
    @scala.inline
    def set_rowWriterUndefined: Self = StObject.set(x, "_rowWriter", js.undefined)
  }
}
