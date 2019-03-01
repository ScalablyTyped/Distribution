package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseDownEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the index of current tile item
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** returns the tile model
    */
  var model: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current tile text
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

object MouseDownEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    model: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    `type`: js.UndefOr[scala.Boolean] = js.undefined
  ): MouseDownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(model)) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseDownEventArgs]
  }
}

