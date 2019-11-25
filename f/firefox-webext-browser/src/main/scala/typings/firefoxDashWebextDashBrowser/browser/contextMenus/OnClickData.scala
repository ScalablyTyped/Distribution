package typings.firefoxDashWebextDashBrowser.browser.contextMenus

import typings.firefoxDashWebextDashBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information sent when a context menu item is clicked. */
trait OnClickData extends js.Object {
  /** The id of the bookmark where the context menu was clicked, if it was on a bookmark. */
  var bookmarkId: String
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[Double] = js.undefined
  /** A flag indicating the state of a checkbox or radio item after it is clicked. */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** A flag indicating whether the element is editable (text input, textarea, etc.). */
  var editable: Boolean
  /** The id of the frame of the element where the context menu was clicked. */
  var frameId: js.UndefOr[Double] = js.undefined
  /** The URL of the frame of the element where the context menu was clicked, if it was in a frame. */
  var frameUrl: js.UndefOr[String] = js.undefined
  /** If the element is a link, the text of that link. */
  var linkText: js.UndefOr[String] = js.undefined
  /** If the element is a link, the URL it points to. */
  var linkUrl: js.UndefOr[String] = js.undefined
  /**
    * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
    */
  var mediaType: js.UndefOr[String] = js.undefined
  /** The ID of the menu item that was clicked. */
  var menuItemId: Double | String
  /** An array of keyboard modifiers that were held while the menu item was clicked. */
  var modifiers: js.Array[_OnClickDataModifiers]
  /**
    * The URL of the page where the menu item was clicked. This property is not set if the click occured in a
    * context where there is no current page, such as in a launcher context menu.
    */
  var pageUrl: js.UndefOr[String] = js.undefined
  /** The parent ID, if any, for the item clicked. */
  var parentMenuItemId: js.UndefOr[Double | String] = js.undefined
  /** The text for the context selection, if any. */
  var selectionText: js.UndefOr[String] = js.undefined
  /** Will be present for elements with a 'src' URL. */
  var srcUrl: js.UndefOr[String] = js.undefined
  /**
    * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the
    * corresponding element.
    */
  var targetElementId: js.UndefOr[Double] = js.undefined
  /** The type of view where the menu is clicked. May be unset if the menu is not associated with a view. */
  var viewType: js.UndefOr[ViewType] = js.undefined
  /** A flag indicating the state of a checkbox or radio item before it was clicked. */
  var wasChecked: js.UndefOr[Boolean] = js.undefined
}

object OnClickData {
  @scala.inline
  def apply(
    bookmarkId: String,
    editable: Boolean,
    menuItemId: Double | String,
    modifiers: js.Array[_OnClickDataModifiers],
    button: Int | Double = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    frameId: Int | Double = null,
    frameUrl: String = null,
    linkText: String = null,
    linkUrl: String = null,
    mediaType: String = null,
    pageUrl: String = null,
    parentMenuItemId: Double | String = null,
    selectionText: String = null,
    srcUrl: String = null,
    targetElementId: Int | Double = null,
    viewType: ViewType = null,
    wasChecked: js.UndefOr[Boolean] = js.undefined
  ): OnClickData = {
    val __obj = js.Dynamic.literal(bookmarkId = bookmarkId.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (frameUrl != null) __obj.updateDynamic("frameUrl")(frameUrl.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (linkUrl != null) __obj.updateDynamic("linkUrl")(linkUrl.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (parentMenuItemId != null) __obj.updateDynamic("parentMenuItemId")(parentMenuItemId.asInstanceOf[js.Any])
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText.asInstanceOf[js.Any])
    if (srcUrl != null) __obj.updateDynamic("srcUrl")(srcUrl.asInstanceOf[js.Any])
    if (targetElementId != null) __obj.updateDynamic("targetElementId")(targetElementId.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    if (!js.isUndefined(wasChecked)) __obj.updateDynamic("wasChecked")(wasChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
}

