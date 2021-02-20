package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "ActionCodeURL")
@js.native
class ActionCodeURL protected () extends StObject {
  
  var apiKey: String = js.native
  
  var code: String = js.native
  
  var continueUrl: String | Null = js.native
  
  var languageCode: String | Null = js.native
  
  var operation: Operation = js.native
  
  var tenantId: String | Null = js.native
}
/* static members */
object ActionCodeURL {
  
  @JSImport("@firebase/auth-types", "ActionCodeURL.parseLink")
  @js.native
  def parseLink(link: String): ActionCodeURL | Null = js.native
}
