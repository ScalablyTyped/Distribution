package typings.emberDashData.emberDashDataMod.DS

import typings.rsvp.rsvpMod.default.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An RecordReference is a low level API that allows users and
  * addon author to perform meta-operations on a record.
  */
@JSImport("ember-data", "DS.RecordReference")
@js.native
class RecordReference[T /* <: Model */] () extends js.Object {
  /**
    * The `id` of the record that this reference refers to.
    */
  def id(): String = js.native
  /**
    * Triggers a fetch for the backing entity based on its `remoteType`
    * (see `remoteType` definitions per reference type).
    */
  def load(): PromiseObject[T] with T = js.native
  def push(payload: js.Object): PromiseObject[T] with T = js.native
  /**
    * This API allows you to provide a reference with new data. The
    * simplest usage of this API is similar to `store.push`: you provide a
    * normalized hash of data and the object represented by the reference
    * will update.
    */
  def push(payload: Promise[_]): PromiseObject[T] with T = js.native
  /**
    * Reloads the record if it is already loaded. If the record is not
    * loaded it will load the record via `store.findRecord`
    */
  def reload(): PromiseObject[T] with T = js.native
  /**
    * How the reference will be looked up when it is loaded: Currently
    * this always return `identity` to signifying that a record will be
    * loaded by the `type` and `id`.
    */
  def remoteType(): String = js.native
  /**
    * If the entity referred to by the reference is already loaded, it is
    * present as `reference.value`. Otherwise the value returned by this function
    * is `null`.
    */
  def value(): T | Null = js.native
}

