package typings
package firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information sent when a context menu item is clicked. */
trait OnClickData extends js.Object {
  /** The id of the bookmark where the context menu was clicked, if it was on a bookmark. */
  var bookmarkId: java.lang.String
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[scala.Double] = js.undefined
  /** A flag indicating the state of a checkbox or radio item after it is clicked. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** A flag indicating whether the element is editable (text input, textarea, etc.). */
  var editable: scala.Boolean
  /** The URL of the frame of the element where the context menu was clicked, if it was in a frame. */
  var frameUrl: js.UndefOr[java.lang.String] = js.undefined
  /** If the element is a link, the text of that link. */
  var linkText: js.UndefOr[java.lang.String] = js.undefined
  /** If the element is a link, the URL it points to. */
  var linkUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
    */
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the menu item that was clicked. */
  var menuItemId: scala.Double | java.lang.String
  /** An array of keyboard modifiers that were held while the menu item was clicked. */
  var modifiers: js.Array[_OnClickDataModifiers]
  /**
    * The URL of the page where the menu item was clicked. This property is not set if the click occured in a
    * context where there is no current page, such as in a launcher context menu.
    */
  var pageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The parent ID, if any, for the item clicked. */
  var parentMenuItemId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The text for the context selection, if any. */
  var selectionText: js.UndefOr[java.lang.String] = js.undefined
  /** Will be present for elements with a 'src' URL. */
  var srcUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the
    * corresponding element.
    */
  var targetElementId: js.UndefOr[scala.Double] = js.undefined
  /** The type of view where the menu is clicked. May be unset if the menu is not associated with a view. */
  var viewType: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType] = js.undefined
  /** A flag indicating the state of a checkbox or radio item before it was clicked. */
  var wasChecked: js.UndefOr[scala.Boolean] = js.undefined
}

