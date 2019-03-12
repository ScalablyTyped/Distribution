package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait legendOptions extends js.Object {
                  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
         //null or color
  var backgroundOpacity: js.UndefOr[scala.Double] = js.undefined
    // between 0 and 1
  var container: js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
   //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[js.Any] = js.undefined
  var labelFormatter: js.UndefOr[
    js.Function2[/* label */ java.lang.String, /* series */ js.Any, java.lang.String]
  ] = js.undefined
             //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[js.Any] = js.undefined
     //color
  var noColumns: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
           // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[js.Any] = js.undefined
}

object legendOptions {
  @scala.inline
  def apply(
    backgroundColor: js.Any = null,
    backgroundOpacity: scala.Int | scala.Double = null,
    container: jqueryLib.JQuery[stdLib.HTMLElement] = null,
    labelBoxBorderColor: js.Any = null,
    labelFormatter: (/* label */ java.lang.String, /* series */ js.Any) => java.lang.String = null,
    margin: js.Any = null,
    noColumns: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    sorted: js.Any = null
  ): legendOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundOpacity != null) __obj.updateDynamic("backgroundOpacity")(backgroundOpacity.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (labelBoxBorderColor != null) __obj.updateDynamic("labelBoxBorderColor")(labelBoxBorderColor)
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction2(labelFormatter))
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (noColumns != null) __obj.updateDynamic("noColumns")(noColumns.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (sorted != null) __obj.updateDynamic("sorted")(sorted)
    __obj.asInstanceOf[legendOptions]
  }
}

