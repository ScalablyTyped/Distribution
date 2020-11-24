package typings.firebaseAnalytics.getConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppFields extends js.Object {
  
  var apiKey: String = js.native
  
  var appId: String = js.native
  
  var measurementId: js.UndefOr[String] = js.native
}
object AppFields {
  
  @scala.inline
  def apply(apiKey: String, appId: String): AppFields = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppFields]
  }
  
  @scala.inline
  implicit class AppFieldsOps[Self <: AppFields] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementId(value: String): Self = this.set("measurementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementId: Self = this.set("measurementId", js.undefined)
  }
}
