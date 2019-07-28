package typings.ejDotWebDotAll.ejNs.MenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowCloseEventArgs extends js.Object {
  /** if the event should be cancelled ; otherwise ,false
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the event object
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns the menu model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.MenuNs.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OverflowCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    e: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.MenuNs.Model = null,
    `type`: String = null
  ): OverflowCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (e != null) __obj.updateDynamic("e")(e)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OverflowCloseEventArgs]
  }
}

