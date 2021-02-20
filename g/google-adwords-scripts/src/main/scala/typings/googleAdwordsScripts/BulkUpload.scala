package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkUpload[T] extends StObject {
  
  def forCampaignManagement(): T = js.native
  
  def forOfflineConversions(): T = js.native
  
  def preview(): Unit = js.native
  
  def setFileName(fileName: String): T = js.native
}
object BulkUpload {
  
  @scala.inline
  def apply[T](
    forCampaignManagement: () => T,
    forOfflineConversions: () => T,
    preview: () => Unit,
    setFileName: String => T
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal(forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[BulkUpload[T]]
  }
  
  @scala.inline
  implicit class BulkUploadMutableBuilder[Self <: BulkUpload[_], T] (val x: Self with BulkUpload[T]) extends AnyVal {
    
    @scala.inline
    def setForCampaignManagement(value: () => T): Self = StObject.set(x, "forCampaignManagement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForOfflineConversions(value: () => T): Self = StObject.set(x, "forOfflineConversions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreview(value: () => Unit): Self = StObject.set(x, "preview", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFileName(value: String => T): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
