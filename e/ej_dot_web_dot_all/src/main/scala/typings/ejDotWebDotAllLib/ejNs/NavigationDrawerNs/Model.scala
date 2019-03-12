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

object Model {
  @scala.inline
  def apply(
    ajaxComplete: /* e */ AjaxCompleteEventArgs => scala.Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => scala.Unit = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => scala.Unit = null,
    beforeClose: /* e */ BeforeCloseEventArgs => scala.Unit = null,
    contentId: java.lang.String = null,
    cssClass: java.lang.String = null,
    direction: ejDotWebDotAllLib.ejNs.Direction | java.lang.String = null,
    enableListView: js.UndefOr[scala.Boolean] = js.undefined,
    isPaneOpen: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[_] = null,
    listViewSettings: js.Any = null,
    open: /* e */ OpenEventArgs => scala.Unit = null,
    position: java.lang.String = null,
    swipe: /* e */ SwipeEventArgs => scala.Unit = null,
    targetId: java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxComplete != null) __obj.updateDynamic("ajaxComplete")(js.Any.fromFunction1(ajaxComplete))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enableListView)) __obj.updateDynamic("enableListView")(enableListView)
    if (!js.isUndefined(isPaneOpen)) __obj.updateDynamic("isPaneOpen")(isPaneOpen)
    if (items != null) __obj.updateDynamic("items")(items)
    if (listViewSettings != null) __obj.updateDynamic("listViewSettings")(listViewSettings)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (position != null) __obj.updateDynamic("position")(position)
    if (swipe != null) __obj.updateDynamic("swipe")(js.Any.fromFunction1(swipe))
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

