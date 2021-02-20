package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvUpload extends BulkUpload[CsvUpload] {
  
  def append(row: js.Object): CsvUpload = js.native
  
  @JSName("apply")
  def apply(): Unit = js.native
}
object CsvUpload {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CsvUploadMutableBuilder[Self <: CsvUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: js.Object => CsvUpload): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
  }
}
