package typings.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/test/helpers/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  var eventCleanupHandlers: js.Array[js.Any] = js.native
  def eventCleanup(): Unit = js.native
  def eventTestHelper(pathAndEvents: js.Any): AnonAddExpectedEvents = js.native
  def eventTestHelper(pathAndEvents: js.Any, helperName: js.Any): AnonAddExpectedEvents = js.native
}

