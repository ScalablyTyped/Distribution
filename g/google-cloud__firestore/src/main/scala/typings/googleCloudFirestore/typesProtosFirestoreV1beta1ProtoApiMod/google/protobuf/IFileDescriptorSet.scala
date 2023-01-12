package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FileDescriptorSet. */
trait IFileDescriptorSet extends StObject {
  
  /** FileDescriptorSet file */
  var file: js.UndefOr[js.Array[IFileDescriptorProto] | Null] = js.undefined
}
object IFileDescriptorSet {
  
  inline def apply(): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileDescriptorSet] (val x: Self) extends AnyVal {
    
    inline def setFile(value: js.Array[IFileDescriptorProto]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFileVarargs(value: IFileDescriptorProto*): Self = StObject.set(x, "file", js.Array(value*))
  }
}
