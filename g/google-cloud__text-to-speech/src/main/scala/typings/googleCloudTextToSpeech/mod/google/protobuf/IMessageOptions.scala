package typings.googleCloudTextToSpeech.mod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MessageOptions. */
@js.native
trait IMessageOptions extends StObject {
  
  /** MessageOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  
  /** MessageOptions mapEntry */
  var mapEntry: js.UndefOr[Boolean | Null] = js.native
  
  /** MessageOptions messageSetWireFormat */
  var messageSetWireFormat: js.UndefOr[Boolean | Null] = js.native
  
  /** MessageOptions noStandardDescriptorAccessor */
  var noStandardDescriptorAccessor: js.UndefOr[Boolean | Null] = js.native
  
  /** MessageOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}
object IMessageOptions {
  
  @scala.inline
  def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  
  @scala.inline
  implicit class IMessageOptionsMutableBuilder[Self <: IMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapEntryNull: Self = StObject.set(x, "mapEntry", null)
    
    @scala.inline
    def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
    
    @scala.inline
    def setMessageSetWireFormat(value: Boolean): Self = StObject.set(x, "messageSetWireFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSetWireFormatNull: Self = StObject.set(x, "messageSetWireFormat", null)
    
    @scala.inline
    def setMessageSetWireFormatUndefined: Self = StObject.set(x, "messageSetWireFormat", js.undefined)
    
    @scala.inline
    def setNoStandardDescriptorAccessor(value: Boolean): Self = StObject.set(x, "noStandardDescriptorAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoStandardDescriptorAccessorNull: Self = StObject.set(x, "noStandardDescriptorAccessor", null)
    
    @scala.inline
    def setNoStandardDescriptorAccessorUndefined: Self = StObject.set(x, "noStandardDescriptorAccessor", js.undefined)
    
    @scala.inline
    def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    @scala.inline
    def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    @scala.inline
    def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value :_*))
  }
}
