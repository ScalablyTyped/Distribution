package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPageScaleFactorRequest extends StObject {
  
  /**
    * Page scale factor.
    */
  var pageScaleFactor: Double
}
object SetPageScaleFactorRequest {
  
  inline def apply(pageScaleFactor: Double): SetPageScaleFactorRequest = {
    val __obj = js.Dynamic.literal(pageScaleFactor = pageScaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPageScaleFactorRequest]
  }
  
  extension [Self <: SetPageScaleFactorRequest](x: Self) {
    
    inline def setPageScaleFactor(value: Double): Self = StObject.set(x, "pageScaleFactor", value.asInstanceOf[js.Any])
  }
}
