package typings.devcert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/certificates", JSImport.Namespace)
@js.native
object certificatesMod extends js.Object {
  
  def default(domain: String): js.Promise[Unit] = js.native
  
  def generateKey(filename: String): Unit = js.native
}
