package typings.elasticTransport

import typings.elasticTransport.anon.ALIVE
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.elasticTransport.libConnectionBaseConnectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionMod {
  
  @JSImport("@elastic/transport/lib/connection", "BaseConnection")
  @js.native
  open class BaseConnection protected () extends default {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object BaseConnection {
    
    @JSImport("@elastic/transport/lib/connection", "BaseConnection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport/lib/connection", "BaseConnection.statuses")
    @js.native
    def statuses: ALIVE = js.native
    inline def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/transport/lib/connection", "HttpConnection")
  @js.native
  open class HttpConnection protected ()
    extends typings.elasticTransport.libConnectionHttpConnectionMod.default {
    def this(opts: ConnectionOptions) = this()
  }
  
  @JSImport("@elastic/transport/lib/connection", "UndiciConnection")
  @js.native
  open class UndiciConnection protected ()
    extends typings.elasticTransport.libConnectionUndiciConnectionMod.default {
    def this(opts: ConnectionOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticTransport.libConnectionBaseConnectionMod.default
    - typings.elasticTransport.libConnectionHttpConnectionMod.default
    - typings.elasticTransport.libConnectionUndiciConnectionMod.default
  */
  trait Connection extends StObject
}
