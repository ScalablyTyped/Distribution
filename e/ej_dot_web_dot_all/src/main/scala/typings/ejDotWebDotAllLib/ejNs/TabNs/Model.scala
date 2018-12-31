package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered before AJAX content has been loaded.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, scala.Unit]] = js.undefined
  /** Triggered if error occurs in AJAX request.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** Triggered after AJAX content load action.
    */
  var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, scala.Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the Tab control.
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** Triggered after a tab item activated.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** Tab items interaction with keyboard keys, like headers active navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered before a tab item activated.
    */
  var beforeActive: js.UndefOr[js.Function1[/* e */ BeforeActiveEventArgs, scala.Unit]] = js.undefined
  /** Triggered before a tab item remove.
    */
  var beforeItemRemove: js.UndefOr[js.Function1[/* e */ BeforeItemRemoveEventArgs, scala.Unit]] = js.undefined
  /** Allow to collapsing the active item, while click on the active header.
    * @Default {false}
    */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered before a tab item Create.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Set the root class for Tab theme. This cssClass API helps to use custom skinning option for Tab control.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered before a tab item destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Disables the given tab headers and content panels.
    * @Default {[]}
    */
  var disabledItemIndex: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Specifies the animation behavior of the tab.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Save current model value to browser cookies for state maintains. While refresh the Tab control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Display Right to Left direction for headers and panels text of tab.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify to enable scrolling for Tab header.
    * @Default {false}
    */
  var enableTabScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** When this property is set to false, it disables the tab control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the given tab headers and content panels.
    * @Default {[]}
    */
  var enabledItemIndex: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** The event API to bind the action for active the tab items.
    * @Default {click}
    */
  var events: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the position of Tab header as top, bottom, left or right. See below to get available Position
    * @Default {top}
    */
  var headerPosition: js.UndefOr[java.lang.String | Position] = js.undefined
  /** Set the height of the tab header element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var headerSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Height set the outer panel element. Default this property value is null, so height take content height.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Adjust the content panel height for given option (content, auto and fill), by default panels height adjust based on the content.See below to get available HeightAdjustMode
    * @Default {content}
    */
  var heightAdjustMode: js.UndefOr[java.lang.String | HeightAdjustMode] = js.undefined
  /** Specifies to hide a pane of Tab control.
    * @Default {[]}
    */
  var hiddenItemIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the HTML Attributes of the Tab.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** The idPrefix property appends the given string on the added tab item idâ€™s in runtime.
    * @Default {ej-tab-}
    */
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after a tab item activated.
    */
  var itemActive: js.UndefOr[js.Function1[/* e */ ItemActiveEventArgs, scala.Unit]] = js.undefined
  /** Triggered after new tab item add
    */
  var itemAdd: js.UndefOr[js.Function1[/* e */ ItemAddEventArgs, scala.Unit]] = js.undefined
  /** Triggered after tab item removed.
    */
  var itemRemove: js.UndefOr[js.Function1[/* e */ ItemRemoveEventArgs, scala.Unit]] = js.undefined
  /** Specifies the Tab header in active for given index value.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[scala.Double] = js.undefined
  /** Display the close button for each tab items. While clicking on the close icon, particular tab item will be removed.
    * @Default {false}
    */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the Reload button for each tab items.
    * @Default {false}
    */
  var showReloadIcon: js.UndefOr[scala.Boolean] = js.undefined
  /** Tab panels and headers to be displayed in rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the width for outer panel element, if not itâ€™s take parent width.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

