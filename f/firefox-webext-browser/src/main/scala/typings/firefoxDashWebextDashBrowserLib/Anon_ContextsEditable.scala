package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextsEditable extends js.Object {
  /** A list of all contexts that apply to the menu. */
  var contexts: js.Array[firefoxDashWebextDashBrowserLib.browserNs.menusNs.ContextType]
  var editable: scala.Boolean
  var frameUrl: js.UndefOr[java.lang.String] = js.undefined
  var linkText: js.UndefOr[java.lang.String] = js.undefined
  var linkUrl: js.UndefOr[java.lang.String] = js.undefined
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  /** A list of IDs of the menu items that were shown. */
  var menuIds: scala.Double | js.Array[java.lang.String]
  var pageUrl: js.UndefOr[java.lang.String] = js.undefined
  var selectionText: js.UndefOr[java.lang.String] = js.undefined
  var srcUrl: js.UndefOr[java.lang.String] = js.undefined
  var targetElementId: js.UndefOr[scala.Double] = js.undefined
  var viewType: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType] = js.undefined
}

object Anon_ContextsEditable {
  @scala.inline
  def apply(
    contexts: js.Array[firefoxDashWebextDashBrowserLib.browserNs.menusNs.ContextType],
    editable: scala.Boolean,
    menuIds: scala.Double | js.Array[java.lang.String],
    frameUrl: java.lang.String = null,
    linkText: java.lang.String = null,
    linkUrl: java.lang.String = null,
    mediaType: java.lang.String = null,
    pageUrl: java.lang.String = null,
    selectionText: java.lang.String = null,
    srcUrl: java.lang.String = null,
    targetElementId: scala.Int | scala.Double = null,
    viewType: firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType = null
  ): Anon_ContextsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contexts")(contexts)
    __obj.updateDynamic("editable")(editable)
    __obj.updateDynamic("menuIds")(menuIds.asInstanceOf[js.Any])
    if (frameUrl != null) __obj.updateDynamic("frameUrl")(frameUrl)
    if (linkText != null) __obj.updateDynamic("linkText")(linkText)
    if (linkUrl != null) __obj.updateDynamic("linkUrl")(linkUrl)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl)
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText)
    if (srcUrl != null) __obj.updateDynamic("srcUrl")(srcUrl)
    if (targetElementId != null) __obj.updateDynamic("targetElementId")(targetElementId.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[Anon_ContextsEditable]
  }
}

