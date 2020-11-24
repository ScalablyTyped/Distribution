package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalDynamicConfig extends js.Object {
  
  var appId: String = js.native
  
  var measurementId: String = js.native
}
object MinimalDynamicConfig {
  
  @scala.inline
  def apply(appId: String, measurementId: String): MinimalDynamicConfig = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], measurementId = measurementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalDynamicConfig]
  }
  
  @scala.inline
  implicit class MinimalDynamicConfigOps[Self <: MinimalDynamicConfig] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementId(value: String): Self = this.set("measurementId", value.asInstanceOf[js.Any])
  }
}
