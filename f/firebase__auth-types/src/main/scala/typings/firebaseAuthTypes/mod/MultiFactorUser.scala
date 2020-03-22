package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiFactorUser extends js.Object {
  var enrolledFactors: js.Array[MultiFactorInfo] = js.native
  def enroll(assertion: MultiFactorAssertion): js.Promise[Unit] = js.native
  def enroll(assertion: MultiFactorAssertion, displayName: String): js.Promise[Unit] = js.native
  def getSession(): js.Promise[MultiFactorSession] = js.native
  def unenroll(option: String): js.Promise[Unit] = js.native
  def unenroll(option: MultiFactorInfo): js.Promise[Unit] = js.native
}

