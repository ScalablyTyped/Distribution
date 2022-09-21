package typings.firebaseAuth.authMod

import typings.firebaseAuth.firebaseAuthStrings.linkViaPopup
import typings.firebaseAuth.firebaseAuthStrings.linkViaRedirect
import typings.firebaseAuth.firebaseAuthStrings.reauthViaPopup
import typings.firebaseAuth.firebaseAuthStrings.reauthViaRedirect
import typings.firebaseAuth.firebaseAuthStrings.signInViaPopup
import typings.firebaseAuth.firebaseAuthStrings.signInViaRedirect
import typings.firebaseAuth.firebaseAuthStrings.unknown
import typings.firebaseAuth.firebaseAuthStrings.verifyApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuth.firebaseAuthStrings.linkViaPopup
  - typings.firebaseAuth.firebaseAuthStrings.linkViaRedirect
  - typings.firebaseAuth.firebaseAuthStrings.reauthViaPopup
  - typings.firebaseAuth.firebaseAuthStrings.reauthViaRedirect
  - typings.firebaseAuth.firebaseAuthStrings.signInViaPopup
  - typings.firebaseAuth.firebaseAuthStrings.signInViaRedirect
  - typings.firebaseAuth.firebaseAuthStrings.unknown
  - typings.firebaseAuth.firebaseAuthStrings.verifyApp
*/
trait AuthEventType extends StObject
object AuthEventType {
  
  inline def LINK_VIA_POPUP: linkViaPopup = "linkViaPopup".asInstanceOf[linkViaPopup]
  
  inline def LINK_VIA_REDIRECT: linkViaRedirect = "linkViaRedirect".asInstanceOf[linkViaRedirect]
  
  inline def REAUTH_VIA_POPUP: reauthViaPopup = "reauthViaPopup".asInstanceOf[reauthViaPopup]
  
  inline def REAUTH_VIA_REDIRECT: reauthViaRedirect = "reauthViaRedirect".asInstanceOf[reauthViaRedirect]
  
  inline def SIGN_IN_VIA_POPUP: signInViaPopup = "signInViaPopup".asInstanceOf[signInViaPopup]
  
  inline def SIGN_IN_VIA_REDIRECT: signInViaRedirect = "signInViaRedirect".asInstanceOf[signInViaRedirect]
  
  inline def UNKNOWN: unknown = "unknown".asInstanceOf[unknown]
  
  inline def VERIFY_APP: verifyApp = "verifyApp".asInstanceOf[verifyApp]
}
