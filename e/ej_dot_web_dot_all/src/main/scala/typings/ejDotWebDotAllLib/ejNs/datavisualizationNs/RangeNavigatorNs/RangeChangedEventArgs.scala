package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeChangedEventArgs extends js.Object {
  /** parameters from range navigator
    */
  var Data: js.UndefOr[js.Any] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the range navigator model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RangeChangedEventArgs {
  @scala.inline
  def apply(
    Data: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): RangeChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RangeChangedEventArgs]
  }
}

