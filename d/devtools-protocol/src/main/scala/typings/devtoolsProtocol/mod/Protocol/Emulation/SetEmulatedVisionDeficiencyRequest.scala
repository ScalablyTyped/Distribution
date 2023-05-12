package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.devtoolsProtocolStrings.achromatopsia
import typings.devtoolsProtocol.devtoolsProtocolStrings.blurredVision
import typings.devtoolsProtocol.devtoolsProtocolStrings.deuteranopia
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import typings.devtoolsProtocol.devtoolsProtocolStrings.protanopia
import typings.devtoolsProtocol.devtoolsProtocolStrings.reducedContrast
import typings.devtoolsProtocol.devtoolsProtocolStrings.tritanopia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEmulatedVisionDeficiencyRequest extends StObject {
  
  /**
    * Vision deficiency to emulate. Order: best-effort emulations come first, followed by any
    * physiologically accurate emulations for medically recognized color vision deficiencies. (SetEmulatedVisionDeficiencyRequestType enum)
    */
  var `type`: none_ | blurredVision | reducedContrast | achromatopsia | deuteranopia | protanopia | tritanopia
}
object SetEmulatedVisionDeficiencyRequest {
  
  inline def apply(
    `type`: none_ | blurredVision | reducedContrast | achromatopsia | deuteranopia | protanopia | tritanopia
  ): SetEmulatedVisionDeficiencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEmulatedVisionDeficiencyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetEmulatedVisionDeficiencyRequest] (val x: Self) extends AnyVal {
    
    inline def setType(
      value: none_ | blurredVision | reducedContrast | achromatopsia | deuteranopia | protanopia | tritanopia
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
