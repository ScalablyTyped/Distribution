package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content of an item to be indexed and surfaced by Cloud Search.
  */
trait SchemaItemContent extends StObject {
  
  /**
    * Upload reference ID of a previously uploaded content via write method.
    */
  var contentDataRef: js.UndefOr[SchemaUploadItemRef] = js.undefined
  
  var contentFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Hashing info calculated and provided by the API client for content. Can
    * be used with the items.push method to calculate modified state. The
    * maximum length is 2048 characters.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * Content that is supplied inlined within the update method. The maximum
    * length is 102400 bytes (100 KiB).
    */
  var inlineContent: js.UndefOr[String] = js.undefined
}
object SchemaItemContent {
  
  inline def apply(): SchemaItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemContent]
  }
  
  extension [Self <: SchemaItemContent](x: Self) {
    
    inline def setContentDataRef(value: SchemaUploadItemRef): Self = StObject.set(x, "contentDataRef", value.asInstanceOf[js.Any])
    
    inline def setContentDataRefUndefined: Self = StObject.set(x, "contentDataRef", js.undefined)
    
    inline def setContentFormat(value: String): Self = StObject.set(x, "contentFormat", value.asInstanceOf[js.Any])
    
    inline def setContentFormatUndefined: Self = StObject.set(x, "contentFormat", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInlineContent(value: String): Self = StObject.set(x, "inlineContent", value.asInstanceOf[js.Any])
    
    inline def setInlineContentUndefined: Self = StObject.set(x, "inlineContent", js.undefined)
  }
}
