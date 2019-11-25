package typings.flot.jquery.flot

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait legendOptions extends js.Object {
                  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
         //null or color
  var backgroundOpacity: js.UndefOr[Double] = js.undefined
    // between 0 and 1
  var container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
   //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[js.Any] = js.undefined
  var labelFormatter: js.UndefOr[js.Function2[/* label */ String, /* series */ js.Any, String]] = js.undefined
             //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[js.Any] = js.undefined
     //color
  var noColumns: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
           // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[js.Any] = js.undefined
}

object legendOptions {
  @scala.inline
  def apply(
    backgroundColor: js.Any = null,
    backgroundOpacity: Int | Double = null,
    container: JQuery[HTMLElement] = null,
    labelBoxBorderColor: js.Any = null,
    labelFormatter: (/* label */ String, /* series */ js.Any) => String = null,
    margin: js.Any = null,
    noColumns: Int | Double = null,
    position: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    sorted: js.Any = null
  ): legendOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundOpacity != null) __obj.updateDynamic("backgroundOpacity")(backgroundOpacity.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (labelBoxBorderColor != null) __obj.updateDynamic("labelBoxBorderColor")(labelBoxBorderColor.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction2(labelFormatter))
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (noColumns != null) __obj.updateDynamic("noColumns")(noColumns.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (sorted != null) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[legendOptions]
  }
}

