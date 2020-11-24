package typings.fundamentalReact.timeMod

import typings.fundamentalReact.anon.Hour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeBaseProps extends js.Object {
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var format12Hours: js.UndefOr[Boolean] = js.native
  
  var showHour: js.UndefOr[Boolean] = js.native
  
  var showMinute: js.UndefOr[Boolean] = js.native
  
  var showSecond: js.UndefOr[Boolean] = js.native
  
  var spinners: js.UndefOr[Boolean] = js.native
  
  var time: js.UndefOr[Hour] = js.native
}
object TimeBaseProps {
  
  @scala.inline
  def apply(): TimeBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBaseProps]
  }
  
  @scala.inline
  implicit class TimeBasePropsOps[Self <: TimeBaseProps] (val x: Self) extends AnyVal {
    
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
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setFormat12Hours(value: Boolean): Self = this.set("format12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat12Hours: Self = this.set("format12Hours", js.undefined)
    
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    
    @scala.inline
    def setSpinners(value: Boolean): Self = this.set("spinners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinners: Self = this.set("spinners", js.undefined)
    
    @scala.inline
    def setTime(value: Hour): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
