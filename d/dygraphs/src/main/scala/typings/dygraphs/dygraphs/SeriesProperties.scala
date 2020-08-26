package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesProperties extends js.Object {
  var axis: Double = js.native
  var color: String = js.native
  var column: Double = js.native
  var name: String = js.native
  var visible: Boolean = js.native
}

object SeriesProperties {
  @scala.inline
  def apply(axis: Double, color: String, column: Double, name: String, visible: Boolean): SeriesProperties = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesProperties]
  }
  @scala.inline
  implicit class SeriesPropertiesOps[Self <: SeriesProperties] (val x: Self) extends AnyVal {
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
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

