package typings.firefoxWebextBrowser.browser.contextMenus

import typings.firefoxWebextBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information sent when a context menu item is clicked. */
@js.native
trait OnClickData extends js.Object {
  /** The id of the bookmark where the context menu was clicked, if it was on a bookmark. */
  var bookmarkId: String = js.native
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[Double] = js.native
  /** A flag indicating the state of a checkbox or radio item after it is clicked. */
  var checked: js.UndefOr[Boolean] = js.native
  /** A flag indicating whether the element is editable (text input, textarea, etc.). */
  var editable: Boolean = js.native
  /** The id of the frame of the element where the context menu was clicked. */
  var frameId: js.UndefOr[Double] = js.native
  /** The URL of the frame of the element where the context menu was clicked, if it was in a frame. */
  var frameUrl: js.UndefOr[String] = js.native
  /** If the element is a link, the text of that link. */
  var linkText: js.UndefOr[String] = js.native
  /** If the element is a link, the URL it points to. */
  var linkUrl: js.UndefOr[String] = js.native
  /**
    * One of 'image', 'video', or 'audio' if the context menu was activated on one of these types of elements.
    */
  var mediaType: js.UndefOr[String] = js.native
  /** The ID of the menu item that was clicked. */
  var menuItemId: Double | String = js.native
  /** An array of keyboard modifiers that were held while the menu item was clicked. */
  var modifiers: js.Array[OnClickDataModifiers] = js.native
  /**
    * The URL of the page where the menu item was clicked. This property is not set if the click occured in a
    * context where there is no current page, such as in a launcher context menu.
    */
  var pageUrl: js.UndefOr[String] = js.native
  /** The parent ID, if any, for the item clicked. */
  var parentMenuItemId: js.UndefOr[Double | String] = js.native
  /** The text for the context selection, if any. */
  var selectionText: js.UndefOr[String] = js.native
  /** Will be present for elements with a 'src' URL. */
  var srcUrl: js.UndefOr[String] = js.native
  /**
    * An identifier of the clicked element, if any. Use menus.getTargetElement in the page to find the
    * corresponding element.
    */
  var targetElementId: js.UndefOr[Double] = js.native
  /** The type of view where the menu is clicked. May be unset if the menu is not associated with a view. */
  var viewType: js.UndefOr[ViewType] = js.native
  /** A flag indicating the state of a checkbox or radio item before it was clicked. */
  var wasChecked: js.UndefOr[Boolean] = js.native
}

object OnClickData {
  @scala.inline
  def apply(
    bookmarkId: String,
    editable: Boolean,
    menuItemId: Double | String,
    modifiers: js.Array[OnClickDataModifiers]
  ): OnClickData = {
    val __obj = js.Dynamic.literal(bookmarkId = bookmarkId.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuItemId = menuItemId.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBookmarkId(value: String): Self = this.set("bookmarkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemId(value: Double | String): Self = this.set("menuItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiersVarargs(value: OnClickDataModifiers*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[OnClickDataModifiers]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setFrameUrl(value: String): Self = this.set("frameUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameUrl: Self = this.set("frameUrl", js.undefined)
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    @scala.inline
    def setLinkUrl(value: String): Self = this.set("linkUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkUrl: Self = this.set("linkUrl", js.undefined)
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setParentMenuItemId(value: Double | String): Self = this.set("parentMenuItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentMenuItemId: Self = this.set("parentMenuItemId", js.undefined)
    @scala.inline
    def setSelectionText(value: String): Self = this.set("selectionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionText: Self = this.set("selectionText", js.undefined)
    @scala.inline
    def setSrcUrl(value: String): Self = this.set("srcUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcUrl: Self = this.set("srcUrl", js.undefined)
    @scala.inline
    def setTargetElementId(value: Double): Self = this.set("targetElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElementId: Self = this.set("targetElementId", js.undefined)
    @scala.inline
    def setViewType(value: ViewType): Self = this.set("viewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
    @scala.inline
    def setWasChecked(value: Boolean): Self = this.set("wasChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasChecked: Self = this.set("wasChecked", js.undefined)
  }
  
}

