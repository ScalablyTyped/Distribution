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
  
  @scala.inline
  def apply(): JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics3]
  }
  
  @scala.inline
  implicit class JobStatistics3MutableBuilder[Self <: JobStatistics3] (val x: Self) extends AnyVal {
    
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
