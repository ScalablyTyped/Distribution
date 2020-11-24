package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiFactorUser extends js.Object {
  
  def enroll(assertion: MultiFactorAssertion): js.Promise[Unit] = js.native
  def enroll(assertion: MultiFactorAssertion, displayName: String): js.Promise[Unit] = js.native
  
  var enrolledFactors: js.Array[MultiFactorInfo] = js.native
  
  def getSession(): js.Promise[MultiFactorSession] = js.native
  
  def unenroll(option: String): js.Promise[Unit] = js.native
  def unenroll(option: MultiFactorInfo): js.Promise[Unit] = js.native
}
