package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var color: js.UndefOr[LabelColor] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelListVisibility: js.UndefOr[String] = js.undefined
  var messageListVisibility: js.UndefOr[String] = js.undefined
  var messagesTotal: js.UndefOr[Double] = js.undefined
  var messagesUnread: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var threadsTotal: js.UndefOr[Double] = js.undefined
  var threadsUnread: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    color: LabelColor = null,
    id: String = null,
    labelListVisibility: String = null,
    messageListVisibility: String = null,
    messagesTotal: Int | Double = null,
    messagesUnread: Int | Double = null,
    name: String = null,
    threadsTotal: Int | Double = null,
    threadsUnread: Int | Double = null,
    `type`: String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelListVisibility != null) __obj.updateDynamic("labelListVisibility")(labelListVisibility.asInstanceOf[js.Any])
    if (messageListVisibility != null) __obj.updateDynamic("messageListVisibility")(messageListVisibility.asInstanceOf[js.Any])
    if (messagesTotal != null) __obj.updateDynamic("messagesTotal")(messagesTotal.asInstanceOf[js.Any])
    if (messagesUnread != null) __obj.updateDynamic("messagesUnread")(messagesUnread.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (threadsTotal != null) __obj.updateDynamic("threadsTotal")(threadsTotal.asInstanceOf[js.Any])
    if (threadsUnread != null) __obj.updateDynamic("threadsUnread")(threadsUnread.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

