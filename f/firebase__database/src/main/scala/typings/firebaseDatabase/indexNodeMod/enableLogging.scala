package typings.firebaseDatabase.indexNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "enableLogging")
@js.native
object enableLogging extends js.Object {
  def apply(): Unit = js.native
  def apply(logger_ : js.Function1[/* a */ String, Unit]): Unit = js.native
  def apply(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = js.native
  def apply(logger_ : Boolean): Unit = js.native
  def apply(logger_ : Boolean, persistent: Boolean): Unit = js.native
}

