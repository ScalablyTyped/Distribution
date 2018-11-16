package typings
package ejDotWebDotAllLib.ejNs.SliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TooltipChangeEventArgs extends js.Object {
  /** returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns slider id.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** returns true if event triggered by interaction else returns false.
               */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the slider model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns current handle number or index
               */
  var sliderIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the slider value.
               */
  var value: js.UndefOr[scala.Double] = js.undefined
}

