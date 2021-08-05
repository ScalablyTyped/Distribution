package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowHingeRequest extends StObject {
  
  /**
    * hinge data, null means hideHinge
    */
  var hingeConfig: js.UndefOr[HingeConfig] = js.undefined
}
object SetShowHingeRequest {
  
  inline def apply(): SetShowHingeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetShowHingeRequest]
  }
  
  extension [Self <: SetShowHingeRequest](x: Self) {
    
    inline def setHingeConfig(value: HingeConfig): Self = StObject.set(x, "hingeConfig", value.asInstanceOf[js.Any])
    
    inline def setHingeConfigUndefined: Self = StObject.set(x, "hingeConfig", js.undefined)
  }
}
