package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var color: js.UndefOr[LabelColor] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labelListVisibility: js.UndefOr[java.lang.String] = js.undefined
  var messageListVisibility: js.UndefOr[java.lang.String] = js.undefined
  var messagesTotal: js.UndefOr[scala.Double] = js.undefined
  var messagesUnread: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var threadsTotal: js.UndefOr[scala.Double] = js.undefined
  var threadsUnread: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    color: LabelColor = null,
    id: java.lang.String = null,
    labelListVisibility: java.lang.String = null,
    messageListVisibility: java.lang.String = null,
    messagesTotal: scala.Int | scala.Double = null,
    messagesUnread: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    threadsTotal: scala.Int | scala.Double = null,
    threadsUnread: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelListVisibility != null) __obj.updateDynamic("labelListVisibility")(labelListVisibility)
    if (messageListVisibility != null) __obj.updateDynamic("messageListVisibility")(messageListVisibility)
    if (messagesTotal != null) __obj.updateDynamic("messagesTotal")(messagesTotal.asInstanceOf[js.Any])
    if (messagesUnread != null) __obj.updateDynamic("messagesUnread")(messagesUnread.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (threadsTotal != null) __obj.updateDynamic("threadsTotal")(threadsTotal.asInstanceOf[js.Any])
    if (threadsUnread != null) __obj.updateDynamic("threadsUnread")(threadsUnread.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Label]
  }
}

