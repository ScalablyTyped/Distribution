package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.horizontal
import typings.devtoolsProtocol.devtoolsProtocolStrings.vertical
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayFeature extends StObject {
  
  /**
    * A display feature may mask content such that it is not physically
    * displayed - this length along with the offset describes this area.
    * A display feature that only splits content will have a 0 mask_length.
    */
  var maskLength: integer
  
  /**
    * The offset from the screen origin in either the x (for vertical
    * orientation) or y (for horizontal orientation) direction.
    */
  var offset: integer
  
  /**
    * Orientation of a display feature in relation to screen (DisplayFeatureOrientation enum)
    */
  var orientation: vertical | horizontal
}
object DisplayFeature {
  
  @scala.inline
  def apply(maskLength: integer, offset: integer, orientation: vertical | horizontal): DisplayFeature = {
    val __obj = js.Dynamic.literal(maskLength = maskLength.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayFeature]
  }
  
  @scala.inline
  implicit class DisplayFeatureMutableBuilder[Self <: DisplayFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskLength(value: integer): Self = StObject.set(x, "maskLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
