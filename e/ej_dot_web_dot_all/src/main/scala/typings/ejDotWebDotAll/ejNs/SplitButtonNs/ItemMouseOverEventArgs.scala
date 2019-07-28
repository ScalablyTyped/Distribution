package typings.ejDotWebDotAll.ejNs.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMouseOverEventArgs extends js.Object {
  /** return the menu item id
    */
  var ID: js.UndefOr[String] = js.undefined
  /** return the clicked menu item text
    */
  var Text: js.UndefOr[String] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the split button model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.SplitButtonNs.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ItemMouseOverEventArgs {
  @scala.inline
  def apply(
    ID: String = null,
    Text: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.SplitButtonNs.Model = null,
    `type`: String = null
  ): ItemMouseOverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemMouseOverEventArgs]
  }
}

