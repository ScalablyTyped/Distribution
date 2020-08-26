package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSize extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var idx: js.UndefOr[Double] = js.native
  var measure: js.UndefOr[MeasureObject] = js.native
  var tuple: js.UndefOr[js.Array[String]] = js.native
}

object RowSize {
  @scala.inline
  def apply(): RowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSize]
  }
  @scala.inline
  implicit class RowSizeOps[Self <: RowSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdx: Self = this.set("idx", js.undefined)
    @scala.inline
    def setMeasure(value: MeasureObject): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    @scala.inline
    def setTupleVarargs(value: String*): Self = this.set("tuple", js.Array(value :_*))
    @scala.inline
    def setTuple(value: js.Array[String]): Self = this.set("tuple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTuple: Self = this.set("tuple", js.undefined)
  }
  
}

