package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content of an item to be indexed and surfaced by Cloud Search.
  */
@js.native
trait SchemaItemContent extends StObject {
  
  /**
    * Upload reference ID of a previously uploaded content via write method.
    */
  var contentDataRef: js.UndefOr[SchemaUploadItemRef] = js.native
  
  var contentFormat: js.UndefOr[String] = js.native
  
  /**
    * Hashing info calculated and provided by the API client for content. Can
    * be used with the items.push method to calculate modified state. The
    * maximum length is 2048 characters.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * Content that is supplied inlined within the update method. The maximum
    * length is 102400 bytes (100 KiB).
    */
  var inlineContent: js.UndefOr[String] = js.native
}
object SchemaItemContent {
  
  @scala.inline
  def apply(): SchemaItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemContent]
  }
  
  @scala.inline
  implicit class SchemaItemContentMutableBuilder[Self <: SchemaItemContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDataRef(value: SchemaUploadItemRef): Self = StObject.set(x, "contentDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDataRefUndefined: Self = StObject.set(x, "contentDataRef", js.undefined)
    
    @scala.inline
    def setContentFormat(value: String): Self = StObject.set(x, "contentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFormatUndefined: Self = StObject.set(x, "contentFormat", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setInlineContent(value: String): Self = StObject.set(x, "inlineContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineContentUndefined: Self = StObject.set(x, "inlineContent", js.undefined)
  }
}
