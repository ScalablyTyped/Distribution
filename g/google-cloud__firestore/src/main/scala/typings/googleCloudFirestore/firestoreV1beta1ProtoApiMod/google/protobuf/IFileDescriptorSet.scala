package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf

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
  
  extension [Self <: IFileDescriptorSet](x: Self) {
    
    inline def setFile(value: js.Array[IFileDescriptorProto]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFileVarargs(value: IFileDescriptorProto*): Self = StObject.set(x, "file", js.Array(value*))
  }
}
