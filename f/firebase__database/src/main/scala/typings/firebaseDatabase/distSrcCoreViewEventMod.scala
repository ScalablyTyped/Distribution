package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.firebaseDatabase.distSrcCoreViewEventRegistrationMod.EventRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewEventMod {
  
  @JSImport("@firebase/database/dist/src/core/view/Event", "CancelEvent")
  @js.native
  open class CancelEvent protected ()
    extends StObject
       with Event {
    def this(eventRegistration: EventRegistration, error: js.Error, path: Path) = this()
    
    var error: js.Error = js.native
    
    var eventRegistration: EventRegistration = js.native
    
    /* CompleteClass */
    override def getEventRunner(): js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def getEventType(): String = js.native
    
    /* CompleteClass */
    override def getPath(): Path = js.native
    
    var path: Path = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/Event", "DataEvent")
  @js.native
  open class DataEvent protected ()
    extends StObject
       with Event {
    /**
      * @param eventType - One of: value, child_added, child_changed, child_moved, child_removed
      * @param eventRegistration - The function to call to with the event data. User provided
      * @param snapshot - The data backing the event
      * @param prevName - Optional, the name of the previous child for child_* events.
      */
    def this(eventType: EventType, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
    def this(
      eventType: EventType,
      eventRegistration: EventRegistration,
      snapshot: DataSnapshot,
      prevName: String
    ) = this()
    
    var eventRegistration: EventRegistration = js.native
    
    var eventType: EventType = js.native
    
    /* CompleteClass */
    override def getEventRunner(): js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def getEventType(): String = js.native
    
    /* CompleteClass */
    override def getPath(): Path = js.native
    
    var prevName: js.UndefOr[String | Null] = js.native
    
    var snapshot: DataSnapshot = js.native
  }
  
  trait Event extends StObject {
    
    def getEventRunner(): js.Function0[Unit]
    
    def getEventType(): String
    
    def getPath(): Path
  }
  object Event {
    
    inline def apply(getEventRunner: () => js.Function0[Unit], getEventType: () => String, getPath: () => Path): Event = {
      val __obj = js.Dynamic.literal(getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath))
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setGetEventRunner(value: () => js.Function0[Unit]): Self = StObject.set(x, "getEventRunner", js.Any.fromFunction0(value))
      
      inline def setGetEventType(value: () => String): Self = StObject.set(x, "getEventType", js.Any.fromFunction0(value))
      
      inline def setGetPath(value: () => Path): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseDatabase.firebaseDatabaseStrings.value
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_added
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_changed
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_moved
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_removed
  */
  trait EventType extends StObject
  object EventType {
    
    inline def child_added: typings.firebaseDatabase.firebaseDatabaseStrings.child_added = "child_added".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_added]
    
    inline def child_changed: typings.firebaseDatabase.firebaseDatabaseStrings.child_changed = "child_changed".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_changed]
    
    inline def child_moved: typings.firebaseDatabase.firebaseDatabaseStrings.child_moved = "child_moved".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_moved]
    
    inline def child_removed: typings.firebaseDatabase.firebaseDatabaseStrings.child_removed = "child_removed".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_removed]
    
    inline def value: typings.firebaseDatabase.firebaseDatabaseStrings.value = "value".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.value]
  }
}
