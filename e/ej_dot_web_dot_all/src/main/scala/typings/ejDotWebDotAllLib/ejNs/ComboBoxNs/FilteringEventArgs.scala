package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilteringEventArgs extends js.Object {
  /** Instance of the combobox model object.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** text of the combobox.
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Function used to update the filtering value.
               */
  var updateData: js.UndefOr[js.Any] = js.undefined
}

