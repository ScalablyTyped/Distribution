package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreViewChangeMod.Change
import typings.firebaseDatabase.distSrcCoreViewEventMod.Event
import typings.firebaseDatabase.distSrcCoreViewEventRegistrationMod.EventRegistration
import typings.firebaseDatabase.distSrcCoreViewEventRegistrationMod.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewEventGeneratorMod {
  
  @JSImport("@firebase/database/dist/src/core/view/EventGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/view/EventGenerator", "EventGenerator")
  @js.native
  open class EventGenerator protected () extends StObject {
    def this(query_ : QueryContext) = this()
    
    var index_ : Index = js.native
    
    var query_ : QueryContext = js.native
  }
  
  inline def eventGeneratorGenerateEventsForChanges(
    eventGenerator: EventGenerator,
    changes: js.Array[Change],
    eventCache: Node,
    eventRegistrations: js.Array[EventRegistration]
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventGeneratorGenerateEventsForChanges")(eventGenerator.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], eventCache.asInstanceOf[js.Any], eventRegistrations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
}
