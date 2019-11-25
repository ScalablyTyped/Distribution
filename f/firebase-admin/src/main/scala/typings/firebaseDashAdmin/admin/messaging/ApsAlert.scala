package typings.firebaseDashAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApsAlert extends js.Object {
  var actionLocKey: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var launchImage: js.UndefOr[String] = js.undefined
  var locArgs: js.UndefOr[js.Array[String]] = js.undefined
  var locKey: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var subtitleLocArgs: js.UndefOr[js.Array[String]] = js.undefined
  var subtitleLocKey: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.undefined
  var titleLocKey: js.UndefOr[String] = js.undefined
}

object ApsAlert {
  @scala.inline
  def apply(
    actionLocKey: String = null,
    body: String = null,
    launchImage: String = null,
    locArgs: js.Array[String] = null,
    locKey: String = null,
    subtitle: String = null,
    subtitleLocArgs: js.Array[String] = null,
    subtitleLocKey: String = null,
    title: String = null,
    titleLocArgs: js.Array[String] = null,
    titleLocKey: String = null
  ): ApsAlert = {
    val __obj = js.Dynamic.literal()
    if (actionLocKey != null) __obj.updateDynamic("actionLocKey")(actionLocKey.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (launchImage != null) __obj.updateDynamic("launchImage")(launchImage.asInstanceOf[js.Any])
    if (locArgs != null) __obj.updateDynamic("locArgs")(locArgs.asInstanceOf[js.Any])
    if (locKey != null) __obj.updateDynamic("locKey")(locKey.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleLocArgs != null) __obj.updateDynamic("subtitleLocArgs")(subtitleLocArgs.asInstanceOf[js.Any])
    if (subtitleLocKey != null) __obj.updateDynamic("subtitleLocKey")(subtitleLocKey.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs.asInstanceOf[js.Any])
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApsAlert]
  }
}

