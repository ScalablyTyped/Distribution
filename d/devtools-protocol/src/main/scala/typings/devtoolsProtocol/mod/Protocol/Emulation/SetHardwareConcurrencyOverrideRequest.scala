package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetHardwareConcurrencyOverrideRequest extends StObject {
  
  /**
    * Hardware concurrency to report
    */
  var hardwareConcurrency: integer
}
object SetHardwareConcurrencyOverrideRequest {
  
  inline def apply(hardwareConcurrency: integer): SetHardwareConcurrencyOverrideRequest = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHardwareConcurrencyOverrideRequest]
  }
  
  extension [Self <: SetHardwareConcurrencyOverrideRequest](x: Self) {
    
    inline def setHardwareConcurrency(value: integer): Self = StObject.set(x, "hardwareConcurrency", value.asInstanceOf[js.Any])
  }
}
