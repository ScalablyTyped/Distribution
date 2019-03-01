package typings
package ejDotWebDotAllLib.ejNs.MenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseoutEventArgs extends js.Object {
  /** returns clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the event
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the menu model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns clicked menu item text
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MouseoutEventArgs {
  @scala.inline
  def apply(
    element: js.Any = null,
    event: js.Any = null,
    model: Model = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): MouseoutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseoutEventArgs]
  }
}

