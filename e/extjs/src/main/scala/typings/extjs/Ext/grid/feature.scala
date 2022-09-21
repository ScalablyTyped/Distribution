package typings.extjs.Ext.grid

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.view.ITable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feature {
  
  trait IAbstractSummary
    extends StObject
       with IFeature {
    
    /** [Config Option] (String) */
    var remoteRoot: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showSummaryRow: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Toggle whether or not to show the summary row
      * @param visible Boolean True to show the summary row
      */
    var toggleSummaryRow: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IAbstractSummary {
    
    inline def apply(): IAbstractSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractSummary]
    }
    
    extension [Self <: IAbstractSummary](x: Self) {
      
      inline def setRemoteRoot(value: String): Self = StObject.set(x, "remoteRoot", value.asInstanceOf[js.Any])
      
      inline def setRemoteRootUndefined: Self = StObject.set(x, "remoteRoot", js.undefined)
      
      inline def setShowSummaryRow(value: Boolean): Self = StObject.set(x, "showSummaryRow", value.asInstanceOf[js.Any])
      
      inline def setShowSummaryRowUndefined: Self = StObject.set(x, "showSummaryRow", js.undefined)
      
      inline def setToggleSummaryRow(value: /* visible */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "toggleSummaryRow", js.Any.fromFunction1(value))
      
      inline def setToggleSummaryRowUndefined: Self = StObject.set(x, "toggleSummaryRow", js.undefined)
    }
  }
  
  trait IFeature
    extends StObject
       with IObservable {
    
    /** [Method] Disables the feature  */
    var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Enables the feature  */
    var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (String) */
    var eventPrefix: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var eventSelector: js.UndefOr[String] = js.undefined
    
    /** [Method] Abstract method to be overriden when a feature should add additional arguments to its event signature
      * @param eventName Object
      * @param view Object
      * @param featureTarget Object
      * @param e Object
      */
    var getFireEventArgs: js.UndefOr[
        js.Function4[
          /* eventName */ js.UndefOr[Any], 
          /* view */ js.UndefOr[Any], 
          /* featureTarget */ js.UndefOr[Any], 
          /* e */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Property] (Ext.grid.Panel) */
    var grid: js.UndefOr[IPanel] = js.undefined
    
    /** [Property] (Boolean) */
    var hasFeatureEvent: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Ext.view.Table) */
    var view: js.UndefOr[ITable] = js.undefined
  }
  object IFeature {
    
    inline def apply(): IFeature = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFeature]
    }
    
    extension [Self <: IFeature](x: Self) {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEventPrefix(value: String): Self = StObject.set(x, "eventPrefix", value.asInstanceOf[js.Any])
      
      inline def setEventPrefixUndefined: Self = StObject.set(x, "eventPrefix", js.undefined)
      
      inline def setEventSelector(value: String): Self = StObject.set(x, "eventSelector", value.asInstanceOf[js.Any])
      
      inline def setEventSelectorUndefined: Self = StObject.set(x, "eventSelector", js.undefined)
      
      inline def setGetFireEventArgs(
        value: (/* eventName */ js.UndefOr[Any], /* view */ js.UndefOr[Any], /* featureTarget */ js.UndefOr[Any], /* e */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "getFireEventArgs", js.Any.fromFunction4(value))
      
      inline def setGetFireEventArgsUndefined: Self = StObject.set(x, "getFireEventArgs", js.undefined)
      
      inline def setGrid(value: IPanel): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHasFeatureEvent(value: Boolean): Self = StObject.set(x, "hasFeatureEvent", value.asInstanceOf[js.Any])
      
      inline def setHasFeatureEventUndefined: Self = StObject.set(x, "hasFeatureEvent", js.undefined)
      
      inline def setView(value: ITable): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait IGroupStore
    extends StObject
       with IObservable {
    
    /** [Method] Get the index within the entire dataset
      * @param record Ext.data.Model The Ext.data.Model object to find.
      * @returns Number The index of the passed Record. Returns -1 if not found.
      */
    var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  }
  object IGroupStore {
    
    inline def apply(): IGroupStore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupStore]
    }
    
    extension [Self <: IGroupStore](x: Self) {
      
      inline def setIndexOfTotal(value: /* record */ js.UndefOr[IModel] => Double): Self = StObject.set(x, "indexOfTotal", js.Any.fromFunction1(value))
      
      inline def setIndexOfTotalUndefined: Self = StObject.set(x, "indexOfTotal", js.undefined)
    }
  }
  
  trait IGrouping
    extends StObject
       with IAbstractSummary {
    
    /** [Method] Collapse a group
      * @param groupName String The group name
      * @param focus Boolean Pass true to focus the group after expand.
      */
    var collapse: js.UndefOr[
        js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Collapse all groups */
    var collapseAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var depthToIndent: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableGroupingMenu: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enableNoGroups: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Expand a group
      * @param groupName String The group name
      * @param focus Boolean Pass true to focus the group after expand.
      */
    var expand: js.UndefOr[
        js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Expand all groups */
    var expandAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
      * @param record Ext.data.Model The record for which to return group information.
      * @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
      */
    var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Any]] = js.undefined
    
    /** [Config Option] (String) */
    var groupByText: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String/Array/Ext.Template) */
    var groupHeaderTpl: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var hideGroupedHeader: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns true if the named group is expanded
      * @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
      * @returns Boolean true if the group defined by that value is expanded.
      */
    var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], Boolean]] = js.undefined
    
    /** [Config Option] (String) */
    var showGroupsText: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var startCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object IGrouping {
    
    inline def apply(): IGrouping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGrouping]
    }
    
    extension [Self <: IGrouping](x: Self) {
      
      inline def setCollapse(value: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
      
      inline def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
      
      inline def setCollapseAllUndefined: Self = StObject.set(x, "collapseAll", js.undefined)
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDepthToIndent(value: Double): Self = StObject.set(x, "depthToIndent", value.asInstanceOf[js.Any])
      
      inline def setDepthToIndentUndefined: Self = StObject.set(x, "depthToIndent", js.undefined)
      
      inline def setEnableGroupingMenu(value: Boolean): Self = StObject.set(x, "enableGroupingMenu", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupingMenuUndefined: Self = StObject.set(x, "enableGroupingMenu", js.undefined)
      
      inline def setEnableNoGroups(value: Boolean): Self = StObject.set(x, "enableNoGroups", value.asInstanceOf[js.Any])
      
      inline def setEnableNoGroupsUndefined: Self = StObject.set(x, "enableNoGroups", js.undefined)
      
      inline def setExpand(value: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction2(value))
      
      inline def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
      
      inline def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setGetRecordGroup(value: /* record */ js.UndefOr[IModel] => Any): Self = StObject.set(x, "getRecordGroup", js.Any.fromFunction1(value))
      
      inline def setGetRecordGroupUndefined: Self = StObject.set(x, "getRecordGroup", js.undefined)
      
      inline def setGroupByText(value: String): Self = StObject.set(x, "groupByText", value.asInstanceOf[js.Any])
      
      inline def setGroupByTextUndefined: Self = StObject.set(x, "groupByText", js.undefined)
      
      inline def setGroupHeaderTpl(value: Any): Self = StObject.set(x, "groupHeaderTpl", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderTplUndefined: Self = StObject.set(x, "groupHeaderTpl", js.undefined)
      
      inline def setHideGroupedHeader(value: Boolean): Self = StObject.set(x, "hideGroupedHeader", value.asInstanceOf[js.Any])
      
      inline def setHideGroupedHeaderUndefined: Self = StObject.set(x, "hideGroupedHeader", js.undefined)
      
      inline def setIsExpanded(value: /* groupName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction1(value))
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setShowGroupsText(value: String): Self = StObject.set(x, "showGroupsText", value.asInstanceOf[js.Any])
      
      inline def setShowGroupsTextUndefined: Self = StObject.set(x, "showGroupsText", js.undefined)
      
      inline def setStartCollapsed(value: Boolean): Self = StObject.set(x, "startCollapsed", value.asInstanceOf[js.Any])
      
      inline def setStartCollapsedUndefined: Self = StObject.set(x, "startCollapsed", js.undefined)
    }
  }
  
  trait IGroupingSummary
    extends StObject
       with IGrouping
  object IGroupingSummary {
    
    inline def apply(): IGroupingSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupingSummary]
    }
  }
  
  trait IRowBody
    extends StObject
       with IFeature {
    
    /** [Method] Provides additional data to the prepareData call within the grid view
      * @param data Object The data for this particular record.
      * @param idx Number The row index for this record.
      * @param record Ext.data.Model The record instance
      * @param orig Object The original result from the prepareData call to massage.
      */
    var getAdditionalData: js.UndefOr[
        js.Function4[
          /* data */ js.UndefOr[Any], 
          /* idx */ js.UndefOr[Double], 
          /* record */ js.UndefOr[IModel], 
          /* orig */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IRowBody {
    
    inline def apply(): IRowBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowBody]
    }
    
    extension [Self <: IRowBody](x: Self) {
      
      inline def setGetAdditionalData(
        value: (/* data */ js.UndefOr[Any], /* idx */ js.UndefOr[Double], /* record */ js.UndefOr[IModel], /* orig */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "getAdditionalData", js.Any.fromFunction4(value))
      
      inline def setGetAdditionalDataUndefined: Self = StObject.set(x, "getAdditionalData", js.undefined)
    }
  }
  
  trait IRowWrap
    extends StObject
       with IFeature
  object IRowWrap {
    
    inline def apply(): IRowWrap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowWrap]
    }
  }
  
  trait ISummary
    extends StObject
       with IAbstractSummary {
    
    /** [Config Option] (String) */
    var dock: js.UndefOr[String] = js.undefined
  }
  object ISummary {
    
    inline def apply(): ISummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISummary]
    }
    
    extension [Self <: ISummary](x: Self) {
      
      inline def setDock(value: String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
      
      inline def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
    }
  }
}
