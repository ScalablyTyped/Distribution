package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroup extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var formattedName: js.UndefOr[java.lang.String] = js.undefined
  var groupType: js.UndefOr[java.lang.String] = js.undefined
  var memberCount: js.UndefOr[scala.Double] = js.undefined
  var memberResourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var metadata: js.UndefOr[ContactGroupMetadata] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
}

object ContactGroup {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    formattedName: java.lang.String = null,
    groupType: java.lang.String = null,
    memberCount: scala.Int | scala.Double = null,
    memberResourceNames: js.Array[java.lang.String] = null,
    metadata: ContactGroupMetadata = null,
    name: java.lang.String = null,
    resourceName: java.lang.String = null
  ): ContactGroup = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (formattedName != null) __obj.updateDynamic("formattedName")(formattedName)
    if (groupType != null) __obj.updateDynamic("groupType")(groupType)
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (memberResourceNames != null) __obj.updateDynamic("memberResourceNames")(memberResourceNames)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ContactGroup]
  }
}

