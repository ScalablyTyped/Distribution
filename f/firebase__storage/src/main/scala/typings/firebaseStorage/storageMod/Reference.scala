package typings.firebaseStorage.storageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/storage", "_Reference")
@js.native
open class Reference protected () extends StObject {
  def this(_service: FirebaseStorageImpl, location: String) = this()
  def this(_service: FirebaseStorageImpl, location: Location) = this()
  
  var _location: Location = js.native
  
  /* protected */ def _newRef(service: FirebaseStorageImpl, location: Location): Reference = js.native
  
  /* private */ var _service: Any = js.native
  
  /**
    * Utility function to throw an error in methods that do not accept a root reference.
    */
  def _throwIfRoot(name: String): Unit = js.native
  
  /**
    * The name of the bucket containing this reference's object.
    */
  def bucket: String = js.native
  
  /**
    * The full path of this object.
    */
  def fullPath: String = js.native
  
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  def name: String = js.native
  
  /**
    * A `StorageReference` pointing to the parent location of this `StorageReference`, or null if
    * this reference is the root.
    */
  def parent: Reference | Null = js.native
  
  /**
    * A reference to the root of this object's bucket.
    */
  def root: Reference = js.native
  
  /**
    * The `StorageService` instance this `StorageReference` is associated with.
    */
  def storage: FirebaseStorageImpl = js.native
}
