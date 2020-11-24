package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickTag extends js.Object {
  
  var clickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.native
  
  var eventName: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ClickTag {
  
  @scala.inline
  def apply(): ClickTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickTag]
  }
  
  @scala.inline
  implicit class ClickTagOps[Self <: ClickTag] (val x: Self) extends AnyVal {
    
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
    def setClickThroughUrl(value: CreativeClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
