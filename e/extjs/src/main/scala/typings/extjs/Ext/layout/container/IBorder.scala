package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBorder extends IContainer {
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IBorder: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBorder: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  /** [Config Option] (Number/String/Object) */
  var padding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var regionWeights: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var split: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var splitterResize: js.UndefOr[Boolean] = js.native
}

object IBorder {
  @scala.inline
  def apply(): IBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorder]
  }
  @scala.inline
  implicit class IBorderOps[Self <: IBorder] (val x: Self) extends AnyVal {
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
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRegionWeights(value: js.Any): Self = this.set("regionWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionWeights: Self = this.set("regionWeights", js.undefined)
    @scala.inline
    def setSplit(value: Boolean): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setSplitterResize(value: Boolean): Self = this.set("splitterResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitterResize: Self = this.set("splitterResize", js.undefined)
  }
  
}

