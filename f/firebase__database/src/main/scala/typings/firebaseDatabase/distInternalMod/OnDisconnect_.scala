package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/internal", "OnDisconnect")
@js.native
open class OnDisconnect_ protected () extends StObject {
  /** @hideconstructor */
  def this(_repo: Repo, _path: Path) = this()
  
  /* private */ var _path: Any = js.native
  
  /* private */ var _repo: Any = js.native
  
  /**
    * Cancels all previously queued `onDisconnect()` set or update events for this
    * location and all children.
    *
    * If a write has been queued for this location via a `set()` or `update()` at a
    * parent location, the write at this location will be canceled, though writes
    * to sibling locations will still occur.
    *
    * @returns Resolves when synchronization to the server is complete.
    */
  def cancel(): js.Promise[Unit] = js.native
  
  /**
    * Ensures the data at this location is deleted when the client is disconnected
    * (due to closing the browser, navigating to a new page, or network issues).
    *
    * @returns Resolves when synchronization to the server is complete.
    */
  def remove(): js.Promise[Unit] = js.native
  
  /**
    * Ensures the data at this location is set to the specified value when the
    * client is disconnected (due to closing the browser, navigating to a new page,
    * or network issues).
    *
    * `set()` is especially useful for implementing "presence" systems, where a
    * value should be changed or cleared when a user disconnects so that they
    * appear "offline" to other users. See
    * {@link https://firebase.google.com/docs/database/web/offline-capabilities | Enabling Offline Capabilities in JavaScript}
    * for more information.
    *
    * Note that `onDisconnect` operations are only triggered once. If you want an
    * operation to occur each time a disconnect occurs, you'll need to re-establish
    * the `onDisconnect` operations each time.
    *
    * @param value - The value to be written to this location on disconnect (can
    * be an object, array, string, number, boolean, or null).
    * @returns Resolves when synchronization to the Database is complete.
    */
  def set(value: Any): js.Promise[Unit] = js.native
  
  /**
    * Ensures the data at this location is set to the specified value and priority
    * when the client is disconnected (due to closing the browser, navigating to a
    * new page, or network issues).
    *
    * @param value - The value to be written to this location on disconnect (can
    * be an object, array, string, number, boolean, or null).
    * @param priority - The priority to be written (string, number, or null).
    * @returns Resolves when synchronization to the Database is complete.
    */
  def setWithPriority(value: Any): js.Promise[Unit] = js.native
  def setWithPriority(value: Any, priority: String): js.Promise[Unit] = js.native
  def setWithPriority(value: Any, priority: Double): js.Promise[Unit] = js.native
  
  /**
    * Writes multiple values at this location when the client is disconnected (due
    * to closing the browser, navigating to a new page, or network issues).
    *
    * The `values` argument contains multiple property-value pairs that will be
    * written to the Database together. Each child property can either be a simple
    * property (for example, "name") or a relative path (for example, "name/first")
    * from the current location to the data to update.
    *
    * As opposed to the `set()` method, `update()` can be use to selectively update
    * only the referenced properties at the current location (instead of replacing
    * all the child properties at the current location).
    *
    * @param values - Object containing multiple values.
    * @returns Resolves when synchronization to the Database is complete.
    */
  def update(values: js.Object): js.Promise[Unit] = js.native
}
