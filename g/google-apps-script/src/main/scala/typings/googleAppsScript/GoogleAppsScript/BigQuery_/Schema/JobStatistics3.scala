package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics3 extends js.Object {
  
  var badRecords: js.UndefOr[String] = js.native
  
  var inputFileBytes: js.UndefOr[String] = js.native
  
  var inputFiles: js.UndefOr[String] = js.native
  
  var outputBytes: js.UndefOr[String] = js.native
  
  var outputRows: js.UndefOr[String] = js.native
}
object JobStatistics3 {
  
  @scala.inline
  def apply(): JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics3]
  }
  
  @scala.inline
  implicit class JobStatistics3Ops[Self <: JobStatistics3] (val x: Self) extends AnyVal {
    
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
    def setBadRecords(value: String): Self = this.set("badRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadRecords: Self = this.set("badRecords", js.undefined)
    
    @scala.inline
    def setInputFileBytes(value: String): Self = this.set("inputFileBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFileBytes: Self = this.set("inputFileBytes", js.undefined)
    
    @scala.inline
    def setInputFiles(value: String): Self = this.set("inputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFiles: Self = this.set("inputFiles", js.undefined)
    
    @scala.inline
    def setOutputBytes(value: String): Self = this.set("outputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputBytes: Self = this.set("outputBytes", js.undefined)
    
    @scala.inline
    def setOutputRows(value: String): Self = this.set("outputRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputRows: Self = this.set("outputRows", js.undefined)
  }
}
