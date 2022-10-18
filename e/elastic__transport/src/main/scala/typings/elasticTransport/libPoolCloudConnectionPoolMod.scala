package typings.elasticTransport

import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPoolCloudConnectionPoolMod {
  
  @JSImport("@elastic/transport/lib/pool/CloudConnectionPool", JSImport.Default)
  @js.native
  open class default protected () extends CloudConnectionPool {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @js.native
  trait CloudConnectionPool
    extends typings.elasticTransport.libPoolBaseConnectionPoolMod.default {
    
    var cloudConnection: Connection | Null = js.native
  }
}
