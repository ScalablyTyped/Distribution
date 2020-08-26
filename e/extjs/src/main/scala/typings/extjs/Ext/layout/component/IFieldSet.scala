package typings.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldSet extends IBody {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IFieldSet: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
}

object IFieldSet {
  @scala.inline
  def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  @scala.inline
  implicit class IFieldSetOps[Self <: IFieldSet] (val x: Self) extends AnyVal {
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
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
  }
  
}

