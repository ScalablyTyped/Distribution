package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /** A user-assigned name for this group, used only for display purposes. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The filter used to determine which monitored resources belong to this group. */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the members of this group are considered to be a cluster. The system can perform additional analysis on groups that are clusters. */
  var isCluster: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Output only. The name of this group. The format is "projects/{project_id_or_number}/groups/{group_id}". When creating a group, this field is ignored
    * and a new name is created consisting of the project specified in the call to CreateGroup and a unique {group_id} that is generated automatically.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the group's parent, if it has one. The format is "projects/{project_id_or_number}/groups/{group_id}". For groups with no parent, parentName
    * is the empty string, "".
    */
  var parentName: js.UndefOr[java.lang.String] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    filter: java.lang.String = null,
    isCluster: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    parentName: java.lang.String = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(isCluster)) __obj.updateDynamic("isCluster")(isCluster)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    __obj.asInstanceOf[Group]
  }
}

