package typings.extjs.Ext.form

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldAncestor extends IBase {
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Fired when the error message of any field within the container changes
    * @param field Ext.form.Labelable The sub-field whose active error changed
    * @param error String The new active error message
    */
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Fired when the validity of any field within the container changes
    * @param field Ext.form.field.Field The sub-field whose validity changed
    * @param valid Boolean The new validity state
    */
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[typings.extjs.Ext.form.field.IField], 
      /* valid */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
}

object IFieldAncestor {
  @scala.inline
  def apply(): IFieldAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldAncestor]
  }
  @scala.inline
  implicit class IFieldAncestorOps[Self <: IFieldAncestor] (val x: Self) extends AnyVal {
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
    def setFieldDefaults(value: js.Any): Self = this.set("fieldDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDefaults: Self = this.set("fieldDefaults", js.undefined)
    @scala.inline
    def setInitFieldAncestor(value: () => Unit): Self = this.set("initFieldAncestor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitFieldAncestor: Self = this.set("initFieldAncestor", js.undefined)
    @scala.inline
    def setOnFieldErrorChange(value: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Unit): Self = this.set("onFieldErrorChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldErrorChange: Self = this.set("onFieldErrorChange", js.undefined)
    @scala.inline
    def setOnFieldValidityChange(
      value: (/* field */ js.UndefOr[typings.extjs.Ext.form.field.IField], /* valid */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("onFieldValidityChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldValidityChange: Self = this.set("onFieldValidityChange", js.undefined)
  }
  
}

