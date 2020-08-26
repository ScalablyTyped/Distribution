package typings.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoundList extends IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Validates item is in the proper place in the dom  */
  @JSName("isValidParent")
  var isValidParent_IBoundList: js.UndefOr[js.Function0[Unit]] = js.native
}

object IBoundList {
  @scala.inline
  def apply(): IBoundList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundList]
  }
  @scala.inline
  implicit class IBoundListOps[Self <: IBoundList] (val x: Self) extends AnyVal {
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
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginLayout: Self = this.set("beginLayout", js.undefined)
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
    @scala.inline
    def setIsValidParent(value: () => Unit): Self = this.set("isValidParent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValidParent: Self = this.set("isValidParent", js.undefined)
  }
  
}

