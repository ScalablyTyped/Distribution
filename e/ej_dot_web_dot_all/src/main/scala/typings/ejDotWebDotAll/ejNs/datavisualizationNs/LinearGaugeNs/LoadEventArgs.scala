package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the entire scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object LoadEventArgs {
  @scala.inline
  def apply(
    Model: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    `object`: js.Any = null,
    scaleElement: js.Any = null,
    `type`: js.Any = null
  ): LoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoadEventArgs]
  }
}

