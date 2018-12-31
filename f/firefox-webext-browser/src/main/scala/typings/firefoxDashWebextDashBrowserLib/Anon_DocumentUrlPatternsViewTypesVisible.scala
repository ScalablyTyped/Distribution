package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentUrlPatternsViewTypesVisible extends js.Object {
  /**
    * The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio
    * item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies a command to issue for the context click. Currently supports internal commands
    * _execute_page_action, _execute_browser_action and _execute_sidebar_action.
    */
  var command: js.UndefOr[java.lang.String] = js.undefined
  /** List of contexts this menu item will appear in. Defaults to ['page'] if not specified. */
  var contexts: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.menusNs.ContextType]] = js.undefined
  /**
    * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This
    * applies to frames as well.) For details on the format of a pattern, see Match Patterns.
    */
  var documentUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether this context menu item is enabled or disabled. Defaults to true. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  /**
    * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this
    * extension.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead,
    * they should register a listener for `contextMenus.onClicked`.
    * @param info Information about the item clicked and the context where the click happened.
    * @param tab The details of the tab where the click took place. Note: this parameter only present for
    *     extensions.
    */
  var onclick: js.UndefOr[
    js.Function2[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.menusNs.OnClickData, 
      /* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab, 
      scala.Unit
    ]
  ] = js.undefined
  /** The ID of a parent menu item; this makes the item a child of a previously added item. */
  var parentId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and
    * the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The text to be displayed in the item; this is _required_ unless `type` is 'separator'. When the context is
    * 'selection', you can use `%s` within the string to show the selected text. For example, if this parameter's
    * value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the
    * selection is "Translate 'cool' to Pig Latin".
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The type of menu item. Defaults to 'normal' if not specified. */
  var `type`: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.menusNs.ItemType] = js.undefined
  /**
    * List of view types where the menu item will be shown. Defaults to any view, including those without a
    * viewType.
    */
  var viewTypes: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType]] = js.undefined
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

