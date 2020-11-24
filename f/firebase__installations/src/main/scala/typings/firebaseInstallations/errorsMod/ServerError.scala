package typings.firebaseInstallations.errorsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @firebase/util.@firebase/util.FirebaseError & {  customData :@firebase/installations.@firebase/installations/dist/src/util/errors.ServerErrorData} */
@js.native
trait ServerError extends js.Object {
  
  val code: String = js.native
  
  var customData: (js.UndefOr[Record[String, _]]) with ServerErrorData = js.native
  
  var message: String = js.native
  
  val name: /* "FirebaseError" */ String = js.native
  
  var stack: js.UndefOr[String] = js.native
}
