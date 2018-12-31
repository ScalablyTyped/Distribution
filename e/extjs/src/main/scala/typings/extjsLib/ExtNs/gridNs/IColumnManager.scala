package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnManager
  extends extjsLib.ExtNs.IBase {
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param index Number The column index for which to retrieve the column.
  		* @returns Ext.grid.column.Column The header. null if it doesn't exist.
  		*/
  var getHeaderAtIndex: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[scala.Double], extjsLib.ExtNs.gridNs.columnNs.IColumn]
  ] = js.undefined
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param id String The id
  		* @returns Ext.grid.column.Column The header. null if it doesn't exist.
  		*/
  var getHeaderById: js.UndefOr[
    js.Function1[/* id */ js.UndefOr[java.lang.String], extjsLib.ExtNs.gridNs.columnNs.IColumn]
  ] = js.undefined
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
  		* @param header Ext.grid.column.Column The header to find the index of
  		* @returns Number The index of the specified column header
  		*/
  var getHeaderIndex: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Double]
  ] = js.undefined
  /** [Method] When passed a column index returns the closet visible column to that
  		* @param index Number Position at which to find the closest visible column.
  		*/
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

