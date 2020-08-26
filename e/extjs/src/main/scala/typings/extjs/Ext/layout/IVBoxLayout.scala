package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVBoxLayout extends IBox {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Config Option] ("round"/"floor"/"ceil") */
  var alignRoundingMethod: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var constrainAlign: js.UndefOr[Boolean] = js.native
}

object IVBoxLayout {
  @scala.inline
  def apply(): IVBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVBoxLayout]
  }
  @scala.inline
  implicit class IVBoxLayoutOps[Self <: IVBoxLayout] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignRoundingMethod(value: js.Any): Self = this.set("alignRoundingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignRoundingMethod: Self = this.set("alignRoundingMethod", js.undefined)
    @scala.inline
    def setConstrainAlign(value: Boolean): Self = this.set("constrainAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainAlign: Self = this.set("constrainAlign", js.undefined)
  }
  
}

