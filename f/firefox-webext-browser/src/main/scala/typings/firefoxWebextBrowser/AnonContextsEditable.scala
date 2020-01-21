package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.extension.ViewType
import typings.firefoxWebextBrowser.browser.menus.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextsEditable extends js.Object {
  /** A list of all contexts that apply to the menu. */
  var contexts: js.Array[ContextType]
  var editable: Boolean
  var frameUrl: js.UndefOr[String] = js.undefined
  var linkText: js.UndefOr[String] = js.undefined
  var linkUrl: js.UndefOr[String] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  /** A list of IDs of the menu items that were shown. */
  var menuIds: Double | js.Array[String]
  var pageUrl: js.UndefOr[String] = js.undefined
  var selectionText: js.UndefOr[String] = js.undefined
  var srcUrl: js.UndefOr[String] = js.undefined
  var targetElementId: js.UndefOr[Double] = js.undefined
  var viewType: js.UndefOr[ViewType] = js.undefined
}

object AnonContextsEditable {
  @scala.inline
  def apply(
    contexts: js.Array[ContextType],
    editable: Boolean,
    menuIds: Double | js.Array[String],
    frameUrl: String = null,
    linkText: String = null,
    linkUrl: String = null,
    mediaType: String = null,
    pageUrl: String = null,
    selectionText: String = null,
    srcUrl: String = null,
    targetElementId: Int | Double = null,
    viewType: ViewType = null
  ): AnonContextsEditable = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
    if (frameUrl != null) __obj.updateDynamic("frameUrl")(frameUrl.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (linkUrl != null) __obj.updateDynamic("linkUrl")(linkUrl.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText.asInstanceOf[js.Any])
    if (srcUrl != null) __obj.updateDynamic("srcUrl")(srcUrl.asInstanceOf[js.Any])
    if (targetElementId != null) __obj.updateDynamic("targetElementId")(targetElementId.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextsEditable]
  }
}

