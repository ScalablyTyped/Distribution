package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object header {
  
  trait IContainer
    extends StObject
       with typings.extjs.Ext.container.IContainer {
    
    /** [Config Option] (Number) */
    var defaultWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableColumnHide: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
    var getColumnCount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
      * @param headerContainer Object
      */
    var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Gets the full width of all columns that are visible  */
    var getFullWidth: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns an array of all columns which appear in the grid s View
      * @param inResult Object
      * @param hiddenAncestor Object
      * @returns Array
      */
    var getGridColumns: js.UndefOr[
        js.Function2[/* inResult */ js.UndefOr[Any], /* hiddenAncestor */ js.UndefOr[Any], Array]
      ] = js.undefined
    
    /** [Method] Get a leaf level header by index regardless of what the nesting structure is
      * @param index Number The column index for which to retrieve the column.
      */
    var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
      * @param header Ext.grid.column.Column The header to find the index of
      * @returns Number The index of the specified column header
      */
    var getHeaderIndex: js.UndefOr[
        js.Function1[/* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn], Double]
      ] = js.undefined
    
    /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
      * @returns Array menuItems
      */
    var getMenuItems: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns an array of the visible columns in the grid
      * @returns Array
      */
    var getVisibleGridColumns: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] When passed a column index returns the closet visible column to that
      * @param index Number Position at which to find the closest visible column.
      */
    var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var isGroupHeader: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var `sealed`: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var weight: js.UndefOr[Double] = js.undefined
  }
  object IContainer {
    
    inline def apply(): IContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IContainer]
    }
    
    extension [Self <: IContainer](x: Self) {
      
      inline def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      inline def setEnableColumnHide(value: Boolean): Self = StObject.set(x, "enableColumnHide", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnHideUndefined: Self = StObject.set(x, "enableColumnHide", js.undefined)
      
      inline def setGetColumnCount(value: () => Unit): Self = StObject.set(x, "getColumnCount", js.Any.fromFunction0(value))
      
      inline def setGetColumnCountUndefined: Self = StObject.set(x, "getColumnCount", js.undefined)
      
      inline def setGetColumnMenu(value: /* headerContainer */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getColumnMenu", js.Any.fromFunction1(value))
      
      inline def setGetColumnMenuUndefined: Self = StObject.set(x, "getColumnMenu", js.undefined)
      
      inline def setGetFullWidth(value: () => Unit): Self = StObject.set(x, "getFullWidth", js.Any.fromFunction0(value))
      
      inline def setGetFullWidthUndefined: Self = StObject.set(x, "getFullWidth", js.undefined)
      
      inline def setGetGridColumns(value: (/* inResult */ js.UndefOr[Any], /* hiddenAncestor */ js.UndefOr[Any]) => Array): Self = StObject.set(x, "getGridColumns", js.Any.fromFunction2(value))
      
      inline def setGetGridColumnsUndefined: Self = StObject.set(x, "getGridColumns", js.undefined)
      
      inline def setGetHeaderAtIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "getHeaderAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetHeaderAtIndexUndefined: Self = StObject.set(x, "getHeaderAtIndex", js.undefined)
      
      inline def setGetHeaderIndex(value: /* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn] => Double): Self = StObject.set(x, "getHeaderIndex", js.Any.fromFunction1(value))
      
      inline def setGetHeaderIndexUndefined: Self = StObject.set(x, "getHeaderIndex", js.undefined)
      
      inline def setGetMenuItems(value: () => Array): Self = StObject.set(x, "getMenuItems", js.Any.fromFunction0(value))
      
      inline def setGetMenuItemsUndefined: Self = StObject.set(x, "getMenuItems", js.undefined)
      
      inline def setGetVisibleGridColumns(value: () => Array): Self = StObject.set(x, "getVisibleGridColumns", js.Any.fromFunction0(value))
      
      inline def setGetVisibleGridColumnsUndefined: Self = StObject.set(x, "getVisibleGridColumns", js.undefined)
      
      inline def setGetVisibleHeaderClosestToIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "getVisibleHeaderClosestToIndex", js.Any.fromFunction1(value))
      
      inline def setGetVisibleHeaderClosestToIndexUndefined: Self = StObject.set(x, "getVisibleHeaderClosestToIndex", js.undefined)
      
      inline def setIsGroupHeader(value: Boolean): Self = StObject.set(x, "isGroupHeader", value.asInstanceOf[js.Any])
      
      inline def setIsGroupHeaderUndefined: Self = StObject.set(x, "isGroupHeader", js.undefined)
      
      inline def setSealed(value: Boolean): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
      
      inline def setSealedUndefined: Self = StObject.set(x, "sealed", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait IDragZone
    extends StObject
       with typings.extjs.Ext.dd.IDragZone
  object IDragZone {
    
    inline def apply(): IDragZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragZone]
    }
  }
  
  trait IDropZone
    extends StObject
       with typings.extjs.Ext.dd.IDropZone
  object IDropZone {
    
    inline def apply(): IDropZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropZone]
    }
  }
}
