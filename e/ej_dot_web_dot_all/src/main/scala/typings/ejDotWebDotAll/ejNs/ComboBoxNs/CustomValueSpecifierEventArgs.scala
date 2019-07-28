package typings.ejDotWebDotAll.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomValueSpecifierEventArgs extends js.Object {
  /** Instance of the combobox model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.ComboBoxNs.Model] = js.undefined
  /** text of the combobox.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CustomValueSpecifierEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ejNs.ComboBoxNs.Model = null,
    text: String = null,
    `type`: String = null
  ): CustomValueSpecifierEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomValueSpecifierEventArgs]
  }
}

