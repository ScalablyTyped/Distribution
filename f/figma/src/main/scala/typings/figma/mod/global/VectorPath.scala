package typings.figma.mod.global

import typings.figma.figmaStrings.NONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorPath extends js.Object {
  val data: String = js.native
  val windingRule: WindingRule | NONE = js.native
}

object VectorPath {
  @scala.inline
  def apply(data: String, windingRule: WindingRule | NONE): VectorPath = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorPath]
  }
  @scala.inline
  implicit class VectorPathOps[Self <: VectorPath] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindingRule(value: WindingRule | NONE): Self = this.set("windingRule", value.asInstanceOf[js.Any])
  }
  
}

