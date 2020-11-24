package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.horizontal
import typings.devtoolsProtocol.devtoolsProtocolStrings.vertical
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayFeature extends js.Object {
  
  /**
    * A display feature may mask content such that it is not physically
    * displayed - this length along with the offset describes this area.
    * A display feature that only splits content will have a 0 mask_length.
    */
  var maskLength: integer = js.native
  
  /**
    * The offset from the screen origin in either the x (for vertical
    * orientation) or y (for horizontal orientation) direction.
    */
  var offset: integer = js.native
  
  /**
    * Orientation of a display feature in relation to screen (DisplayFeatureOrientation enum)
    */
  var orientation: vertical | horizontal = js.native
}
object DisplayFeature {
  
  @scala.inline
  def apply(maskLength: integer, offset: integer, orientation: vertical | horizontal): DisplayFeature = {
    val __obj = js.Dynamic.literal(maskLength = maskLength.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayFeature]
  }
  
  @scala.inline
  implicit class DisplayFeatureOps[Self <: DisplayFeature] (val x: Self) extends AnyVal {
    
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
    def setMaskLength(value: integer): Self = this.set("maskLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
  }
}
