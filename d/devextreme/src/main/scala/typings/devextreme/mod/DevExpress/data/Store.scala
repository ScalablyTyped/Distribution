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
  /** @name Store.byKey(key) */
  def byKey(key: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double): Promise[_] with JQueryPromise[_] = js.native
  /** @name Store.insert(values) */
  def insert(values: js.Any): Promise[_] with JQueryPromise[_] = js.native
  /** @name Store.key() */
  def key(): js.Any = js.native
  /** @name Store.keyOf(obj) */
  def keyOf(obj: js.Any): js.Any = js.native
  /** @name Store.load() */
  def load(): Promise[_] with JQueryPromise[_] = js.native
  /** @name Store.load(options) */
  def load(options: LoadOptions): Promise[_] with JQueryPromise[_] = js.native
  /** @name EventsMixin.off(eventName) */
  def off(eventName: String): this.type = js.native
  /** @name EventsMixin.off(eventName, eventHandler) */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name EventsMixin.on(eventName, eventHandler) */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name EventsMixin.on(events) */
  def on(events: js.Any): this.type = js.native
  /** @name Store.push(changes) */
  def push(changes: js.Array[_]): Unit = js.native
  def remove(key: String): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name Store.remove(key) */
  def remove(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def remove(key: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name Store.totalCount(options) */
  def totalCount(obj: AnonFilter): Promise[Double] with JQueryPromise[Double] = js.native
  def update(key: String, values: js.Any): Promise[_] with JQueryPromise[_] = js.native
  /** @name Store.update(key, values) */
  def update(key: js.Any, values: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def update(key: Double, values: js.Any): Promise[_] with JQueryPromise[_] = js.native
}

