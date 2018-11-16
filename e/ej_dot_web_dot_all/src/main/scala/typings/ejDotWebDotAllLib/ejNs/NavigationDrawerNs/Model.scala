package typings
package ejDotWebDotAllLib.ejNs.NavigationDrawerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Event triggers after the AJAX content loaded completely.
               */
  var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the AJAX request failed.
               */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the NavigationDrawer control.
               * @Default {null}
               */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** Event triggers after the AJAX content loaded successfully.
               */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** Event triggers before the control gets closed.
               */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, scala.Unit]] = js.undefined
  /** Specifies the contentId for navigation drawer, where the AJAX content need to updated
               * @Default {null}
               */
  var contentId: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the root class for NavigationDrawer theme. This cssClass API helps to use custom skinning option for NavigationDrawer control. By defining the root class using this API, we
               * need to include this root class in CSS.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the Direction for the control. See Direction
               * @Default {left}
               */
  var direction: js.UndefOr[ejDotWebDotAllLib.ejNs.Direction | java.lang.String] = js.undefined
  /** Sets the listview to be enabled or not
               * @Default {false}
               */
  var enableListView: js.UndefOr[scala.Boolean] = js.undefined
  /** Navigation pane opened initially when isPaneOpen property is true.
               * @Default {false}
               */
  var isPaneOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the listview items as an array of object.
               * @Default {[]}
               */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets all the properties of listview to render in navigation drawer
               */
  var listViewSettings: js.UndefOr[js.Any] = js.undefined
  /** Event triggers when the control open.
               */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies position whether it is in fixed or relative to the page. See Position
               * @Default {normal}
               */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers when the Swipe happens.
               */
  var swipe: js.UndefOr[js.Function1[/* e */ SwipeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the targetId for navigation drawer
               */
  var targetId: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the rendering type of the control. See Type
               * @Default {overlay}
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the control
               * @Default {auto}
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

