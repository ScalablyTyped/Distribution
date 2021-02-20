package typings.emberData.mod.DS

import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A HasManyReference is a low level API that allows users and addon
  * author to perform meta-operations on a has-many relationship.
  */
@JSImport("ember-data", "DS.HasManyReference")
@js.native
class HasManyReference[T] () extends StObject {
  
  /**
    * `ids()` returns an array of the record ids in this relationship.
    */
  def ids(): js.Array[String] = js.native
  
  /**
    * The link Ember Data will use to fetch or reload this has-many
    * relationship.
    */
  def link(): String = js.native
  
  /**
    * Loads the relationship if it is not already loaded.  If the
    * relationship is already loaded this method does not trigger a new
    * load.
    */
  def load(): Promise[_] = js.native
  
  /**
    * The meta data for the has-many relationship.
    */
  def meta(): js.Object = js.native
  
  /**
    * `push` can be used to update the data in the relationship and Ember
    * Data will treat the new data as the canonical value of this
    * relationship on the backend.
    */
  def push(objectOrPromise: js.Array[T]): ManyArray[T] = js.native
  def push(objectOrPromise: Promise[js.Array[T]]): ManyArray[T] = js.native
  
  /**
    * Reloads this has-many relationship.
    */
  def reload(): Promise[_] = js.native
  
  /**
    * This returns a string that represents how the reference will be
    * looked up when it is loaded. If the relationship has a link it will
    * use the "link" otherwise it defaults to "id".
    */
  def remoteType(): String = js.native
  
  /**
    * `value()` synchronously returns the current value of the has-many
    * relationship. Unlike `record.get('relationshipName')`, calling
    * `value()` on a reference does not trigger a fetch if the async
    * relationship is not yet loaded. If the relationship is not loaded
    * it will always return `null`.
    */
  def value(): ManyArray[T] | Null = js.native
}
