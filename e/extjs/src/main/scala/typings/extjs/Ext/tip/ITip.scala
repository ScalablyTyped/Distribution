package typings.extjs.Ext.tip

import typings.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITip extends IPanel {
  /** [Config Option] (Boolean) */
  var constrainPosition: js.UndefOr[Boolean] = js.native
}

object ITip {
  @scala.inline
  def apply(): ITip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITip]
  }
  @scala.inline
  implicit class ITipOps[Self <: ITip] (val x: Self) extends AnyVal {
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
    def setConstrainPosition(value: Boolean): Self = this.set("constrainPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainPosition: Self = this.set("constrainPosition", js.undefined)
  }
  
}

