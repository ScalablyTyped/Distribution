package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends js.Object {
  var items: js.UndefOr[js.Array[_]] = js.native
  var rect: js.UndefOr[js.Array[Double]] = js.native
  var sum: js.UndefOr[Double] = js.native
}

object Rect {
  @scala.inline
  def apply(): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setRectVarargs(value: Double*): Self = this.set("rect", js.Array(value :_*))
    @scala.inline
    def setRect(value: js.Array[Double]): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
  
}

