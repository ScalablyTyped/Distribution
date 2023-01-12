package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadResult extends StObject {
  
  /**
    * Contains the metadata sent back from the server.
    */
  val metadata: FullMetadata
  
  /**
    * The reference that spawned this upload.
    */
  val ref: StorageReference
}
object UploadResult {
  
  inline def apply(metadata: FullMetadata, ref: StorageReference): UploadResult = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadResult] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
