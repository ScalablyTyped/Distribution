package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestionInfo extends js.Object {
  
  var backupIngestionAddress: js.UndefOr[String] = js.native
  
  var ingestionAddress: js.UndefOr[String] = js.native
  
  var streamName: js.UndefOr[String] = js.native
}
object IngestionInfo {
  
  @scala.inline
  def apply(): IngestionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestionInfo]
  }
  
  @scala.inline
  implicit class IngestionInfoOps[Self <: IngestionInfo] (val x: Self) extends AnyVal {
    
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
    def setBackupIngestionAddress(value: String): Self = this.set("backupIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupIngestionAddress: Self = this.set("backupIngestionAddress", js.undefined)
    
    @scala.inline
    def setIngestionAddress(value: String): Self = this.set("ingestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestionAddress: Self = this.set("ingestionAddress", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = this.set("streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("streamName", js.undefined)
  }
}
