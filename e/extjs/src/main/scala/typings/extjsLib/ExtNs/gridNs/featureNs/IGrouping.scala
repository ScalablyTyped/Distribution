package typings
package extjsLib.ExtNs.gridNs.featureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGrouping extends IAbstractSummary {
  /** [Method] Collapse a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var collapse: js.UndefOr[
    js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Collapse all groups */
  var collapseAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var depthToIndent: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableGroupingMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableNoGroups: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Expand a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var expand: js.UndefOr[
    js.Function2[
      /* groupName */ js.UndefOr[java.lang.String], 
      /* focus */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand all groups */
  var expandAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
  		* @param record Ext.data.Model The record for which to return group information.
  		* @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
  		*/
  var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], _]] = js.undefined
  /** [Config Option] (String) */
  var groupByText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Array/Ext.Template) */
  var groupHeaderTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideGroupedHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the named group is expanded
  		* @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
  		* @returns Boolean true if the group defined by that value is expanded.
  		*/
  var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var showGroupsText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var startCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

