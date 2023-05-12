package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import typings.devtoolsProtocol.devtoolsProtocolStrings.running_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.stopped
  - typings.devtoolsProtocol.devtoolsProtocolStrings.starting
  - typings.devtoolsProtocol.devtoolsProtocolStrings.running_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.stopping
*/
trait ServiceWorkerVersionRunningStatus extends StObject
object ServiceWorkerVersionRunningStatus {
  
  inline def running: running_ = "running".asInstanceOf[running_]
  
  inline def starting: typings.devtoolsProtocol.devtoolsProtocolStrings.starting = "starting".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.starting]
  
  inline def stopped: typings.devtoolsProtocol.devtoolsProtocolStrings.stopped = "stopped".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.stopped]
  
  inline def stopping: typings.devtoolsProtocol.devtoolsProtocolStrings.stopping = "stopping".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.stopping]
}
