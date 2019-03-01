package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabSelectEventArgs extends js.Object {
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TabSelectEventArgs {
  @scala.inline
  def apply(
    activeHeader: js.Any = null,
    activeIndex: scala.Int | scala.Double = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    prevActiveHeader: js.Any = null,
    prevActiveIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): TabSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader)
    if (prevActiveIndex != null) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabSelectEventArgs]
  }
}

