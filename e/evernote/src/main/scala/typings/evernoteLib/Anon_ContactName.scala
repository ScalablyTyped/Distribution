package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContactName extends js.Object {
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var hasSharedNotebook: js.UndefOr[scala.Boolean] = js.undefined
  var joinedUserCount: js.UndefOr[scala.Double] = js.undefined
  var notebookDisplayName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContactName {
  @scala.inline
  def apply(
    contactName: java.lang.String = null,
    guid: java.lang.String = null,
    hasSharedNotebook: js.UndefOr[scala.Boolean] = js.undefined,
    joinedUserCount: scala.Int | scala.Double = null,
    notebookDisplayName: java.lang.String = null
  ): Anon_ContactName = {
    val __obj = js.Dynamic.literal()
    if (contactName != null) __obj.updateDynamic("contactName")(contactName)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (!js.isUndefined(hasSharedNotebook)) __obj.updateDynamic("hasSharedNotebook")(hasSharedNotebook)
    if (joinedUserCount != null) __obj.updateDynamic("joinedUserCount")(joinedUserCount.asInstanceOf[js.Any])
    if (notebookDisplayName != null) __obj.updateDynamic("notebookDisplayName")(notebookDisplayName)
    __obj.asInstanceOf[Anon_ContactName]
  }
}

