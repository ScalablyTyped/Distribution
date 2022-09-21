package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.devtoolsProtocolStrings.allowAndName
import typings.devtoolsProtocol.devtoolsProtocolStrings.allow_
import typings.devtoolsProtocol.devtoolsProtocolStrings.default_
import typings.devtoolsProtocol.devtoolsProtocolStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.deny
  - typings.devtoolsProtocol.devtoolsProtocolStrings.allow_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.allowAndName
  - typings.devtoolsProtocol.devtoolsProtocolStrings.default_
*/
trait SetDownloadBehaviorRequestBehavior extends StObject
object SetDownloadBehaviorRequestBehavior {
  
  inline def Allow: allow_ = "allow".asInstanceOf[allow_]
  
  inline def AllowAndName: allowAndName = "allowAndName".asInstanceOf[allowAndName]
  
  inline def Default: default_ = "default".asInstanceOf[default_]
  
  inline def Deny: deny = "deny".asInstanceOf[deny]
}
