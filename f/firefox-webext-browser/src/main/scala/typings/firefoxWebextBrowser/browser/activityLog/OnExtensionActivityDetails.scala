package typings.firefoxWebextBrowser.browser.activityLog

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnExtensionActivityDetails extends js.Object {
  
  var data: OnExtensionActivityDetailsData = js.native
  
  /** The name of the api call or event, or the script url if this is a content or user script event. */
  var name: String = js.native
  
  /** The date string when this call is triggered. */
  var timeStamp: Date = js.native
  
  /**
    * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to the extension. content_script is logged when a content script is injected.
    */
  var `type`: OnExtensionActivityDetailsType = js.native
  
  /** The type of view where the activity occurred. Content scripts will not have a viewType. */
  var viewType: js.UndefOr[OnExtensionActivityDetailsViewType] = js.native
}
object OnExtensionActivityDetails {
  
  @scala.inline
  def apply(
    data: OnExtensionActivityDetailsData,
    name: String,
    timeStamp: Date,
    `type`: OnExtensionActivityDetailsType
  ): OnExtensionActivityDetails = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExtensionActivityDetails]
  }
  
  @scala.inline
  implicit class OnExtensionActivityDetailsOps[Self <: OnExtensionActivityDetails] (val x: Self) extends AnyVal {
    
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
    def setData(value: OnExtensionActivityDetailsData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Date): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OnExtensionActivityDetailsType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: OnExtensionActivityDetailsViewType): Self = this.set("viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
}
