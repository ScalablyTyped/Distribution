package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FileDescriptorSet. */
trait IFileDescriptorSet extends StObject {
  
  /** FileDescriptorSet file */
  var file: js.UndefOr[js.Array[IFileDescriptorProto] | Null] = js.undefined
}
object IFileDescriptorSet {
  
  @scala.inline
  def apply(): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorSet]
  }
  
  @scala.inline
  implicit class IFileDescriptorSetMutableBuilder[Self <: IFileDescriptorSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: js.Array[IFileDescriptorProto]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNull: Self = StObject.set(x, "file", null)
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFileVarargs(value: IFileDescriptorProto*): Self = StObject.set(x, "file", js.Array(value :_*))
  }
}
