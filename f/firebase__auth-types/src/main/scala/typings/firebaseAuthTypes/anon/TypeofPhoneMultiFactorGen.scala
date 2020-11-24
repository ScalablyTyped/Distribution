package typings.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseAuthTypes.mod.PhoneAuthCredential
import typings.firebaseAuthTypes.mod.PhoneMultiFactorAssertion
import typings.firebaseAuthTypes.mod.PhoneMultiFactorGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPhoneMultiFactorGen extends Instantiable0[PhoneMultiFactorGenerator] {
  
  var FACTOR_ID: String = js.native
  
  def assertion(phoneAuthCredential: PhoneAuthCredential): PhoneMultiFactorAssertion = js.native
}
