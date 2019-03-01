package typings
package getDashNodeDashDimensionsLib.getDashNodeDashDimensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDimensionsOptions extends js.Object {
  @JSName("clone")
  var clone_FNodeDimensionsOptions: js.UndefOr[scala.Boolean] = js.undefined
  var display: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object NodeDimensionsOptions {
  @scala.inline
  def apply(
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    display: java.lang.String = null,
    height: java.lang.String = null,
    margin: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): NodeDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (display != null) __obj.updateDynamic("display")(display)
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[NodeDimensionsOptions]
  }
}

