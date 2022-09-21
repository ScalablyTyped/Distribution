package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment
  extends StObject
     with Element {
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _creation: js.UndefOr[Element] = js.undefined
  
  var _data: js.UndefOr[Element] = js.undefined
  
  var _hash: js.UndefOr[Element] = js.undefined
  
  var _language: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Processors of the data need to be able to know how to interpret the data.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * This is often tracked as an integrity issue for use of the attachment.
    */
  var creation: js.UndefOr[String] = js.undefined
  
  /**
    * The data needs to able to be transmitted inline.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Included so that applications can verify that the contents of a location have not changed and so that a signature of the content can implicitly sign the content of an image without having to include the data in the instance or reference the url in the signature.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * Users need to be able to choose between the languages in a set of attachments.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Representing the size allows applications to determine whether they should fetch the content automatically in advance, or refuse to fetch it at all.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Applications need a label to display to a human user in place of the actual data if the data cannot be rendered or perceived by the viewer.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The data needs to be transmitted by reference.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Attachment {
  
  inline def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreation(value: String): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_creation(value: Element): Self = StObject.set(x, "_creation", value.asInstanceOf[js.Any])
    
    inline def set_creationUndefined: Self = StObject.set(x, "_creation", js.undefined)
    
    inline def set_data(value: Element): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    
    inline def set_dataUndefined: Self = StObject.set(x, "_data", js.undefined)
    
    inline def set_hash(value: Element): Self = StObject.set(x, "_hash", value.asInstanceOf[js.Any])
    
    inline def set_hashUndefined: Self = StObject.set(x, "_hash", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
