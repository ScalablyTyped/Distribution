package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxGroup extends IContainer {
  /** [Config Option] (Boolean) */
  var autoFlex: js.UndefOr[Boolean] = js.native
  /** [Method] Just wait for the child items to all lay themselves out in the width we are configured to make available to them
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ICheckboxGroup: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  /** [Method] Always valid  */
  @JSName("isValidParent")
  var isValidParent_ICheckboxGroup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Iterates over all passed items ensuring they are rendered
    * @param items Object
    */
  @JSName("renderItems")
  var renderItems_ICheckboxGroup: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICheckboxGroup {
  @scala.inline
  def apply(): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxGroup]
  }
  @scala.inline
  implicit class ICheckboxGroupOps[Self <: ICheckboxGroup] (val x: Self) extends AnyVal {
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
    def setAutoFlex(value: Boolean): Self = this.set("autoFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFlex: Self = this.set("autoFlex", js.undefined)
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
    @scala.inline
    def setIsValidParent(value: () => Unit): Self = this.set("isValidParent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValidParent: Self = this.set("isValidParent", js.undefined)
    @scala.inline
    def setRenderItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = this.set("renderItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderItems: Self = this.set("renderItems", js.undefined)
  }
  
}

