package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkUpload[T] extends StObject {
  
  def forCampaignManagement(): T
  
  def forOfflineConversions(): T
  
  def preview(): Unit
  
  def setFileName(fileName: String): T
}
object BulkUpload {
  
  inline def apply[T](
    forCampaignManagement: () => T,
    forOfflineConversions: () => T,
    preview: () => Unit,
    setFileName: String => T
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal(forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[BulkUpload[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkUpload[?], T] (val x: Self & BulkUpload[T]) extends AnyVal {
    
    inline def setForCampaignManagement(value: () => T): Self = StObject.set(x, "forCampaignManagement", js.Any.fromFunction0(value))
    
    inline def setForOfflineConversions(value: () => T): Self = StObject.set(x, "forOfflineConversions", js.Any.fromFunction0(value))
    
    inline def setPreview(value: () => Unit): Self = StObject.set(x, "preview", js.Any.fromFunction0(value))
    
    inline def setSetFileName(value: String => T): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
