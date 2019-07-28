package typings.getDashNodeDashDimensions.getDashNodeDashDimensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDimensionsOptions extends js.Object {
  @JSName("clone")
  var clone_FNodeDimensionsOptions: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object NodeDimensionsOptions {
  @scala.inline
  def apply(
    clone: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    height: String = null,
    margin: js.UndefOr[Boolean] = js.undefined,
    width: String = null
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

