package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AXValueSource extends StObject {
  
  /**
    * The name of the relevant attribute, if any.
    */
  var attribute: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the relevant attribute, if any.
    */
  var attributeValue: js.UndefOr[AXValue] = js.undefined
  
  /**
    * Whether the value for this property is invalid.
    */
  var invalid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reason for the value being invalid, if it is.
    */
  var invalidReason: js.UndefOr[String] = js.undefined
  
  /**
    * The native markup source for this value, e.g. a <label> element.
    */
  var nativeSource: js.UndefOr[AXValueNativeSourceType] = js.undefined
  
  /**
    * The value, such as a node or node list, of the native source.
    */
  var nativeSourceValue: js.UndefOr[AXValue] = js.undefined
  
  /**
    * Whether this source is superseded by a higher priority source.
    */
  var superseded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * What type of source this is.
    */
  var `type`: AXValueSourceType
  
  /**
    * The value of this property source.
    */
  var value: js.UndefOr[AXValue] = js.undefined
}
object AXValueSource {
  
  inline def apply(`type`: AXValueSourceType): AXValueSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXValueSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AXValueSource] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributeValue(value: AXValue): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
    
    inline def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setNativeSource(value: AXValueNativeSourceType): Self = StObject.set(x, "nativeSource", value.asInstanceOf[js.Any])
    
    inline def setNativeSourceUndefined: Self = StObject.set(x, "nativeSource", js.undefined)
    
    inline def setNativeSourceValue(value: AXValue): Self = StObject.set(x, "nativeSourceValue", value.asInstanceOf[js.Any])
    
    inline def setNativeSourceValueUndefined: Self = StObject.set(x, "nativeSourceValue", js.undefined)
    
    inline def setSuperseded(value: Boolean): Self = StObject.set(x, "superseded", value.asInstanceOf[js.Any])
    
    inline def setSupersededUndefined: Self = StObject.set(x, "superseded", js.undefined)
    
    inline def setType(value: AXValueSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
