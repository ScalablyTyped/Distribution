package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bulk Upload of an already-existing file, loaded from Blob, Google Sheet or Drive File. */
trait FileUpload extends StObject {
  
  /**
    * Uploads the file and applies the changes.
    *
    * **When previewing a script, apply() previews the Bulk Upload instead of applying it.**
    */
  @JSName("apply")
  def apply(): Unit
  
  /** Specifies that this upload is used for Campaign Management entity changes. */
  def forCampaignManagement(): this.type
  
  /** Specifies that this upload is used for reporting offline conversions. */
  def forOfflineConversions(): this.type
  
  /** Uploads the file and previews the changes. */
  def preview(): Unit
  
  /** Sets the file name of the uploaded file. */
  def setFileName(fileName: String): this.type
}
object FileUpload {
  
  inline def apply(
    apply: () => Unit,
    forCampaignManagement: () => FileUpload,
    forOfflineConversions: () => FileUpload,
    preview: () => Unit,
    setFileName: String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[FileUpload]
  }
  
  extension [Self <: FileUpload](x: Self) {
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    inline def setForCampaignManagement(value: () => FileUpload): Self = StObject.set(x, "forCampaignManagement", js.Any.fromFunction0(value))
    
    inline def setForOfflineConversions(value: () => FileUpload): Self = StObject.set(x, "forOfflineConversions", js.Any.fromFunction0(value))
    
    inline def setPreview(value: () => Unit): Self = StObject.set(x, "preview", js.Any.fromFunction0(value))
    
    inline def setSetFileName(value: String => FileUpload): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
  }
}
