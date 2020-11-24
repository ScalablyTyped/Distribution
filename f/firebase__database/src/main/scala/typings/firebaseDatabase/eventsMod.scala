package typings.firebaseDatabase

import typings.firebaseDatabase.anon.AddExpectedEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/test/helpers/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  def eventCleanup(): Unit = js.native
  
  var eventCleanupHandlers: js.Array[js.Any] = js.native
  
  def eventTestHelper(pathAndEvents: js.Any): AddExpectedEvents = js.native
  def eventTestHelper(pathAndEvents: js.Any, helperName: js.Any): AddExpectedEvents = js.native
}
