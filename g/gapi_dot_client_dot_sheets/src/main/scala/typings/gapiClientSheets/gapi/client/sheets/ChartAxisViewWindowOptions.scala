package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisViewWindowOptions extends js.Object {
  /**
    * The maximum numeric value to be shown in this view window. If unset, will
    * automatically determine a maximum value that looks good for the data.
    */
  var viewWindowMax: js.UndefOr[Double] = js.native
  /**
    * The minimum numeric value to be shown in this view window. If unset, will
    * automatically determine a minimum value that looks good for the data.
    */
  var viewWindowMin: js.UndefOr[Double] = js.native
  /** The view window's mode. */
  var viewWindowMode: js.UndefOr[String] = js.native
}

object ChartAxisViewWindowOptions {
  @scala.inline
  def apply(): ChartAxisViewWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisViewWindowOptions]
  }
  @scala.inline
  implicit class ChartAxisViewWindowOptionsOps[Self <: ChartAxisViewWindowOptions] (val x: Self) extends AnyVal {
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
    def setViewWindowMax(value: Double): Self = this.set("viewWindowMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewWindowMax: Self = this.set("viewWindowMax", js.undefined)
    @scala.inline
    def setViewWindowMin(value: Double): Self = this.set("viewWindowMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewWindowMin: Self = this.set("viewWindowMin", js.undefined)
    @scala.inline
    def setViewWindowMode(value: String): Self = this.set("viewWindowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewWindowMode: Self = this.set("viewWindowMode", js.undefined)
  }
  
}

