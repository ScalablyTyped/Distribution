package typings.extjs.Ext.form.field

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHidden extends IBase {
  /** [Method] Clear any invalid styles messages for this field  */
  @JSName("clearInvalid")
  var clearInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the height of the component
    * @returns Ext.Component this
    */
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the page XY position of the component
    * @returns Ext.Component this
    */
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the left and top of the component
    * @returns Ext.Component this
    */
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the width and height of this Component
    * @returns Ext.Component this
    */
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the width of the component
    * @returns Ext.Component this
    */
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[IComponent]] = js.native
}

object IHidden {
  @scala.inline
  def apply(): IHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHidden]
  }
  @scala.inline
  implicit class IHiddenOps[Self <: IHidden] (val x: Self) extends AnyVal {
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
    def setClearInvalid(value: () => Unit): Self = this.set("clearInvalid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearInvalid: Self = this.set("clearInvalid", js.undefined)
    @scala.inline
    def setMarkInvalid(value: () => Unit): Self = this.set("markInvalid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMarkInvalid: Self = this.set("markInvalid", js.undefined)
    @scala.inline
    def setSetHeight(value: () => IComponent): Self = this.set("setHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    @scala.inline
    def setSetPagePosition(value: () => IComponent): Self = this.set("setPagePosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetPagePosition: Self = this.set("setPagePosition", js.undefined)
    @scala.inline
    def setSetPosition(value: () => IComponent): Self = this.set("setPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetPosition: Self = this.set("setPosition", js.undefined)
    @scala.inline
    def setSetSize(value: () => IComponent): Self = this.set("setSize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    @scala.inline
    def setSetWidth(value: () => IComponent): Self = this.set("setWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
  }
  
}

