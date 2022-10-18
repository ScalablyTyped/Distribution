package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadMetadata
  extends StObject
     with SettableMetadata {
  
  /**
    * A Base64-encoded MD5 hash of the object being uploaded.
    */
  var md5Hash: js.UndefOr[String] = js.undefined
}
object UploadMetadata {
  
  inline def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  
  extension [Self <: UploadMetadata](x: Self) {
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
  }
}
