package typings.devtoolsProtocol.mod.Protocol.Accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AXValueSource extends js.Object {
  
  /**
    * The name of the relevant attribute, if any.
    */
  var attribute: js.UndefOr[String] = js.native
  
  /**
    * The value of the relevant attribute, if any.
    */
  var attributeValue: js.UndefOr[AXValue] = js.native
  
  /**
    * Whether the value for this property is invalid.
    */
  var invalid: js.UndefOr[Boolean] = js.native
  
  /**
    * Reason for the value being invalid, if it is.
    */
  var invalidReason: js.UndefOr[String] = js.native
  
  /**
    * The native markup source for this value, e.g. a <label> element.
    */
  var nativeSource: js.UndefOr[AXValueNativeSourceType] = js.native
  
  /**
    * The value, such as a node or node list, of the native source.
    */
  var nativeSourceValue: js.UndefOr[AXValue] = js.native
  
  /**
    * Whether this source is superseded by a higher priority source.
    */
  var superseded: js.UndefOr[Boolean] = js.native
  
  /**
    * What type of source this is.
    */
  var `type`: AXValueSourceType = js.native
  
  /**
    * The value of this property source.
    */
  var value: js.UndefOr[AXValue] = js.native
}
object AXValueSource {
  
  @scala.inline
  def apply(`type`: AXValueSourceType): AXValueSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXValueSource]
  }
  
  @scala.inline
  implicit class AXValueSourceOps[Self <: AXValueSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: AXValueSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setAttributeValue(value: AXValue): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValue: Self = this.set("attributeValue", js.undefined)
    
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setInvalidReason(value: String): Self = this.set("invalidReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidReason: Self = this.set("invalidReason", js.undefined)
    
    @scala.inline
    def setNativeSource(value: AXValueNativeSourceType): Self = this.set("nativeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeSource: Self = this.set("nativeSource", js.undefined)
    
    @scala.inline
    def setNativeSourceValue(value: AXValue): Self = this.set("nativeSourceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeSourceValue: Self = this.set("nativeSourceValue", js.undefined)
    
    @scala.inline
    def setSuperseded(value: Boolean): Self = this.set("superseded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperseded: Self = this.set("superseded", js.undefined)
    
    @scala.inline
    def setValue(value: AXValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
