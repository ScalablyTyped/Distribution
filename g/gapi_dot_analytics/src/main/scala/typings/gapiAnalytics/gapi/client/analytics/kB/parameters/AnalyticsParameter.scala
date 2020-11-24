package typings.gapiAnalytics.gapi.client.analytics.kB.parameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsParameter extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var enum: js.UndefOr[js.Array[String]] = js.native
  
  var enumDescriptions: js.UndefOr[js.Array[String]] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object AnalyticsParameter {
  
  @scala.inline
  def apply(): AnalyticsParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsParameter]
  }
  
  @scala.inline
  implicit class AnalyticsParameterOps[Self <: AnalyticsParameter] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setEnumDescriptionsVarargs(value: String*): Self = this.set("enumDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setEnumDescriptions(value: js.Array[String]): Self = this.set("enumDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumDescriptions: Self = this.set("enumDescriptions", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
