package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsConstraints extends js.Object {
  /** It is used to specify the maximum amount of card in particular column cell or swimlane cell can hold.
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.native
  /** It is used to specify the minimum amount of card in particular column cell or swimlane cell can hold.
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.native
  /** It is used to specify the type of constraints as column or swimlane.
    * @Default {null}
    */
  var `type`: js.UndefOr[String] = js.native
}

object ColumnsConstraints {
  @scala.inline
  def apply(): ColumnsConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsConstraints]
  }
  @scala.inline
  implicit class ColumnsConstraintsOps[Self <: ColumnsConstraints] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

