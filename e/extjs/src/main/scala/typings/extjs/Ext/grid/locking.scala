package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.grid.header.IContainer
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locking {
  
  trait IHeaderContainer
    extends StObject
       with IContainer {
    
    /** [Method] This is the function which all other column access methods are based upon Return the full column set for the whole Lo
      * @returns Array
      */
    @JSName("getGridColumns")
    var getGridColumns_IHeaderContainer: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th  */
    @JSName("getRefItems")
    var getRefItems_IHeaderContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IHeaderContainer {
    
    @scala.inline
    def apply(): IHeaderContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderContainer]
    }
    
    @scala.inline
    implicit class IHeaderContainerMutableBuilder[Self <: IHeaderContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetGridColumns(value: () => Array): Self = StObject.set(x, "getGridColumns", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGridColumnsUndefined: Self = StObject.set(x, "getGridColumns", js.undefined)
      
      @scala.inline
      def setGetRefItems(value: () => Unit): Self = StObject.set(x, "getRefItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRefItemsUndefined: Self = StObject.set(x, "getRefItems", js.undefined)
    }
  }
  
  trait ILockable
    extends StObject
       with IBase {
    
    /** [Config Option] (Object) */
    var lockedGridConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var lockedViewConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var normalGridConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var normalViewConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Number) */
    var scrollDelta: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var subGridXType: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var syncRowHeight: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
    var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ILockable {
    
    @scala.inline
    def apply(): typings.extjs.Ext.grid.locking.ILockable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.grid.locking.ILockable]
    }
    
    @scala.inline
    implicit class ILockableMutableBuilder[Self <: typings.extjs.Ext.grid.locking.ILockable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLockedGridConfig(value: js.Any): Self = StObject.set(x, "lockedGridConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedGridConfigUndefined: Self = StObject.set(x, "lockedGridConfig", js.undefined)
      
      @scala.inline
      def setLockedViewConfig(value: js.Any): Self = StObject.set(x, "lockedViewConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedViewConfigUndefined: Self = StObject.set(x, "lockedViewConfig", js.undefined)
      
      @scala.inline
      def setNormalGridConfig(value: js.Any): Self = StObject.set(x, "normalGridConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalGridConfigUndefined: Self = StObject.set(x, "normalGridConfig", js.undefined)
      
      @scala.inline
      def setNormalViewConfig(value: js.Any): Self = StObject.set(x, "normalViewConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalViewConfigUndefined: Self = StObject.set(x, "normalViewConfig", js.undefined)
      
      @scala.inline
      def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDeltaUndefined: Self = StObject.set(x, "scrollDelta", js.undefined)
      
      @scala.inline
      def setSubGridXType(value: String): Self = StObject.set(x, "subGridXType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubGridXTypeUndefined: Self = StObject.set(x, "subGridXType", js.undefined)
      
      @scala.inline
      def setSyncRowHeight(value: Boolean): Self = StObject.set(x, "syncRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncRowHeightUndefined: Self = StObject.set(x, "syncRowHeight", js.undefined)
      
      @scala.inline
      def setSyncRowHeights(value: () => Unit): Self = StObject.set(x, "syncRowHeights", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncRowHeightsUndefined: Self = StObject.set(x, "syncRowHeights", js.undefined)
    }
  }
  
  trait IView
    extends StObject
       with IObservable {
    
    /** [Property] (Boolean) */
    var isLockingView: js.UndefOr[Boolean] = js.undefined
  }
  object IView {
    
    @scala.inline
    def apply(): typings.extjs.Ext.grid.locking.IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.grid.locking.IView]
    }
    
    @scala.inline
    implicit class IViewMutableBuilder[Self <: typings.extjs.Ext.grid.locking.IView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLockingView(value: Boolean): Self = StObject.set(x, "isLockingView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLockingViewUndefined: Self = StObject.set(x, "isLockingView", js.undefined)
    }
  }
}
