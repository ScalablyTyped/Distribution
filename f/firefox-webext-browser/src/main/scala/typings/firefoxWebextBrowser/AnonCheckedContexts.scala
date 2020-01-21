package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.NumberDictionary
import typings.firefoxWebextBrowser.browser.contextMenus.ContextType
import typings.firefoxWebextBrowser.browser.contextMenus.ItemType
import typings.firefoxWebextBrowser.browser.contextMenus.OnClickData
import typings.firefoxWebextBrowser.browser.extension.ViewType
import typings.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedContexts extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var contexts: js.UndefOr[js.Array[ContextType]] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[NumberDictionary[String]] = js.undefined
  /**
    * @param tab The details of the tab where the click took place. Note: this parameter only present for
    *     extensions.
    */
  var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.undefined
  /** Note: You cannot change an item to be a child of one of its own descendants. */
  var parentId: js.UndefOr[Double | String] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ItemType] = js.undefined
  var viewTypes: js.UndefOr[js.Array[ViewType]] = js.undefined
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonCheckedContexts {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[ContextType] = null,
    documentUrlPatterns: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icons: NumberDictionary[String] = null,
    onclick: (/* info */ OnClickData, /* tab */ Tab) => Unit = null,
    parentId: Double | String = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: ItemType = null,
    viewTypes: js.Array[ViewType] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonCheckedContexts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction2(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (viewTypes != null) __obj.updateDynamic("viewTypes")(viewTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckedContexts]
  }
}

