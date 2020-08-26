package typings.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressBar extends IAuto {
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IProgressBar: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
}

object IProgressBar {
  @scala.inline
  def apply(): IProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressBar]
  }
  @scala.inline
  implicit class IProgressBarOps[Self <: IProgressBar] (val x: Self) extends AnyVal {
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

