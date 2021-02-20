package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobStatistics3 extends StObject {
  
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
  implicit class SchemaJobStatistics3MutableBuilder[Self <: SchemaJobStatistics3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadRecords(value: String): Self = StObject.set(x, "badRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadRecordsUndefined: Self = StObject.set(x, "badRecords", js.undefined)
    
    @scala.inline
    def setInputFileBytes(value: String): Self = StObject.set(x, "inputFileBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFileBytesUndefined: Self = StObject.set(x, "inputFileBytes", js.undefined)
    
    @scala.inline
    def setInputFiles(value: String): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFilesUndefined: Self = StObject.set(x, "inputFiles", js.undefined)
    
    @scala.inline
    def setOutputBytes(value: String): Self = StObject.set(x, "outputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBytesUndefined: Self = StObject.set(x, "outputBytes", js.undefined)
    
    @scala.inline
    def setOutputRows(value: String): Self = StObject.set(x, "outputRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputRowsUndefined: Self = StObject.set(x, "outputRows", js.undefined)
  }
}
