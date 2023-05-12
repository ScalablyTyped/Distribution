package typings.firebaseAuth.distNodeEsmMod

import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.firebaseAuthStrings.totp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FactorId {
  
  /** Phone as second factor */
  @JSImport("@firebase/auth/dist/node-esm", "FactorId.PHONE")
  @js.native
  val PHONE: phone = js.native
  
  @JSImport("@firebase/auth/dist/node-esm", "FactorId.TOTP")
  @js.native
  val TOTP: totp = js.native
}
