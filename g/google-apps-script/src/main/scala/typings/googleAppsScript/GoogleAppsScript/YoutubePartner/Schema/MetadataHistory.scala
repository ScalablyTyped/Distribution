package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataHistory extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[Metadata] = js.native
  
  var origination: js.UndefOr[Origination] = js.native
  
  var timeProvided: js.UndefOr[String] = js.native
}
object MetadataHistory {
  
  @scala.inline
  def apply(): MetadataHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataHistory]
  }
  
  @scala.inline
  implicit class MetadataHistoryOps[Self <: MetadataHistory] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOrigination(value: Origination): Self = this.set("origination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigination: Self = this.set("origination", js.undefined)
    
    @scala.inline
    def setTimeProvided(value: String): Self = this.set("timeProvided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeProvided: Self = this.set("timeProvided", js.undefined)
  }
}
