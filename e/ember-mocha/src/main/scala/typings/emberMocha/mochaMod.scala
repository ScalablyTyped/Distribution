package typings.emberMocha

import typings.emberTestHelpers.mod.TestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("mocha", JSImport.Namespace)
@js.native
object mochaMod extends js.Object {
  // augment test callback context
  type Context = TestContext
}

