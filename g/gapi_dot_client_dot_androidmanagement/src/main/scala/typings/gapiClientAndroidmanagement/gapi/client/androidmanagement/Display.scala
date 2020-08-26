package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  /** Display density expressed as dots-per-inch. */
  var density: js.UndefOr[Double] = js.native
  /** Unique display id. */
  var displayId: js.UndefOr[Double] = js.native
  /** Display height in pixels. */
  var height: js.UndefOr[Double] = js.native
  /** Name of the display. */
  var name: js.UndefOr[String] = js.native
  /** Refresh rate of the display in frames per second. */
  var refreshRate: js.UndefOr[Double] = js.native
  /** State of the display. */
  var state: js.UndefOr[String] = js.native
  /** Display width in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object Display {
  @scala.inline
  def apply(): Display = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Display]
  }
  @scala.inline
  implicit class DisplayOps[Self <: Display] (val x: Self) extends AnyVal {
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    @scala.inline
    def setDisplayId(value: Double): Self = this.set("displayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayId: Self = this.set("displayId", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRefreshRate(value: Double): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshRate: Self = this.set("refreshRate", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

