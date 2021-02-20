package typings.emberData.mod.DS

import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A BelongsToReference is a low level API that allows users and
  * addon author to perform meta-operations on a belongs-to
  * relationship.
  */
@JSImport("ember-data", "DS.BelongsToReference")
@js.native
class BelongsToReference () extends StObject {
  
  /**
    * The `id` of the record that this reference refers to. Together, the
    * `type()` and `id()` methods form a composite key for the identity
    * map. This can be used to access the id of an async relationship
    * without triggering a fetch that would normally happen if you
    * attempted to use `record.get('relationship.id')`.
    */
  def id(): String = js.native
  
  /**
    * The link Ember Data will use to fetch or reload this belongs-to
    * relationship.
    */
  def link(): String = js.native
  
  /**
    * Loads a record in a belongs to relationship if it is not already
    * loaded. If the relationship is already loaded this method does not
    * trigger a new load.
    */
  def load(): Promise[_] = js.native
  
  /**
    * The meta data for the belongs-to relationship.
    */
  def meta(): js.Object = js.native
  
  /**
    * `push` can be used to update the data in the relationship and Ember
    * Data will treat the new data as the conanical value of this
    * relationship on the backend.
    */
  def push(objectOrPromise: js.Object): Promise[_] = js.native
  def push(objectOrPromise: Promise[_]): Promise[_] = js.native
  
  /**
    * Triggers a reload of the value in this relationship. If the
    * remoteType is `"link"` Ember Data will use the relationship link to
    * reload the relationship. Otherwise it will reload the record by its
    * id.
    */
  def reload(): Promise[_] = js.native
  
  /**
    * This returns a string that represents how the reference will be
    * looked up when it is loaded. If the relationship has a link it will
    * use the "link" otherwise it defaults to "id".
    */
  def remoteType(): String = js.native
  
  /**
    * `value()` synchronously returns the current value of the belongs-to
    * relationship. Unlike `record.get('relationshipName')`, calling
    * `value()` on a reference does not trigger a fetch if the async
    * relationship is not yet loaded. If the relationship is not loaded
    * it will always return `null`.
    */
  def value(): Model | Null = js.native
}
