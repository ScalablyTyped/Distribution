package typings.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBody extends IAuto {
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IBody: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
}

object IBody {
  @scala.inline
  def apply(): IBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBody]
  }
  @scala.inline
  implicit class IBodyOps[Self <: IBody] (val x: Self) extends AnyVal {
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
  }
  
}

