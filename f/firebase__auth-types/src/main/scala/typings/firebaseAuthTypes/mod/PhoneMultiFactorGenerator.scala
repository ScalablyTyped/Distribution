package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "PhoneMultiFactorGenerator")
@js.native
class PhoneMultiFactorGenerator protected () extends js.Object
/* static members */
@JSImport("@firebase/auth-types", "PhoneMultiFactorGenerator")
@js.native
object PhoneMultiFactorGenerator extends js.Object {
  
  var FACTOR_ID: String = js.native
  
  def assertion(phoneAuthCredential: PhoneAuthCredential): PhoneMultiFactorAssertion = js.native
}
