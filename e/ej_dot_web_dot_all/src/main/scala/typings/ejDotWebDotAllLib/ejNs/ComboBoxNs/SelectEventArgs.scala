package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectEventArgs extends js.Object {
  /** Li element of the selected item.
               */
  var Item: js.UndefOr[js.Any] = js.undefined
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Event argument.
               */
  var e: js.UndefOr[js.Any] = js.undefined
  /** value of the interaction
               */
  var isInteracted: js.UndefOr[scala.Boolean] = js.undefined
  /** Data object of the selected item.
               */
  var itemData: js.UndefOr[Model] = js.undefined
  /** Instance of the combobox model object.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Text of the selected item.
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the combobox textbox.
               */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

