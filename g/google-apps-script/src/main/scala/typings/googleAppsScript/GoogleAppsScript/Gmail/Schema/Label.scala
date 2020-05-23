package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

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
    messagesTotal: js.UndefOr[Double] = js.undefined,
    messagesUnread: js.UndefOr[Double] = js.undefined,
    name: String = null,
    threadsTotal: js.UndefOr[Double] = js.undefined,
    threadsUnread: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelListVisibility != null) __obj.updateDynamic("labelListVisibility")(labelListVisibility.asInstanceOf[js.Any])
    if (messageListVisibility != null) __obj.updateDynamic("messageListVisibility")(messageListVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesTotal)) __obj.updateDynamic("messagesTotal")(messagesTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesUnread)) __obj.updateDynamic("messagesUnread")(messagesUnread.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsTotal)) __obj.updateDynamic("threadsTotal")(threadsTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsUnread)) __obj.updateDynamic("threadsUnread")(threadsUnread.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

