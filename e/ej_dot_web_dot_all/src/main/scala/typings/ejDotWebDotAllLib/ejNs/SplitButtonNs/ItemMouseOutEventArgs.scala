package typings
package ejDotWebDotAllLib.ejNs.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMouseOutEventArgs extends js.Object {
  /** return the menu item id
    */
  var ID: js.UndefOr[java.lang.String] = js.undefined
  /** return the clicked menu item text
    */
  var Text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the split button model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ItemMouseOutEventArgs {
  @scala.inline
  def apply(
    ID: java.lang.String = null,
    Text: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    element: js.Any = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): ItemMouseOutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemMouseOutEventArgs]
  }
}

