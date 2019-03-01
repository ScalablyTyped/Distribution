package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomValueSpecifierEventArgs extends js.Object {
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** text of the combobox.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CustomValueSpecifierEventArgs {
  @scala.inline
  def apply(model: Model = null, text: java.lang.String = null, `type`: java.lang.String = null): CustomValueSpecifierEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomValueSpecifierEventArgs]
  }
}

