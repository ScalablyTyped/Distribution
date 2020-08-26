package typings.extjs.Ext.draw

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent
  extends typings.extjs.Ext.IComponent {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String[]) */
  var enginePriority: js.UndefOr[Array] = js.native
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[Array] = js.native
  /** [Property] (Ext.draw.Surface) */
  var surface: js.UndefOr[ISurface] = js.native
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.native
}

object IComponent {
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
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
    def setAutoSize(value: Boolean): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    @scala.inline
    def setEnginePriority(value: Array): Self = this.set("enginePriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnginePriority: Self = this.set("enginePriority", js.undefined)
    @scala.inline
    def setGradients(value: Array): Self = this.set("gradients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradients: Self = this.set("gradients", js.undefined)
    @scala.inline
    def setItems(value: Array): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSurface(value: ISurface): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
    @scala.inline
    def setViewBox(value: Boolean): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
  }
  
}

