package typings
package ejDotWebDotAllLib.ejNs.RadialMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** To show the Radial in initial render.
    */
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Renders the back button Image for Radial using class.
    */
  var backImageClass: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers when we click an item.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the menu is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Sets the root class for RadialMenu theme. This cssClass API helps to use custom skinning option for RadialMenu control. By defining the root class using this API, we need to
    * include this root class in CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** To enable Animation for Radial Menu.
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Renders the Image for Radial using Class.
    */
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the items of radial menu
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  /** Event triggers when the menu is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** To set radial render position.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** Specifies the radius of radial menu
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** To show the Radial while clicking given target element.
    */
  var targetElementId: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    backImageClass: java.lang.String = null,
    click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    close: js.Function1[/* e */ CloseEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    imageClass: java.lang.String = null,
    items: js.Array[Item] = null,
    open: js.Function1[/* e */ OpenEventArgs, scala.Unit] = null,
    position: js.Any = null,
    radius: scala.Int | scala.Double = null,
    targetElementId: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (backImageClass != null) __obj.updateDynamic("backImageClass")(backImageClass)
    if (click != null) __obj.updateDynamic("click")(click)
    if (close != null) __obj.updateDynamic("close")(close)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (items != null) __obj.updateDynamic("items")(items)
    if (open != null) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (targetElementId != null) __obj.updateDynamic("targetElementId")(targetElementId)
    __obj.asInstanceOf[Model]
  }
}

