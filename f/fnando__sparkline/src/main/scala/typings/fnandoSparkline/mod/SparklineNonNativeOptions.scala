package typings.fnandoSparkline.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fnandoSparkline.mod.SparklineOptions
  - typings.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]
*/
trait SparklineNonNativeOptions[TEntry] extends js.Object

object SparklineNonNativeOptions {
  @scala.inline
  def SparklineOptions[TEntry](
    cursorwidth: js.UndefOr[Double] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    onmousemove: /* event */ MouseEvent => Unit = null,
    onmouseout: /* event */ MouseEvent => Unit = null,
    spotRadius: js.UndefOr[Double] = js.undefined
  ): SparklineNonNativeOptions[TEntry] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cursorwidth)) __obj.updateDynamic("cursorwidth")(cursorwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1(onmousemove))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (!js.isUndefined(spotRadius)) __obj.updateDynamic("spotRadius")(spotRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  }
  @scala.inline
  def SparklineOptionsFetch[TEntry](fetch: TEntry => Double): SparklineNonNativeOptions[TEntry] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  }
}

