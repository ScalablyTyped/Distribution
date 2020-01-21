package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroup extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var formattedName: js.UndefOr[String] = js.undefined
  var groupType: js.UndefOr[String] = js.undefined
  var memberCount: js.UndefOr[Double] = js.undefined
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  var metadata: js.UndefOr[ContactGroupMetadata] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var resourceName: js.UndefOr[String] = js.undefined
}

object ContactGroup {
  @scala.inline
  def apply(
    etag: String = null,
    formattedName: String = null,
    groupType: String = null,
    memberCount: Int | Double = null,
    memberResourceNames: js.Array[String] = null,
    metadata: ContactGroupMetadata = null,
    name: String = null,
    resourceName: String = null
  ): ContactGroup = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (formattedName != null) __obj.updateDynamic("formattedName")(formattedName.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (memberResourceNames != null) __obj.updateDynamic("memberResourceNames")(memberResourceNames.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactGroup]
  }
}

