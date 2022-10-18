package typings.elasticTransport

import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.undici.mod.Pool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionUndiciConnectionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.elasticTransport.libConnectionMod.Connection because Already inherited */ @JSImport("@elastic/transport/lib/connection/UndiciConnection", JSImport.Default)
  @js.native
  open class default protected () extends Connection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @js.native
  trait Connection
    extends typings.elasticTransport.libConnectionBaseConnectionMod.default {
    
    var pool: Pool = js.native
  }
}
