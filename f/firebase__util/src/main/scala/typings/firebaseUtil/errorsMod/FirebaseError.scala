package typings.firebaseUtil.errorsMod

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/errors", "FirebaseError")
@js.native
class FirebaseError protected () extends Error {
  def this(code: String, message: String) = this()
  def this(code: String, message: String, customData: Record[String, _]) = this()
  
  val code: String = js.native
  
  var customData: js.UndefOr[Record[String, _]] = js.native
}
