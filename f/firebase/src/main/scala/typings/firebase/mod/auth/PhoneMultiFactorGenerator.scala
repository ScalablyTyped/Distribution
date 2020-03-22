package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class used to initialize {@link firebase.auth.PhoneMultiFactorAssertion}.
  */
@JSImport("firebase", "auth.PhoneMultiFactorGenerator")
@js.native
class PhoneMultiFactorGenerator protected () extends js.Object

/* static members */
@JSImport("firebase", "auth.PhoneMultiFactorGenerator")
@js.native
object PhoneMultiFactorGenerator extends js.Object {
  /**
    * The identifier of the phone second factor: `phone`.
    */
  var FACTOR_ID: String = js.native
  /**
    * Initializes the {@link firebase.auth.PhoneMultiFactorAssertion} to confirm ownership
    * of the phone second factor.
    */
  def assertion(phoneAuthCredential: PhoneAuthCredential): PhoneMultiFactorAssertion = js.native
}

