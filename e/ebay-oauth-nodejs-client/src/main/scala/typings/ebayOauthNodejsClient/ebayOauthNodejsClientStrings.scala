package typings.ebayOauthNodejsClient

import typings.ebayOauthNodejsClient.mod.EbayEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebayOauthNodejsClientStrings {
  
  @js.native
  sealed trait PRODUCTION
    extends StObject
       with EbayEnvironment
  inline def PRODUCTION: PRODUCTION = "PRODUCTION".asInstanceOf[PRODUCTION]
  
  @js.native
  sealed trait SANDBOX
    extends StObject
       with EbayEnvironment
  inline def SANDBOX: SANDBOX = "SANDBOX".asInstanceOf[SANDBOX]
  
  @js.native
  sealed trait consent extends StObject
  inline def consent: consent = "consent".asInstanceOf[consent]
  
  @js.native
  sealed trait login extends StObject
  inline def login: login = "login".asInstanceOf[login]
}
