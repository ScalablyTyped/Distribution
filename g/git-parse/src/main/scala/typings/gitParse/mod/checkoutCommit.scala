package typings.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-parse", "checkoutCommit")
@js.native
object checkoutCommit extends js.Object {
  
  def apply(pathToRepo: String, hash: String): js.Promise[Unit] = js.native
  def apply(pathToRepo: String, hash: String, options: CheckoutCommmitOptions): js.Promise[Unit] = js.native
}
