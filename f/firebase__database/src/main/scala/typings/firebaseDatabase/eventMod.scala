package typings.firebaseDatabase

import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.eventRegistrationMod.EventRegistration
import typings.firebaseDatabase.pathMod.Path
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("@firebase/database/dist/src/core/view/Event", "CancelEvent")
  @js.native
  class CancelEvent protected ()
    extends StObject
       with Event {
    /**
      * @param {EventRegistration} eventRegistration
      * @param {Error} error
      * @param {!Path} path
      */
    def this(eventRegistration: EventRegistration, error: Error, path: Path) = this()
    
    var error: Error = js.native
    
    var eventRegistration: EventRegistration = js.native
    
    /**
      * @return {!function()}
      */
    /* CompleteClass */
    override def getEventRunner(): js.Function0[Unit] = js.native
    
    /**
      * @return {!string}
      */
    /* CompleteClass */
    override def getEventType(): String = js.native
    
    /**
      * @return {!Path}
      */
    /* CompleteClass */
    override def getPath(): Path = js.native
    
    var path: Path = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/Event", "DataEvent")
  @js.native
  class DataEvent protected ()
    extends StObject
       with Event {
    /**
      * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
      * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
      * @param {!DataSnapshot} snapshot The data backing the event
      * @param {?string=} prevName Optional, the name of the previous child for child_* events.
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
    
    /**
      * @return {!function()}
      */
    /* CompleteClass */
    override def getEventRunner(): js.Function0[Unit] = js.native
    
    /**
      * @return {!string}
      */
    /* CompleteClass */
    override def getEventType(): String = js.native
    
    /**
      * @return {!Path}
      */
    /* CompleteClass */
    override def getPath(): Path = js.native
    
    var prevName: js.UndefOr[String | Null] = js.native
    
    var snapshot: DataSnapshot = js.native
  }
  
  trait Event extends StObject {
    
    /**
      * @return {!function()}
      */
    def getEventRunner(): js.Function0[Unit]
    
    /**
      * @return {!string}
      */
    def getEventType(): String
    
    /**
      * @return {!Path}
      */
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
    - typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added
    - typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed
    - typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved
    - typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed
  */
  trait EventType extends StObject
  object EventType {
    
    inline def Spacechild_added: typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added = (" child_added").asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_added]
    
    inline def Spacechild_changed: typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed = (" child_changed").asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_changed]
    
    inline def Spacechild_moved: typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved = (" child_moved").asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_moved]
    
    inline def Spacechild_removed: typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed = (" child_removed").asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.Spacechild_removed]
    
    inline def value: typings.firebaseDatabase.firebaseDatabaseStrings.value = "value".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.value]
  }
}
