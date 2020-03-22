package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for asserting ownership of a second factor. This is used to
  * facilitate enrollment of a second factor on an existing user
  * or sign-in of a user who already verified the first factor.
  *
  */
@JSImport("firebase", "auth.MultiFactorAssertion")
@js.native
abstract class MultiFactorAssertion () extends js.Object {
  /**
    * The identifier of the second factor.
    */
  var factorId: String = js.native
}

