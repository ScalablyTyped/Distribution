package typings.draggabilly.mod

import typings.draggabilly.draggabillyStrings.x
import typings.draggabilly.draggabillyStrings.y
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggabillyOptions extends js.Object {
  var axis: js.UndefOr[x | y] = js.native
  var containment: js.UndefOr[Element | String | Boolean] = js.native
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var handle: js.UndefOr[String] = js.native
}

object DraggabillyOptions {
  @scala.inline
  def apply(): DraggabillyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggabillyOptions]
  }
  @scala.inline
  implicit class DraggabillyOptionsOps[Self <: DraggabillyOptions] (val x: Self) extends AnyVal {
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
    def setAxis(value: typings.draggabilly.draggabillyStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setContainment(value: Element | String | Boolean): Self = this.set("containment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    @scala.inline
    def setGrid(value: js.Tuple2[Double, Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
  }
  
}

