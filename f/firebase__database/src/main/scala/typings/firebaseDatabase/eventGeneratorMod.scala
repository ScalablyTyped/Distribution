package typings.firebaseDatabase

import typings.firebaseDatabase.changeMod.Change
import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.eventRegistrationMod.EventRegistration
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.queryMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventGeneratorMod {
  
  @JSImport("@firebase/database/dist/src/core/view/EventGenerator", "EventGenerator")
  @js.native
  class EventGenerator protected () extends StObject {
    /**
      *
      * @param {!Query} query_
      */
    def this(query_ : Query) = this()
    
    /**
      * @param {!Change} a
      * @param {!Change} b
      * @return {number}
      * @private
      */
    var compareChanges_ : js.Any = js.native
    
    /**
      * Given a set of raw changes (no moved events and prevName not specified yet), and a set of
      * EventRegistrations that should be notified of these changes, generate the actual events to be raised.
      *
      * Notes:
      *  - child_moved events will be synthesized at this time for any child_changed events that affect
      *    our index.
      *  - prevName will be calculated based on the index ordering.
      *
      * @param {!Array.<!Change>} changes
      * @param {!Node} eventCache
      * @param {!Array.<!EventRegistration>} eventRegistrations
      * @return {!Array.<!Event>}
      */
    def generateEventsForChanges(changes: js.Array[Change], eventCache: Node, eventRegistrations: js.Array[EventRegistration]): js.Array[Event] = js.native
    
    /**
      * Given changes of a single change type, generate the corresponding events.
      *
      * @param {!Array.<!Event>} events
      * @param {!string} eventType
      * @param {!Array.<!Change>} changes
      * @param {!Array.<!EventRegistration>} registrations
      * @param {!Node} eventCache
      * @private
      */
    var generateEventsForType_ : js.Any = js.native
    
    var index_ : js.Any = js.native
    
    /**
      * @param {!Change} change
      * @param {!Node} eventCache
      * @return {!Change}
      * @private
      */
    var materializeSingleChange_ : js.Any = js.native
    
    var query_ : js.Any = js.native
  }
}
