package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CuepointSettings extends js.Object {
  
  var cueType: js.UndefOr[String] = js.native
  
  var durationSecs: js.UndefOr[Double] = js.native
  
  var offsetTimeMs: js.UndefOr[String] = js.native
  
  var walltime: js.UndefOr[String] = js.native
}
object CuepointSettings {
  
  @scala.inline
  def apply(): CuepointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CuepointSettings]
  }
  
  @scala.inline
  implicit class CuepointSettingsOps[Self <: CuepointSettings] (val x: Self) extends AnyVal {
    
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
    def setCueType(value: String): Self = this.set("cueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCueType: Self = this.set("cueType", js.undefined)
    
    @scala.inline
    def setDurationSecs(value: Double): Self = this.set("durationSecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSecs: Self = this.set("durationSecs", js.undefined)
    
    @scala.inline
    def setOffsetTimeMs(value: String): Self = this.set("offsetTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetTimeMs: Self = this.set("offsetTimeMs", js.undefined)
    
    @scala.inline
    def setWalltime(value: String): Self = this.set("walltime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalltime: Self = this.set("walltime", js.undefined)
  }
}
