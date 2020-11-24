package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationOptions extends js.Object {
  
  var customAttributes: js.UndefOr[StringDictionary[String]] = js.native
  
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  
  var objectNamePrefix: js.UndefOr[String] = js.native
  
  var payloadFormat: js.UndefOr[String] = js.native
  
  var userProject: js.UndefOr[String] = js.native
}
object CreateNotificationOptions {
  
  @scala.inline
  def apply(): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationOptions]
  }
  
  @scala.inline
  implicit class CreateNotificationOptionsOps[Self <: CreateNotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomAttributes(value: StringDictionary[String]): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: String*): Self = this.set("eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypes(value: js.Array[String]): Self = this.set("eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypes: Self = this.set("eventTypes", js.undefined)
    
    @scala.inline
    def setObjectNamePrefix(value: String): Self = this.set("objectNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectNamePrefix: Self = this.set("objectNamePrefix", js.undefined)
    
    @scala.inline
    def setPayloadFormat(value: String): Self = this.set("payloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadFormat: Self = this.set("payloadFormat", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
}
