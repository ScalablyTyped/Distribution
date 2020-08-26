package typings.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuto extends IComponent {
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var setHeightInDom: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var setWidthInDom: js.UndefOr[Boolean] = js.native
}

object IAuto {
  @scala.inline
  def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  @scala.inline
  implicit class IAutoOps[Self <: IAuto] (val x: Self) extends AnyVal {
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
    def setSetHeightInDom(value: Boolean): Self = this.set("setHeightInDom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetHeightInDom: Self = this.set("setHeightInDom", js.undefined)
    @scala.inline
    def setSetWidthInDom(value: Boolean): Self = this.set("setWidthInDom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetWidthInDom: Self = this.set("setWidthInDom", js.undefined)
  }
  
}

