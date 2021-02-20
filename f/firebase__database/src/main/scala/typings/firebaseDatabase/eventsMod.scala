package typings.firebaseDatabase

import typings.firebaseDatabase.anon.AddExpectedEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@firebase/database/dist/test/helpers/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/events", "eventCleanup")
  @js.native
  def eventCleanup(): Unit = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/events", "eventCleanupHandlers")
  @js.native
  def eventCleanupHandlers: js.Array[js.Any] = js.native
  @scala.inline
  def eventCleanupHandlers_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventCleanupHandlers")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/database/dist/test/helpers/events", "eventTestHelper")
  @js.native
  def eventTestHelper(pathAndEvents: js.Any): AddExpectedEvents = js.native
  @JSImport("@firebase/database/dist/test/helpers/events", "eventTestHelper")
  @js.native
  def eventTestHelper(pathAndEvents: js.Any, helperName: js.Any): AddExpectedEvents = js.native
}
