package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawIndicatorEventArgs extends js.Object {
  /** for canceling the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns an object to customize bullet graph indicator text and symbol before rendering it.
    */
  var indicatorSettings: js.UndefOr[js.Any] = js.undefined
  /** returns the object of bullet graph.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the type of event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DrawIndicatorEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    indicatorSettings: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): DrawIndicatorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (indicatorSettings != null) __obj.updateDynamic("indicatorSettings")(indicatorSettings)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawIndicatorEventArgs]
  }
}

