package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing connection draining configuration.
  */
trait SchemaConnectionDraining extends StObject {
  
  /**
    * Time for which instance will be drained (not accept new connections, but
    * still work to finish started).
    */
  var drainingTimeoutSec: js.UndefOr[Double] = js.undefined
}
object SchemaConnectionDraining {
  
  inline def apply(): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
  
  extension [Self <: SchemaConnectionDraining](x: Self) {
    
    inline def setDrainingTimeoutSec(value: Double): Self = StObject.set(x, "drainingTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setDrainingTimeoutSecUndefined: Self = StObject.set(x, "drainingTimeoutSec", js.undefined)
  }
}
