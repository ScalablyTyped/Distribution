package typings.fhir.r3Mod

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
    * Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the attachment was first created.
    */
  var creation: js.UndefOr[String] = js.undefined
  
  /**
    * The base64-encoded data SHALL be expressed in the same character set as the base resource XML or JSON.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The hash is calculated on the data prior to base64 encoding, if the data is based64 encoded.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * The human language of the content. The value can be any valid value according to BCP 47.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes is redundant if the data is provided as a base64binary, but is useful if the data is provided as a url reference.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * A label or set of text to display in place of the data.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * If both data and url are provided, the url SHALL point to the same content as the data contains. Urls may be relative references or may reference transient locations such as a wrapping envelope using cid: though this has ramifications for using signatures. Relative URLs are interpreted relative to the service url, like a resource reference, rather than relative to the resource itself. If a URL is provided, it SHALL resolve to actual data.
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
