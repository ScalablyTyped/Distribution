package typings.fineUploader.coreMod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobWrapper extends StObject {
  
  /**
    * the bytes of the `Blob` object being uploaded
    */
  var blob: js.UndefOr[Blob] = js.undefined
  
  /**
    * the name of the `Blob`
    */
  var name: js.UndefOr[String] = js.undefined
}
object BlobWrapper {
  
  @scala.inline
  def apply(): BlobWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobWrapper]
  }
  
  @scala.inline
  implicit class BlobWrapperMutableBuilder[Self <: BlobWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
