package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageReference extends StObject {
  
  /**
    * The name of the bucket containing this reference's object.
    */
  var bucket: String
  
  /**
    * The full path of this object.
    */
  var fullPath: String
  
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: String
  
  /**
    * A reference pointing to the parent location of this reference, or null if
    * this reference is the root.
    */
  var parent: StorageReference | Null
  
  /**
    * A reference to the root of this object's bucket.
    */
  var root: StorageReference
  
  /**
    * The {@link FirebaseStorage} instance associated with this reference.
    */
  var storage: FirebaseStorage
}
object StorageReference {
  
  inline def apply(bucket: String, fullPath: String, name: String, root: StorageReference, storage: FirebaseStorage): StorageReference = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[StorageReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageReference] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: StorageReference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRoot(value: StorageReference): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: FirebaseStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
