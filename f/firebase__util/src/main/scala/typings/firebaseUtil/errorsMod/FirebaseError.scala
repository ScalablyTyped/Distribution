package typings.firebaseUtil.errorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/errors", "FirebaseError")
@js.native
class FirebaseError protected ()
  extends ErrorData
     with Error {
  def this(code: String, message: String) = this()
  val code: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  val name_FirebaseError: typings.firebaseUtil.firebaseUtilStrings.FirebaseError = js.native
}

