package typings.firebaseMessaging

import typings.firebaseMessaging.tokenDetailsMod.TokenDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakesTokenDetailsMod {
  
  @JSImport("@firebase/messaging/dist/testing/fakes/token-details", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeTokenDetails(): TokenDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeTokenDetails")().asInstanceOf[TokenDetails]
}
