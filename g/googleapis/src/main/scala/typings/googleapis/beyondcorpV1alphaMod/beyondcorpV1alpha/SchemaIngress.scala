package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIngress extends StObject {
  
  /**
    * The basic ingress config for ClientGateways.
    */
  var config: js.UndefOr[SchemaConfig] = js.undefined
}
object SchemaIngress {
  
  inline def apply(): SchemaIngress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngress]
  }
  
  extension [Self <: SchemaIngress](x: Self) {
    
    inline def setConfig(value: SchemaConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
