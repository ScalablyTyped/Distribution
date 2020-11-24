package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaErrorProto
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobConfiguration
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobReference
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobStatistics
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var configuration: js.UndefOr[SchemaJobConfiguration] = js.native
  
  var errorResult: js.UndefOr[SchemaErrorProto] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var jobReference: js.UndefOr[SchemaJobReference] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var statistics: js.UndefOr[SchemaJobStatistics] = js.native
  
  var status: js.UndefOr[SchemaJobStatus] = js.native
  
  var user_email: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: SchemaJobConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setErrorResult(value: SchemaErrorProto): Self = this.set("errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorResult: Self = this.set("errorResult", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setJobReference(value: SchemaJobReference): Self = this.set("jobReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobReference: Self = this.set("jobReference", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatistics(value: SchemaJobStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUser_email(value: String): Self = this.set("user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_email: Self = this.set("user_email", js.undefined)
  }
}
