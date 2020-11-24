package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "OAuth2Http")
@js.native
class OAuth2Http protected () extends js.Object {
  def this(options: js.Any, storage: js.Any) = this()
  
  def base(): Unit = js.native
  
  def refresh(callback: js.Any): js.Any = js.native
  
  def request(options: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "OAuth2Http")
@js.native
object OAuth2Http extends js.Object {
  
  var AUTHORIZATION_CODE: String = js.native
  
  var COOKIE: String = js.native
  
  var PASSWORD: String = js.native
  
  def Storage(scope: js.Any): js.Any = js.native
  
  var TICKET: String = js.native
  
  var TOKEN: String = js.native
  
  var TOKEN_METHOD: String = js.native
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
