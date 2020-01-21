package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContactName extends js.Object {
  var contactName: js.UndefOr[String] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var hasSharedNotebook: js.UndefOr[Boolean] = js.undefined
  var joinedUserCount: js.UndefOr[Double] = js.undefined
  var notebookDisplayName: js.UndefOr[String] = js.undefined
}

object AnonContactName {
  @scala.inline
  def apply(
    contactName: String = null,
    guid: String = null,
    hasSharedNotebook: js.UndefOr[Boolean] = js.undefined,
    joinedUserCount: Int | Double = null,
    notebookDisplayName: String = null
  ): AnonContactName = {
    val __obj = js.Dynamic.literal()
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSharedNotebook)) __obj.updateDynamic("hasSharedNotebook")(hasSharedNotebook.asInstanceOf[js.Any])
    if (joinedUserCount != null) __obj.updateDynamic("joinedUserCount")(joinedUserCount.asInstanceOf[js.Any])
    if (notebookDisplayName != null) __obj.updateDynamic("notebookDisplayName")(notebookDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContactName]
  }
}

