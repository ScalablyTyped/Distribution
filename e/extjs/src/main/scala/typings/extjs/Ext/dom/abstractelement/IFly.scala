package typings.extjs.Ext.dom.abstractelement

import typings.extjs.Ext.dom.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFly extends IElement {
  /** [Property] (Boolean) */
  var isFly: js.UndefOr[Boolean] = js.native
}

object IFly {
  @scala.inline
  def apply(): IFly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFly]
  }
  @scala.inline
  implicit class IFlyOps[Self <: IFly] (val x: Self) extends AnyVal {
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
    def setIsFly(value: Boolean): Self = this.set("isFly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFly: Self = this.set("isFly", js.undefined)
  }
  
}

