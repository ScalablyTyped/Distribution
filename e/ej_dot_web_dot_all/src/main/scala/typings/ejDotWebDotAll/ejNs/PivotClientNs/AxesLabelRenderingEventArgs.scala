package typings.ejDotWebDotAll.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesLabelRenderingEventArgs extends js.Object {
  /** returns the Chart label information.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the model object bound with PivotClient control.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the current action of PivotClient control.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AxesLabelRenderingEventArgs {
  @scala.inline
  def apply(data: js.Any = null, model: js.Any = null, `type`: String = null): AxesLabelRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AxesLabelRenderingEventArgs]
  }
}

