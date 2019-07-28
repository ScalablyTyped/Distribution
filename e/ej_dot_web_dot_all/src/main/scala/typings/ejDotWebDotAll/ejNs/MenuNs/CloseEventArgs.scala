package typings.ejDotWebDotAll.ejNs.MenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventArgs extends js.Object {
  /** returns the menu model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.MenuNs.Model] = js.undefined
  /** returns the target element
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CloseEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ejNs.MenuNs.Model = null,
    target: js.Any = null,
    `type`: String = null
  ): CloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CloseEventArgs]
  }
}

