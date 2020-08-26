package typings.fnandoSparkline.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineOptions
  extends SparklineNonNativeOptions[js.Any] {
  /**
    * Set the cursor width. The default is 2.
    */
  var cursorwidth: js.UndefOr[Double] = js.native
  /**
    * When true, this enables the interactive mode. You don't have to set this option if you're providing a onmousemove callback.
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * By setting this callback function, you'll enable the interactive mode (unless you set options.interactive to false).
    */
  var onmousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * This callback function is called every time the mouse leaves the SVG area. You can use it to hide things like tooltips.
    */
  var onmouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Set the spot radius. The default is 2.
    */
  var spotRadius: js.UndefOr[Double] = js.native
}

object SparklineOptions {
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  @scala.inline
  implicit class SparklineOptionsOps[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursorwidth(value: Double): Self = this.set("cursorwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorwidth: Self = this.set("cursorwidth", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setOnmousemove(value: /* event */ MouseEvent => Unit): Self = this.set("onmousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmouseout(value: /* event */ MouseEvent => Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setSpotRadius(value: Double): Self = this.set("spotRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotRadius: Self = this.set("spotRadius", js.undefined)
  }
  
}

