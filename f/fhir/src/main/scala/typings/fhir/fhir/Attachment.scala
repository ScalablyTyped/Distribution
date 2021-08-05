package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content in a format defined elsewhere
  */
trait Attachment
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'creation'.
    */
  var _creation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'hash'.
    */
  var _hash: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'size'.
    */
  var _size: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Mime type of the content, with charset etc.
    */
  var contentType: js.UndefOr[code] = js.undefined
  
  /**
    * Date attachment was first created
    */
  var creation: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Data inline, base64ed
    */
  var data: js.UndefOr[base64Binary] = js.undefined
  
  /**
    * Hash of the data (sha-1, base64ed)
    */
  var hash: js.UndefOr[base64Binary] = js.undefined
  
  /**
    * Human language of the content (BCP-47)
    */
  var language: js.UndefOr[code] = js.undefined
  
  /**
    * Number of bytes of content (if url provided)
    */
  var size: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Label to display in place of the data
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Uri where the data can be found
    */
  var url: js.UndefOr[uri] = js.undefined
}
object Attachment {
  
  inline def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setContentType(value: code): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreation(value: dateTime): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
    
    inline def setData(value: base64Binary): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHash(value: base64Binary): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSize(value: unsignedInt): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
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
    
    inline def set_size(value: Element): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    
    inline def set_sizeUndefined: Self = StObject.set(x, "_size", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
