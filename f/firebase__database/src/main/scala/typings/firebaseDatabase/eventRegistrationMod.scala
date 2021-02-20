package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.changeMod.Change
import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.eventMod.CancelEvent
import typings.firebaseDatabase.eventMod.DataEvent
import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventRegistrationMod {
  
  @JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ChildEventRegistration")
  @js.native
  /**
    * @param {?Object.<string, function(!DataSnapshot, ?string=)>} callbacks_
    * @param {?function(Error)} cancelCallback_
    * @param {Object=} context_
    */
  class ChildEventRegistration () extends EventRegistration {
    def this(callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]]) = this()
    def this(
      callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
      cancelCallback_ : js.Function1[/* e */ Error, Unit]
    ) = this()
    def this(callbacks_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit]) = this()
    def this(
      callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
      cancelCallback_ : js.Function1[/* e */ Error, Unit],
      context_ : js.Object
    ) = this()
    def this(
      callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
      cancelCallback_ : Null,
      context_ : js.Object
    ) = this()
    def this(callbacks_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit], context_ : js.Object) = this()
    def this(callbacks_ : Null, cancelCallback_ : Null, context_ : js.Object) = this()
    
    var callbacks_ : js.Any = js.native
    
    var cancelCallback_ : js.Any = js.native
    
    var context_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
    def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ValueEventRegistration")
  @js.native
  /**
    * @param {?function(!DataSnapshot)} callback_
    * @param {?function(Error)} cancelCallback_
    * @param {?Object} context_
    */
  class ValueEventRegistration () extends EventRegistration {
    def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit]) = this()
    def this(
      callback_ : js.Function1[/* d */ DataSnapshot, Unit],
      cancelCallback_ : js.Function1[/* e */ Error, Unit]
    ) = this()
    def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit]) = this()
    def this(
      callback_ : js.Function1[/* d */ DataSnapshot, Unit],
      cancelCallback_ : js.Function1[/* e */ Error, Unit],
      context_ : js.Object
    ) = this()
    def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit], cancelCallback_ : Null, context_ : js.Object) = this()
    def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit], context_ : js.Object) = this()
    def this(callback_ : Null, cancelCallback_ : Null, context_ : js.Object) = this()
    
    var callback_ : js.Any = js.native
    
    var cancelCallback_ : js.Any = js.native
    
    var context_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
    def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
  }
  
  @js.native
  trait EventRegistration extends StObject {
    
    /**
      * @param {!Error} error
      * @param {!Path} path
      * @return {?CancelEvent}
      */
    def createCancelEvent(error: Error, path: Path): CancelEvent | Null = js.native
    
    /**
      * @param {!Change} change
      * @param {!Query} query
      * @return {!Event}
      */
    def createEvent(change: Change, query: Query): Event = js.native
    
    /**
      * Given event data, return a function to trigger the user's callback
      * @param {!Event} eventData
      * @return {function()}
      */
    def getEventRunner(eventData: Event): js.Function0[Unit] = js.native
    
    /**
      * False basically means this is a "dummy" callback container being used as a sentinel
      * to remove all callback containers of a particular type.  (e.g. if the user does
      * ref.off('value') without specifying a specific callback).
      *
      * (TODO: Rework this, since it's hacky)
      *
      * @return {boolean}
      */
    def hasAnyCallback(): Boolean = js.native
    
    /**
      * @param {!EventRegistration} other
      * @return {boolean}
      */
    def matches(other: EventRegistration): Boolean = js.native
    
    /**
      * True if this container has a callback to trigger for this event type
      * @param {!string} eventType
      * @return {boolean}
      */
    def respondsTo(eventType: String): Boolean = js.native
  }
  object EventRegistration {
    
    @scala.inline
    def apply(
      createCancelEvent: (Error, Path) => CancelEvent | Null,
      createEvent: (Change, Query) => Event,
      getEventRunner: Event => js.Function0[Unit],
      hasAnyCallback: () => Boolean,
      matches: EventRegistration => Boolean,
      respondsTo: String => Boolean
    ): EventRegistration = {
      val __obj = js.Dynamic.literal(createCancelEvent = js.Any.fromFunction2(createCancelEvent), createEvent = js.Any.fromFunction2(createEvent), getEventRunner = js.Any.fromFunction1(getEventRunner), hasAnyCallback = js.Any.fromFunction0(hasAnyCallback), matches = js.Any.fromFunction1(matches), respondsTo = js.Any.fromFunction1(respondsTo))
      __obj.asInstanceOf[EventRegistration]
    }
    
    @scala.inline
    implicit class EventRegistrationMutableBuilder[Self <: EventRegistration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateCancelEvent(value: (Error, Path) => CancelEvent | Null): Self = StObject.set(x, "createCancelEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateEvent(value: (Change, Query) => Event): Self = StObject.set(x, "createEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetEventRunner(value: Event => js.Function0[Unit]): Self = StObject.set(x, "getEventRunner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasAnyCallback(value: () => Boolean): Self = StObject.set(x, "hasAnyCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMatches(value: EventRegistration => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRespondsTo(value: String => Boolean): Self = StObject.set(x, "respondsTo", js.Any.fromFunction1(value))
    }
  }
}
