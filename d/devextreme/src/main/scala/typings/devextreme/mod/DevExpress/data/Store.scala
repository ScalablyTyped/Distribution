package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonFilter
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  def byKey(key: String): Promise[_] with JQueryPromise[_] = js.native
  /** Gets a data item with a specific key. */
  def byKey(key: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double): Promise[_] with JQueryPromise[_] = js.native
  /** Adds a data item to the store. */
  def insert(values: js.Any): Promise[_] with JQueryPromise[_] = js.native
  /** Gets the key property (or properties) as specified in the key option. */
  def key(): js.Any = js.native
  /** Gets a data item's key value. */
  def keyOf(obj: js.Any): js.Any = js.native
  /** Starts loading data. */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  /** Starts loading data. */
  def load(options: LoadOptions): Promise[_] with JQueryPromise[_] = js.native
  /** Detaches all event handlers from a single event. */
  def off(eventName: String): this.type = js.native
  /** Detaches a particular event handler from a single event. */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to an event. */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** Subscribes to events. */
  def on(events: js.Any): this.type = js.native
  /** Pushes data changes to the store and notifies the DataSource. */
  def push(changes: js.Array[_]): Unit = js.native
  def remove(key: String): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Removes a data item with a specific key from the store. */
  def remove(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def remove(key: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Gets the total count of items the load() function returns. */
  def totalCount(obj: AnonFilter): Promise[Double] with JQueryPromise[Double] = js.native
  def update(key: String, values: js.Any): Promise[_] with JQueryPromise[_] = js.native
  /** Updates a data item with a specific key. */
  def update(key: js.Any, values: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def update(key: Double, values: js.Any): Promise[_] with JQueryPromise[_] = js.native
}

