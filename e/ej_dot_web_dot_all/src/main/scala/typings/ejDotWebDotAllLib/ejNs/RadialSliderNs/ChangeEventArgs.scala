package typings
package ejDotWebDotAllLib.ejNs.RadialSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the Radialslider model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the initial value of Radial slider
               */
  var oldValue: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current value of the Radial slider
               */
  var value: js.UndefOr[scala.Double] = js.undefined
}

