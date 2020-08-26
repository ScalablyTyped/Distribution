package typings.extjs.Ext.panel

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITool extends IComponent {
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var isTool: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the type of the tool
    * @param type String The new type. See the type config.
    * @returns Ext.panel.Tool this
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.Component) */
  var toolOwner: js.UndefOr[IComponent] = js.native
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}

object ITool {
  @scala.inline
  def apply(): ITool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITool]
  }
  @scala.inline
  implicit class IToolOps[Self <: ITool] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setIsTool(value: Boolean): Self = this.set("isTool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTool: Self = this.set("isTool", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetType(value: /* type */ js.UndefOr[String] => ITool): Self = this.set("setType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetType: Self = this.set("setType", js.undefined)
    @scala.inline
    def setStopEvent(value: Boolean): Self = this.set("stopEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopEvent: Self = this.set("stopEvent", js.undefined)
    @scala.inline
    def setToolOwner(value: IComponent): Self = this.set("toolOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolOwner: Self = this.set("toolOwner", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipType(value: String): Self = this.set("tooltipType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipType: Self = this.set("tooltipType", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

