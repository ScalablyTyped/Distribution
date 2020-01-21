package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "ActionCodeURL")
@js.native
class ActionCodeURL protected () extends js.Object {
  var apiKey: String = js.native
  var code: String = js.native
  var continueUrl: String | Null = js.native
  var languageCode: String | Null = js.native
  var operation: Operation = js.native
  var tenantId: String | Null = js.native
}

/* static members */
@JSImport("@firebase/auth-types", "ActionCodeURL")
@js.native
object ActionCodeURL extends js.Object {
  def parseLink(link: String): ActionCodeURL | Null = js.native
}

