package typings.firebaseDatabase

import typings.firebaseDatabase.anon.AddExpectedEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@firebase/database/dist/test/helpers/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def eventCleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eventCleanup")().asInstanceOf[Unit]
  
  @JSImport("@firebase/database/dist/test/helpers/events", "eventCleanupHandlers")
  @js.native
  def eventCleanupHandlers: js.Array[js.Any] = js.native
  @scala.inline
  def eventCleanupHandlers_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventCleanupHandlers")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def eventTestHelper(pathAndEvents: js.Any): AddExpectedEvents = ^.asInstanceOf[js.Dynamic].applyDynamic("eventTestHelper")(pathAndEvents.asInstanceOf[js.Any]).asInstanceOf[AddExpectedEvents]
  @scala.inline
  def eventTestHelper(pathAndEvents: js.Any, helperName: js.Any): AddExpectedEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("eventTestHelper")(pathAndEvents.asInstanceOf[js.Any], helperName.asInstanceOf[js.Any])).asInstanceOf[AddExpectedEvents]
}
