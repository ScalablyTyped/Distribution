package typings
package atFirebaseUtilLib.distSrcErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/errors", "FirebaseError")
@js.native
class FirebaseError protected ()
  extends ErrorData
     with stdLib.Error {
  def this(code: java.lang.String, message: java.lang.String) = this()
  val code: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  val name_FirebaseError: atFirebaseUtilLib.atFirebaseUtilLibStrings.FirebaseError = js.native
}

