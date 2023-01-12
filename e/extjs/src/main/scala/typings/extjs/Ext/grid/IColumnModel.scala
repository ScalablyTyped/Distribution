package typings.extjs.Ext.grid

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnModel
  extends StObject
     with IBase {
  
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param index Number The column index for which to retrieve the column.
    * @returns Ext.grid.column.Column The header. null if it doesn't exist.
    */
  var getHeaderAtIndex: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typings.extjs.Ext.grid.column.IColumn]
  ] = js.undefined
  
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param id String The id
    * @returns Ext.grid.column.Column The header. null if it doesn't exist.
    */
  var getHeaderById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], typings.extjs.Ext.grid.column.IColumn]] = js.undefined
  
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
    * @param header Ext.grid.column.Column The header to find the index of
    * @returns Number The index of the specified column header
    */
  var getHeaderIndex: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn], Double]
  ] = js.undefined
  
  /** [Method] When passed a column index returns the closet visible column to that
    * @param index Number Position at which to find the closest visible column.
    */
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
}
object IColumnModel {
  
  inline def apply(): IColumnModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColumnModel] (val x: Self) extends AnyVal {
    
    inline def setGetHeaderAtIndex(value: /* index */ js.UndefOr[Double] => typings.extjs.Ext.grid.column.IColumn): Self = StObject.set(x, "getHeaderAtIndex", js.Any.fromFunction1(value))
    
    inline def setGetHeaderAtIndexUndefined: Self = StObject.set(x, "getHeaderAtIndex", js.undefined)
    
    inline def setGetHeaderById(value: /* id */ js.UndefOr[String] => typings.extjs.Ext.grid.column.IColumn): Self = StObject.set(x, "getHeaderById", js.Any.fromFunction1(value))
    
    inline def setGetHeaderByIdUndefined: Self = StObject.set(x, "getHeaderById", js.undefined)
    
    inline def setGetHeaderIndex(value: /* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn] => Double): Self = StObject.set(x, "getHeaderIndex", js.Any.fromFunction1(value))
    
    inline def setGetHeaderIndexUndefined: Self = StObject.set(x, "getHeaderIndex", js.undefined)
    
    inline def setGetVisibleHeaderClosestToIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "getVisibleHeaderClosestToIndex", js.Any.fromFunction1(value))
    
    inline def setGetVisibleHeaderClosestToIndexUndefined: Self = StObject.set(x, "getVisibleHeaderClosestToIndex", js.undefined)
  }
}
