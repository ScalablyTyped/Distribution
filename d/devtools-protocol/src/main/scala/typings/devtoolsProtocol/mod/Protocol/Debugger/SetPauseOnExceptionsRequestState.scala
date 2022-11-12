package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.all
import typings.devtoolsProtocol.devtoolsProtocolStrings.caught
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import typings.devtoolsProtocol.devtoolsProtocolStrings.uncaught
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.none_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.caught
  - typings.devtoolsProtocol.devtoolsProtocolStrings.uncaught
  - typings.devtoolsProtocol.devtoolsProtocolStrings.all
*/
trait SetPauseOnExceptionsRequestState extends StObject
object SetPauseOnExceptionsRequestState {
  
  inline def All: all = "all".asInstanceOf[all]
  
  inline def Caught: caught = "caught".asInstanceOf[caught]
  
  inline def None: none_ = "none".asInstanceOf[none_]
  
  inline def Uncaught: uncaught = "uncaught".asInstanceOf[uncaught]
}
