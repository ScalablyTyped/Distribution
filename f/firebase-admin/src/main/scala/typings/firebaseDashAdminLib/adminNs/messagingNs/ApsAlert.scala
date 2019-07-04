package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApsAlert extends js.Object {
  var actionLocKey: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var launchImage: js.UndefOr[java.lang.String] = js.undefined
  var locArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var locKey: js.UndefOr[java.lang.String] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var subtitleLocArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subtitleLocKey: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleLocArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var titleLocKey: js.UndefOr[java.lang.String] = js.undefined
}

object ApsAlert {
  @scala.inline
  def apply(
    actionLocKey: java.lang.String = null,
    body: java.lang.String = null,
    launchImage: java.lang.String = null,
    locArgs: js.Array[java.lang.String] = null,
    locKey: java.lang.String = null,
    subtitle: java.lang.String = null,
    subtitleLocArgs: js.Array[java.lang.String] = null,
    subtitleLocKey: java.lang.String = null,
    title: java.lang.String = null,
    titleLocArgs: js.Array[java.lang.String] = null,
    titleLocKey: java.lang.String = null
  ): ApsAlert = {
    val __obj = js.Dynamic.literal()
    if (actionLocKey != null) __obj.updateDynamic("actionLocKey")(actionLocKey)
    if (body != null) __obj.updateDynamic("body")(body)
    if (launchImage != null) __obj.updateDynamic("launchImage")(launchImage)
    if (locArgs != null) __obj.updateDynamic("locArgs")(locArgs)
    if (locKey != null) __obj.updateDynamic("locKey")(locKey)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleLocArgs != null) __obj.updateDynamic("subtitleLocArgs")(subtitleLocArgs)
    if (subtitleLocKey != null) __obj.updateDynamic("subtitleLocKey")(subtitleLocKey)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs)
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey)
    __obj.asInstanceOf[ApsAlert]
  }
}

