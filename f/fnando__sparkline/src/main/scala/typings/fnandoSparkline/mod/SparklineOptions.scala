package typings.fnandoSparkline.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptions
  extends SparklineNonNativeOptions[js.Any] {
  /**
    * Set the cursor width. The default is 2.
    */
  var cursorwidth: js.UndefOr[Double] = js.undefined
  /**
    * When true, this enables the interactive mode. You don't have to set this option if you're providing a onmousemove callback.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * By setting this callback function, you'll enable the interactive mode (unless you set options.interactive to false).
    */
  var onmousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * This callback function is called every time the mouse leaves the SVG area. You can use it to hide things like tooltips.
    */
  var onmouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Set the spot radius. The default is 2.
    */
  var spotRadius: js.UndefOr[Double] = js.undefined
}

object SparklineOptions {
  @scala.inline
  def apply(
    cursorwidth: js.UndefOr[Double] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    onmousemove: /* event */ MouseEvent => Unit = null,
    onmouseout: /* event */ MouseEvent => Unit = null,
    spotRadius: js.UndefOr[Double] = js.undefined
  ): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cursorwidth)) __obj.updateDynamic("cursorwidth")(cursorwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1(onmousemove))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (!js.isUndefined(spotRadius)) __obj.updateDynamic("spotRadius")(spotRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineOptions]
  }
}

