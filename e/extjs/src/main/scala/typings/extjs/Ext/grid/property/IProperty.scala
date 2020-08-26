package typings.extjs.Ext.grid.property

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProperty extends IModel {
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IProperty: js.UndefOr[IMixedCollection] = js.native
}

object IProperty {
  @scala.inline
  def apply(): IProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProperty]
  }
  @scala.inline
  implicit class IPropertyOps[Self <: IProperty] (val x: Self) extends AnyVal {
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
    def setFields(value: IMixedCollection): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

