package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A routing configuration attached to a network resource. The message
  * includes the list of routers associated with the network, and a flag
  * indicating the type of routing behavior to enforce network-wide.
  */
trait SchemaNetworkRoutingConfig extends StObject {
  
  /**
    * The network-wide routing mode to use. If set to REGIONAL, this
    * network&#39;s cloud routers will only advertise routes with subnets of
    * this network in the same region as the router. If set to GLOBAL, this
    * network&#39;s cloud routers will advertise routes with all subnets of
    * this network, across regions.
    */
  var routingMode: js.UndefOr[String] = js.undefined
}
object SchemaNetworkRoutingConfig {
  
  inline def apply(): SchemaNetworkRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkRoutingConfig]
  }
  
  extension [Self <: SchemaNetworkRoutingConfig](x: Self) {
    
    inline def setRoutingMode(value: String): Self = StObject.set(x, "routingMode", value.asInstanceOf[js.Any])
    
    inline def setRoutingModeUndefined: Self = StObject.set(x, "routingMode", js.undefined)
  }
}
