package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.canceled
import typings.devtoolsProtocol.devtoolsProtocolStrings.completed
import typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.inProgress
  - typings.devtoolsProtocol.devtoolsProtocolStrings.completed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.canceled
*/
trait DownloadProgressEventState extends js.Object
object DownloadProgressEventState {
  
  @scala.inline
  def Canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @scala.inline
  def Completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def InProgress: inProgress = "inProgress".asInstanceOf[inProgress]
}
