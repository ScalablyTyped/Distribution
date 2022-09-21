package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "PhoneMultiFactorGenerator")
@js.native
/* private */ open class PhoneMultiFactorGenerator () extends StObject
/* static members */
object PhoneMultiFactorGenerator {
  
  @JSImport("@firebase/auth-types", "PhoneMultiFactorGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "PhoneMultiFactorGenerator.FACTOR_ID")
  @js.native
  def FACTOR_ID: String = js.native
  inline def FACTOR_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACTOR_ID")(x.asInstanceOf[js.Any])
  
  inline def assertion(phoneAuthCredential: PhoneAuthCredential): PhoneMultiFactorAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(phoneAuthCredential.asInstanceOf[js.Any]).asInstanceOf[PhoneMultiFactorAssertion]
}
