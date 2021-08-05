package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer-when-downgrade`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`origin-when-cross-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`same-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin-when-cross-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin`
import typings.devtoolsProtocol.devtoolsProtocolStrings.`unsafe-url`
import typings.devtoolsProtocol.devtoolsProtocolStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`unsafe-url`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer-when-downgrade`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.origin
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`origin-when-cross-origin`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`same-origin`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin`
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin-when-cross-origin`
*/
trait RequestReferrerPolicy extends StObject
object RequestReferrerPolicy {
  
  inline def NoReferrer: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  inline def NoReferrerWhenDowngrade: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  inline def Origin: origin = "origin".asInstanceOf[origin]
  
  inline def OriginWhenCrossOrigin: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  inline def SameOrigin: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  inline def StrictOrigin: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  inline def StrictOriginWhenCrossOrigin: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  inline def UnsafeUrl: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
}
