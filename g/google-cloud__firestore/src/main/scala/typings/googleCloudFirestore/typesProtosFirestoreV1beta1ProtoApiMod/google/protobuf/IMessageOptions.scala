package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.api.IResourceDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MessageOptions. */
trait IMessageOptions extends StObject {
  
  /** MessageOptions .google.api.resource */
  @JSName(".google.api.resource")
  var DotgoogleDotapiDotresource: js.UndefOr[IResourceDescriptor | Null] = js.undefined
  
  /** MessageOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /** MessageOptions mapEntry */
  var mapEntry: js.UndefOr[Boolean | Null] = js.undefined
  
  /** MessageOptions messageSetWireFormat */
  var messageSetWireFormat: js.UndefOr[Boolean | Null] = js.undefined
  
  /** MessageOptions noStandardDescriptorAccessor */
  var noStandardDescriptorAccessor: js.UndefOr[Boolean | Null] = js.undefined
  
  /** MessageOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IMessageOptions {
  
  inline def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDotgoogleDotapiDotresource(value: IResourceDescriptor): Self = StObject.set(x, ".google.api.resource", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotresourceNull: Self = StObject.set(x, ".google.api.resource", null)
    
    inline def setDotgoogleDotapiDotresourceUndefined: Self = StObject.set(x, ".google.api.resource", js.undefined)
    
    inline def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
    
    inline def setMapEntryNull: Self = StObject.set(x, "mapEntry", null)
    
    inline def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
    
    inline def setMessageSetWireFormat(value: Boolean): Self = StObject.set(x, "messageSetWireFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageSetWireFormatNull: Self = StObject.set(x, "messageSetWireFormat", null)
    
    inline def setMessageSetWireFormatUndefined: Self = StObject.set(x, "messageSetWireFormat", js.undefined)
    
    inline def setNoStandardDescriptorAccessor(value: Boolean): Self = StObject.set(x, "noStandardDescriptorAccessor", value.asInstanceOf[js.Any])
    
    inline def setNoStandardDescriptorAccessorNull: Self = StObject.set(x, "noStandardDescriptorAccessor", null)
    
    inline def setNoStandardDescriptorAccessorUndefined: Self = StObject.set(x, "noStandardDescriptorAccessor", js.undefined)
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
