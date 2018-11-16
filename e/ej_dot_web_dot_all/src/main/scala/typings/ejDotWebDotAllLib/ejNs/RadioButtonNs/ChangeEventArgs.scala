package typings
package ejDotWebDotAllLib.ejNs.RadioButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns true if element is checked, otherwise returns false
               */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** returns true if change event triggered by interaction, otherwise returns false
               */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the RadioButton model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

