package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends js.Object {
  /** Height of the Sparkline. Height can be specified in either pixel or percentage.
    * @Default {''}
    */
  var height: js.UndefOr[String] = js.native
  /** Width of the Sparkline. Width can be specified in either pixel or percentage.
    * @Default {''}
    */
  var width: js.UndefOr[String] = js.native
}

object Size {
  @scala.inline
  def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

