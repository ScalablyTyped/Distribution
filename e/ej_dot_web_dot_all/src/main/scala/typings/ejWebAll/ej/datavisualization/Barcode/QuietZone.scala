package typings.ejWebAll.ej.datavisualization.Barcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuietZone extends js.Object {
  /** Specifies the quiet zone around the Barcode.
    */
  var all: js.UndefOr[Double] = js.native
  /** Specifies the bottom quiet zone of the Barcode.
    */
  var bottom: js.UndefOr[Double] = js.native
  /** Specifies the left quiet zone of the Barcode.
    */
  var left: js.UndefOr[Double] = js.native
  /** Specifies the right quiet zone of the Barcode.
    */
  var right: js.UndefOr[Double] = js.native
  /** Specifies the top quiet zone of the Barcode.
    */
  var top: js.UndefOr[Double] = js.native
}

object QuietZone {
  @scala.inline
  def apply(): QuietZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuietZone]
  }
  @scala.inline
  implicit class QuietZoneOps[Self <: QuietZone] (val x: Self) extends AnyVal {
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
    def setAll(value: Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

