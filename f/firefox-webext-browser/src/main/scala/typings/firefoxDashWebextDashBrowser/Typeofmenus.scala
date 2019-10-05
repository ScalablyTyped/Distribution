package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.menus.OnClickData
import typings.firefoxDashWebextDashBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmenus extends js.Object {
  /* menus properties */
  /**
    * The maximum number of top level extension items that can be added to an extension action context menu. Any items
    * beyond this limit will be ignored.
    */
  val ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  /* menus events */
  /**
    * Fired when a context menu item is clicked.
    * @param info Information about the item clicked and the context where the click happened.
    * @param [tab] The details of the tab where the click took place. If the click did not take place in a tab, this
    *     parameter will be missing.
    */
  val onClicked: WebExtEvent[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]] = js.native
  /** Fired when a menu is hidden. This event is only fired if onShown has fired before. */
  val onHidden: WebExtEvent[js.Function0[Unit]] = js.native
  /**
    * Fired when a menu is shown. The extension can add, modify or remove menu items and call menus.refresh() to
    * update the menu.
    * @param info Information about the context of the menu action and the created menu items. For more information
    *     about each property, see OnClickData. The following properties are only set if the extension has host
    *     permissions for the given context: linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
    * @param tab The details of the tab where the menu was opened.
    */
  val onShown: WebExtEvent[js.Function2[/* info */ Anon_ContextsEditable, /* tab */ Tab, Unit]] = js.native
  /* menus functions */
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the
    * creation callback fires (the details will be in `runtime.lastError`).
    * @param [callback] Called when the item has been created in the browser. If there were any problems creating the
    *     item, details will be available in `runtime.lastError`.
    * @returns The ID of the newly created item.
    */
  def create(createProperties: Anon_CheckedCommand): Double | String = js.native
  def create(createProperties: Anon_CheckedCommand, callback: js.Function0[Unit]): Double | String = js.native
  /**
    * Retrieve the element that was associated with a recent contextmenu event.
    * @param targetElementId The identifier of the clicked element, available as info.targetElementId in the
    *     menus.onShown, onClicked or onclick event.
    */
  def getTargetElement(targetElementId: Double): js.Object | Unit = js.native
  /**
    * Show the matching menu items from this extension instead of the default menu. This should be called during a
    * 'contextmenu' DOM event handler, and only applies to the menu that opens after this event.
    */
  def overrideContext(contextOptions: Anon_BookmarkIdContext): Unit = js.native
  /**
    * Updates the extension items in the shown menu, including changes that have been made since the menu was shown.
    * Has no effect if the menu is hidden. Rebuilding a shown menu is an expensive operation, only invoke this method
    * when necessary.
    */
  def refresh(): js.Promise[_] = js.native
  def remove(menuItemId: String): js.Promise[Unit] = js.native
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    */
  def remove(menuItemId: Double): js.Promise[Unit] = js.native
  /** Removes all context menu items added by this extension. */
  def removeAll(): js.Promise[Unit] = js.native
  def update(id: String, updateProperties: Anon_CheckedContextsDocumentUrlPatterns): js.Promise[Unit] = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    */
  def update(id: Double, updateProperties: Anon_CheckedContextsDocumentUrlPatterns): js.Promise[Unit] = js.native
}

