package typings.firebaseStorageTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadMetadata
  extends StObject
     with SettableMetadata {
  
  var md5Hash: js.UndefOr[String | Null] = js.undefined
}
object UploadMetadata {
  
  inline def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadMetadata] (val x: Self) extends AnyVal {
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
  }
}
