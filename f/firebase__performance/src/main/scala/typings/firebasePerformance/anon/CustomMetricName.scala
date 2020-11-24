package typings.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMetricName extends js.Object {
  
  var customMetricName: String = js.native
}
object CustomMetricName {
  
  @scala.inline
  def apply(customMetricName: String): CustomMetricName = {
    val __obj = js.Dynamic.literal(customMetricName = customMetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMetricName]
  }
  
  @scala.inline
  implicit class CustomMetricNameOps[Self <: CustomMetricName] (val x: Self) extends AnyVal {
    
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
    def setCustomMetricName(value: String): Self = this.set("customMetricName", value.asInstanceOf[js.Any])
  }
}
