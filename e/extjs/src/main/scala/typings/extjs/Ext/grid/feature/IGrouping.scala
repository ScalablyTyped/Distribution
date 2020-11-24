package typings.extjs.Ext.grid.feature

import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrouping extends IAbstractSummary {
  
  /** [Method] Collapse a group
    * @param groupName String The group name
    * @param focus Boolean Pass true to focus the group after expand.
    */
  var collapse: js.UndefOr[
    js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Collapse all groups */
  var collapseAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var depthToIndent: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var enableGroupingMenu: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enableNoGroups: js.UndefOr[Boolean] = js.native
  
  /** [Method] Expand a group
    * @param groupName String The group name
    * @param focus Boolean Pass true to focus the group after expand.
    */
  var expand: js.UndefOr[
    js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Expand all groups */
  var expandAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
    * @param record Ext.data.Model The record for which to return group information.
    * @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
    */
  var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], _]] = js.native
  
  /** [Config Option] (String) */
  var groupByText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String/Array/Ext.Template) */
  var groupHeaderTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hideGroupedHeader: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if the named group is expanded
    * @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
    * @returns Boolean true if the group defined by that value is expanded.
    */
  var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Config Option] (String) */
  var showGroupsText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var startCollapsed: js.UndefOr[Boolean] = js.native
}
object IGrouping {
  
  @scala.inline
  def apply(): IGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouping]
  }
  
  @scala.inline
  implicit class IGroupingOps[Self <: IGrouping] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Unit): Self = this.set("collapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setCollapseAll(value: () => Unit): Self = this.set("collapseAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCollapseAll: Self = this.set("collapseAll", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDepthToIndent(value: Double): Self = this.set("depthToIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthToIndent: Self = this.set("depthToIndent", js.undefined)
    
    @scala.inline
    def setEnableGroupingMenu(value: Boolean): Self = this.set("enableGroupingMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroupingMenu: Self = this.set("enableGroupingMenu", js.undefined)
    
    @scala.inline
    def setEnableNoGroups(value: Boolean): Self = this.set("enableNoGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNoGroups: Self = this.set("enableNoGroups", js.undefined)
    
    @scala.inline
    def setExpand(value: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Unit): Self = this.set("expand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExpandAll(value: () => Unit): Self = this.set("expandAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExpandAll: Self = this.set("expandAll", js.undefined)
    
    @scala.inline
    def setGetRecordGroup(value: /* record */ js.UndefOr[IModel] => _): Self = this.set("getRecordGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRecordGroup: Self = this.set("getRecordGroup", js.undefined)
    
    @scala.inline
    def setGroupByText(value: String): Self = this.set("groupByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByText: Self = this.set("groupByText", js.undefined)
    
    @scala.inline
    def setGroupHeaderTpl(value: js.Any): Self = this.set("groupHeaderTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderTpl: Self = this.set("groupHeaderTpl", js.undefined)
    
    @scala.inline
    def setHideGroupedHeader(value: Boolean): Self = this.set("hideGroupedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideGroupedHeader: Self = this.set("hideGroupedHeader", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: /* groupName */ js.UndefOr[String] => Boolean): Self = this.set("isExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setShowGroupsText(value: String): Self = this.set("showGroupsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGroupsText: Self = this.set("showGroupsText", js.undefined)
    
    @scala.inline
    def setStartCollapsed(value: Boolean): Self = this.set("startCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCollapsed: Self = this.set("startCollapsed", js.undefined)
  }
}
