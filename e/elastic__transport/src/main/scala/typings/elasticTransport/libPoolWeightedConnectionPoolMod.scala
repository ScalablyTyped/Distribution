package typings.elasticTransport

import typings.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPoolWeightedConnectionPoolMod {
  
  @JSImport("@elastic/transport/lib/pool/WeightedConnectionPool", JSImport.Default)
  @js.native
  open class default protected () extends WeightedConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @js.native
  trait WeightedConnectionPool
    extends typings.elasticTransport.libPoolBaseConnectionPoolMod.default {
    
    var currentWeight: Double = js.native
    
    var greatestCommonDivisor: Double = js.native
    
    var index: Double = js.native
    
    var maxWeight: Double = js.native
  }
}
