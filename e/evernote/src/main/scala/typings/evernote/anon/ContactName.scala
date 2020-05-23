package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactName extends js.Object {
  var contactName: js.UndefOr[String] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var hasSharedNotebook: js.UndefOr[Boolean] = js.undefined
  var joinedUserCount: js.UndefOr[Double] = js.undefined
  var notebookDisplayName: js.UndefOr[String] = js.undefined
}

object ContactName {
  @scala.inline
  def apply(
    contactName: String = null,
    guid: typings.evernote.mod.Types.Guid = null,
    hasSharedNotebook: js.UndefOr[Boolean] = js.undefined,
    joinedUserCount: js.UndefOr[Double] = js.undefined,
    notebookDisplayName: String = null
  ): ContactName = {
    val __obj = js.Dynamic.literal()
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSharedNotebook)) __obj.updateDynamic("hasSharedNotebook")(hasSharedNotebook.get.asInstanceOf[js.Any])
    if (!js.isUndefined(joinedUserCount)) __obj.updateDynamic("joinedUserCount")(joinedUserCount.get.asInstanceOf[js.Any])
    if (notebookDisplayName != null) __obj.updateDynamic("notebookDisplayName")(notebookDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactName]
  }
}

