package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatistics3 extends StObject {
  
  /**
    * [Output-only] The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed in the load job configuration, then this number can be less than the total number of bad records present in the input data.
    */
  var badRecords: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of bytes of source data in a load job.
    */
  var inputFileBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of source files in a load job.
    */
  var inputFiles: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change.
    */
  var outputBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of rows imported in a load job. Note that while an import job is in the running state, this value may change.
    */
  var outputRows: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobStatistics3 {
  
  inline def apply(): SchemaJobStatistics3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics3]
  }
  
  extension [Self <: SchemaJobStatistics3](x: Self) {
    
    inline def setBadRecords(value: String): Self = StObject.set(x, "badRecords", value.asInstanceOf[js.Any])
    
    inline def setBadRecordsNull: Self = StObject.set(x, "badRecords", null)
    
    inline def setBadRecordsUndefined: Self = StObject.set(x, "badRecords", js.undefined)
    
    inline def setInputFileBytes(value: String): Self = StObject.set(x, "inputFileBytes", value.asInstanceOf[js.Any])
    
    inline def setInputFileBytesNull: Self = StObject.set(x, "inputFileBytes", null)
    
    inline def setInputFileBytesUndefined: Self = StObject.set(x, "inputFileBytes", js.undefined)
    
    inline def setInputFiles(value: String): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    inline def setInputFilesNull: Self = StObject.set(x, "inputFiles", null)
    
    inline def setInputFilesUndefined: Self = StObject.set(x, "inputFiles", js.undefined)
    
    inline def setOutputBytes(value: String): Self = StObject.set(x, "outputBytes", value.asInstanceOf[js.Any])
    
    inline def setOutputBytesNull: Self = StObject.set(x, "outputBytes", null)
    
    inline def setOutputBytesUndefined: Self = StObject.set(x, "outputBytes", js.undefined)
    
    inline def setOutputRows(value: String): Self = StObject.set(x, "outputRows", value.asInstanceOf[js.Any])
    
    inline def setOutputRowsNull: Self = StObject.set(x, "outputRows", null)
    
    inline def setOutputRowsUndefined: Self = StObject.set(x, "outputRows", js.undefined)
  }
}
