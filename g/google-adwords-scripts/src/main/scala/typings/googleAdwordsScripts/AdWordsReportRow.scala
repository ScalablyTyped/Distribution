package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsReportRow extends StObject {
  
  def formatForUpload(): js.Object = js.native
}
object AdWordsReportRow {
  
  @scala.inline
  def apply(formatForUpload: () => js.Object): AdWordsReportRow = {
    val __obj = js.Dynamic.literal(formatForUpload = js.Any.fromFunction0(formatForUpload))
    __obj.asInstanceOf[AdWordsReportRow]
  }
  
  @scala.inline
  implicit class AdWordsReportRowMutableBuilder[Self <: AdWordsReportRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatForUpload(value: () => js.Object): Self = StObject.set(x, "formatForUpload", js.Any.fromFunction0(value))
  }
}
