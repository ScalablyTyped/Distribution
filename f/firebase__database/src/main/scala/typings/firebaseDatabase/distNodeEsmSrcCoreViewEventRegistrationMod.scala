package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot
import typings.firebaseDatabase.distNodeEsmSrcCoreRepoMod.Repo
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typings.firebaseDatabase.distNodeEsmSrcCoreViewChangeMod.Change
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.CancelEvent
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.Event
import typings.firebaseDatabase.distNodeEsmSrcCoreViewQueryParamsMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreViewEventRegistrationMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/EventRegistration", "CallbackContext")
  @js.native
  open class CallbackContext protected () extends StObject {
    def this(snapshotCallback: UserCallback) = this()
    def this(snapshotCallback: UserCallback, cancelCallback: js.Function1[/* error */ js.Error, Any]) = this()
    
    /* private */ val cancelCallback: Any = js.native
    
    def hasCancelCallback: Boolean = js.native
    
    def matches(other: CallbackContext): Boolean = js.native
    
    def onCancel(error: js.Error): Unit = js.native
    
    def onValue(expDataSnapshot: DataSnapshot): Unit = js.native
    def onValue(expDataSnapshot: DataSnapshot, previousChildName: String): Unit = js.native
    
    /* private */ val snapshotCallback: Any = js.native
  }
  
  trait EventRegistration extends StObject {
    
    def createCancelEvent(error: js.Error, path: Path): CancelEvent | Null
    
    def createEvent(change: Change, query: QueryContext): Event
    
    /**
      * Given event data, return a function to trigger the user's callback
      */
    def getEventRunner(eventData: Event): js.Function0[Unit]
    
    /**
      * False basically means this is a "dummy" callback container being used as a sentinel
      * to remove all callback containers of a particular type.  (e.g. if the user does
      * ref.off('value') without specifying a specific callback).
      *
      * (TODO: Rework this, since it's hacky)
      *
      */
    def hasAnyCallback(): Boolean
    
    def matches(other: EventRegistration): Boolean
    
    /**
      * True if this container has a callback to trigger for this event type
      */
    def respondsTo(eventType: String): Boolean
  }
  object EventRegistration {
    
    inline def apply(
      createCancelEvent: (js.Error, Path) => CancelEvent | Null,
      createEvent: (Change, QueryContext) => Event,
      getEventRunner: Event => js.Function0[Unit],
      hasAnyCallback: () => Boolean,
      matches: EventRegistration => Boolean,
      respondsTo: String => Boolean
    ): EventRegistration = {
      val __obj = js.Dynamic.literal(createCancelEvent = js.Any.fromFunction2(createCancelEvent), createEvent = js.Any.fromFunction2(createEvent), getEventRunner = js.Any.fromFunction1(getEventRunner), hasAnyCallback = js.Any.fromFunction0(hasAnyCallback), matches = js.Any.fromFunction1(matches), respondsTo = js.Any.fromFunction1(respondsTo))
      __obj.asInstanceOf[EventRegistration]
    }
    
    extension [Self <: EventRegistration](x: Self) {
      
      inline def setCreateCancelEvent(value: (js.Error, Path) => CancelEvent | Null): Self = StObject.set(x, "createCancelEvent", js.Any.fromFunction2(value))
      
      inline def setCreateEvent(value: (Change, QueryContext) => Event): Self = StObject.set(x, "createEvent", js.Any.fromFunction2(value))
      
      inline def setGetEventRunner(value: Event => js.Function0[Unit]): Self = StObject.set(x, "getEventRunner", js.Any.fromFunction1(value))
      
      inline def setHasAnyCallback(value: () => Boolean): Self = StObject.set(x, "hasAnyCallback", js.Any.fromFunction0(value))
      
      inline def setMatches(value: EventRegistration => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setRespondsTo(value: String => Boolean): Self = StObject.set(x, "respondsTo", js.Any.fromFunction1(value))
    }
  }
  
  trait QueryContext extends StObject {
    
    val _path: Path
    
    val _queryIdentifier: String
    
    val _queryObject: js.Object
    
    val _queryParams: QueryParams
    
    val _repo: Repo
  }
  object QueryContext {
    
    inline def apply(
      _path: Path,
      _queryIdentifier: String,
      _queryObject: js.Object,
      _queryParams: QueryParams,
      _repo: Repo
    ): QueryContext = {
      val __obj = js.Dynamic.literal(_path = _path.asInstanceOf[js.Any], _queryIdentifier = _queryIdentifier.asInstanceOf[js.Any], _queryObject = _queryObject.asInstanceOf[js.Any], _queryParams = _queryParams.asInstanceOf[js.Any], _repo = _repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryContext]
    }
    
    extension [Self <: QueryContext](x: Self) {
      
      inline def set_path(value: Path): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
      
      inline def set_queryIdentifier(value: String): Self = StObject.set(x, "_queryIdentifier", value.asInstanceOf[js.Any])
      
      inline def set_queryObject(value: js.Object): Self = StObject.set(x, "_queryObject", value.asInstanceOf[js.Any])
      
      inline def set_queryParams(value: QueryParams): Self = StObject.set(x, "_queryParams", value.asInstanceOf[js.Any])
      
      inline def set_repo(value: Repo): Self = StObject.set(x, "_repo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserCallback extends StObject {
    
    def apply(dataSnapshot: DataSnapshot): Any = js.native
    def apply(dataSnapshot: DataSnapshot, previousChildName: String): Any = js.native
    
    var context: js.UndefOr[js.Object | Null] = js.native
    
    var userCallback: js.UndefOr[Any] = js.native
  }
}
