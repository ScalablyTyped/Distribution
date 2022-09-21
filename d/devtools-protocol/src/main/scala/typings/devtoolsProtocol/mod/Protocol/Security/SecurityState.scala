package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.devtoolsProtocolStrings.insecure_
import typings.devtoolsProtocol.devtoolsProtocolStrings.secure_
import typings.devtoolsProtocol.devtoolsProtocolStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.unknown_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.neutral
  - typings.devtoolsProtocol.devtoolsProtocolStrings.insecure_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.secure_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.info
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`insecure-broken`
*/
trait SecurityState extends StObject
object SecurityState {
  
  inline def info: typings.devtoolsProtocol.devtoolsProtocolStrings.info = "info".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.info]
  
  inline def insecure: insecure_ = "insecure".asInstanceOf[insecure_]
  
  inline def `insecure-broken`: typings.devtoolsProtocol.devtoolsProtocolStrings.`insecure-broken` = "insecure-broken".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.`insecure-broken`]
  
  inline def neutral: typings.devtoolsProtocol.devtoolsProtocolStrings.neutral = "neutral".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.neutral]
  
  inline def secure: secure_ = "secure".asInstanceOf[secure_]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
}
