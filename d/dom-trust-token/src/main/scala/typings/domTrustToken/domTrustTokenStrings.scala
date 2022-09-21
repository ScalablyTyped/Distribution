package typings.domTrustToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTrustTokenStrings {
  
  @js.native
  sealed trait `headers-only`
    extends StObject
       with SignRequestData
  inline def `headers-only`: `headers-only` = "headers-only".asInstanceOf[`headers-only`]
  
  @js.native
  sealed trait include
    extends StObject
       with SignRequestData
  inline def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait none
    extends StObject
       with RefreshPolicy
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait omit
    extends StObject
       with SignRequestData
  inline def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait refresh
    extends StObject
       with RefreshPolicy
  inline def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait `send-redemption-record`
    extends StObject
       with OperationType
  inline def `send-redemption-record`: `send-redemption-record` = "send-redemption-record".asInstanceOf[`send-redemption-record`]
  
  @js.native
  sealed trait `token-redemption`
    extends StObject
       with OperationType
  inline def `token-redemption`: `token-redemption` = "token-redemption".asInstanceOf[`token-redemption`]
  
  @js.native
  sealed trait `token-request`
    extends StObject
       with OperationType
  inline def `token-request`: `token-request` = "token-request".asInstanceOf[`token-request`]
}
