package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.devtoolsProtocolStrings.canceled_
import typings.devtoolsProtocol.devtoolsProtocolStrings.completed
import typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
  - typings.devtoolsProtocol.devtoolsProtocolStrings.completed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.canceled_
*/
trait DownloadProgressEventState extends StObject
object DownloadProgressEventState {
  
  inline def Canceled: canceled_ = "canceled".asInstanceOf[canceled_]
  
  inline def Completed: completed = "completed".asInstanceOf[completed]
  
  inline def InProgress: inProgress = "inProgress".asInstanceOf[inProgress]
}
