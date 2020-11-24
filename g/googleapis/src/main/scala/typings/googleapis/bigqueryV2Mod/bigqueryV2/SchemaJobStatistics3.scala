package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobStatistics3 extends js.Object {
  
  /**
    * [Output-only] The number of bad records encountered. Note that if the job
    * has failed because of more bad records encountered than the maximum
    * allowed in the load job configuration, then this number can be less than
    * the total number of bad records present in the input data.
    */
  var badRecords: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Number of bytes of source data in a load job.
    */
  var inputFileBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Number of source files in a load job.
    */
  var inputFiles: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Size of the loaded data in bytes. Note that while a load
    * job is in the running state, this value may change.
    */
  var outputBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Number of rows imported in a load job. Note that while an
    * import job is in the running state, this value may change.
    */
  var outputRows: js.UndefOr[String] = js.native
}
object SchemaJobStatistics3 {
  
  @scala.inline
  def apply(): SchemaJobStatistics3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics3]
  }
  
  @scala.inline
  implicit class SchemaJobStatistics3Ops[Self <: SchemaJobStatistics3] (val x: Self) extends AnyVal {
    
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
