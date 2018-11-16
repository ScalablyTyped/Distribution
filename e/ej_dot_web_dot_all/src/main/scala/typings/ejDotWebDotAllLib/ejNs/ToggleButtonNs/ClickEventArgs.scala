package typings
package ejDotWebDotAllLib.ejNs.ToggleButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClickEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** return the toggle button checked state
               */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the toggle button model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** return the toggle button state
               */
  var status: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

