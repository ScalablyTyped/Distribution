package typings.fineUploader.libCoreMod

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
  
  inline def apply(): BlobWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobWrapper]
  }
  
  extension [Self <: BlobWrapper](x: Self) {
    
    inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
