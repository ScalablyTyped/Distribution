package typings.eggMultipart

import typings.eggMultipart.anon.CurrentDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleOptions extends js.Object {
  
  var cron: js.UndefOr[String] = js.native
  
  var cronOptions: js.UndefOr[CurrentDate] = js.native
  
  var disable: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[js.Array[String]] = js.native
  
  var immediate: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double | String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ScheduleOptions {
  
  @scala.inline
  def apply(): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleOptions]
  }
  
  @scala.inline
  implicit class ScheduleOptionsOps[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
    
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
    def setCron(value: String): Self = this.set("cron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCron: Self = this.set("cron", js.undefined)
    
    @scala.inline
    def setCronOptions(value: CurrentDate): Self = this.set("cronOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCronOptions: Self = this.set("cronOptions", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    
    @scala.inline
    def setInterval(value: Double | String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
