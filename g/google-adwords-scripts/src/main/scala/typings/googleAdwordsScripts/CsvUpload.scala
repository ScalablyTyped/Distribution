package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvUpload
  extends StObject
     with BulkUpload[CsvUpload] {
  
  def append(row: js.Object): CsvUpload
  
  @JSName("apply")
  def apply(): Unit
}
object CsvUpload {
  
  inline def apply(
    append: js.Object => CsvUpload,
    apply: () => Unit,
    forCampaignManagement: () => CsvUpload,
    forOfflineConversions: () => CsvUpload,
    preview: () => Unit,
    setFileName: String => CsvUpload
  ): CsvUpload = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[CsvUpload]
  }
  
  extension [Self <: CsvUpload](x: Self) {
    
    inline def setAppend(value: js.Object => CsvUpload): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
  }
}
