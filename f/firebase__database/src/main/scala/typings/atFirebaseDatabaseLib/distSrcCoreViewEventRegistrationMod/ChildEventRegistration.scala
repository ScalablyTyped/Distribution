package typings
package atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ChildEventRegistration")
@js.native
class ChildEventRegistration () extends EventRegistration {
  def this(`callbacks_`: org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* d */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, 
        /* s */ js.UndefOr[java.lang.String | scala.Null], 
        scala.Unit
      ]
    ]) = this()
  /**
    * @param {?Object.<string, function(!DataSnapshot, ?string=)>} callbacks_
    * @param {?function(Error)} cancelCallback_
    * @param {Object=} context_
    */
  def this(`callbacks_`: org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* d */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, 
        /* s */ js.UndefOr[java.lang.String | scala.Null], 
        scala.Unit
      ]
    ], `cancelCallback_`: js.Function1[/* e */ stdLib.Error, scala.Unit]) = this()
  def this(`callbacks_`: scala.Null, `cancelCallback_`: js.Function1[/* e */ stdLib.Error, scala.Unit]) = this()
  def this(`callbacks_`: org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* d */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, 
        /* s */ js.UndefOr[java.lang.String | scala.Null], 
        scala.Unit
      ]
    ], `cancelCallback_`: js.Function1[/* e */ stdLib.Error, scala.Unit], `context_`: js.Object) = this()
  def this(`callbacks_`: org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* d */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, 
        /* s */ js.UndefOr[java.lang.String | scala.Null], 
        scala.Unit
      ]
    ], `cancelCallback_`: scala.Null, `context_`: js.Object) = this()
  def this(`callbacks_`: scala.Null, `cancelCallback_`: js.Function1[/* e */ stdLib.Error, scala.Unit], `context_`: js.Object) = this()
  def this(`callbacks_`: scala.Null, `cancelCallback_`: scala.Null, `context_`: js.Object) = this()
  var `callbacks_`: js.Any = js.native
  var `cancelCallback_`: js.Any = js.native
  var `context_`: js.UndefOr[js.Any] = js.native
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  /* CompleteClass */
  override def createCancelEvent(error: stdLib.Error, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreViewEventMod.CancelEvent | scala.Null = js.native
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  /* CompleteClass */
  override def createEvent(
    change: atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change,
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query
  ): atFirebaseDatabaseLib.distSrcCoreViewEventMod.Event = js.native
  /**
    * @inheritDoc
    */
  def getEventRunner(eventData: atFirebaseDatabaseLib.distSrcCoreViewEventMod.CancelEvent): js.Function0[scala.Unit] = js.native
  def getEventRunner(eventData: atFirebaseDatabaseLib.distSrcCoreViewEventMod.DataEvent): js.Function0[scala.Unit] = js.native
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  /* CompleteClass */
  override def getEventRunner(eventData: atFirebaseDatabaseLib.distSrcCoreViewEventMod.Event): js.Function0[scala.Unit] = js.native
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  /* CompleteClass */
  override def hasAnyCallback(): scala.Boolean = js.native
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  /* CompleteClass */
  override def matches(other: EventRegistration): scala.Boolean = js.native
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  /* CompleteClass */
  override def respondsTo(eventType: java.lang.String): scala.Boolean = js.native
}

