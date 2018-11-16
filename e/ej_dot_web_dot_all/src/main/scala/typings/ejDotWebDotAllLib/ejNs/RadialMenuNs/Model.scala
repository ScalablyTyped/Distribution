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

