package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatistics3 extends StObject {
  
  var badRecords: js.UndefOr[String] = js.undefined
  
  var inputFileBytes: js.UndefOr[String] = js.undefined
  
  var inputFiles: js.UndefOr[String] = js.undefined
  
  var outputBytes: js.UndefOr[String] = js.undefined
  
  var outputRows: js.UndefOr[String] = js.undefined
}
object JobStatistics3 {
  
  inline def apply(): JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics3]
  }
  
  extension [Self <: JobStatistics3](x: Self) {
    
    inline def setBadRecords(value: String): Self = StObject.set(x, "badRecords", value.asInstanceOf[js.Any])
    
    inline def setBadRecordsUndefined: Self = StObject.set(x, "badRecords", js.undefined)
    
    inline def setInputFileBytes(value: String): Self = StObject.set(x, "inputFileBytes", value.asInstanceOf[js.Any])
    
    inline def setInputFileBytesUndefined: Self = StObject.set(x, "inputFileBytes", js.undefined)
    
    inline def setInputFiles(value: String): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    inline def setInputFilesUndefined: Self = StObject.set(x, "inputFiles", js.undefined)
    
    inline def setOutputBytes(value: String): Self = StObject.set(x, "outputBytes", value.asInstanceOf[js.Any])
    
    inline def setOutputBytesUndefined: Self = StObject.set(x, "outputBytes", js.undefined)
    
    inline def setOutputRows(value: String): Self = StObject.set(x, "outputRows", value.asInstanceOf[js.Any])
    
    inline def setOutputRowsUndefined: Self = StObject.set(x, "outputRows", js.undefined)
  }
}
