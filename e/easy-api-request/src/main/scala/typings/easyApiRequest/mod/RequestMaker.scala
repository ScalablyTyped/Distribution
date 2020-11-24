package typings.easyApiRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMaker extends js.Object {
  
  def apply(): CBPromiseRequest = js.native
  def apply(stream: Boolean): StreamRequest | CBPromiseRequest = js.native
}
