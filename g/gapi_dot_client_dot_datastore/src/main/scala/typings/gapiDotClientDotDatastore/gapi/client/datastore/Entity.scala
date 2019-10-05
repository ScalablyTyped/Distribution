package typings.gapiDotClientDotDatastore.gapi.client.datastore

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  /**
    * The entity's key.
    *
    * An entity must have a key, unless otherwise documented (for example,
    * an entity in `Value.entity_value` may have no key).
    * An entity's kind is its key path's last element's kind,
    * or null if it has no key.
    */
  var key: js.UndefOr[Key] = js.undefined
  /**
    * The entity's properties.
    * The map's keys are property names.
    * A property name matching regex `__.&#42;__` is reserved.
    * A reserved property name is forbidden in certain documented contexts.
    * The name must not contain more than 500 characters.
    * The name cannot be `""`.
    */
  var properties: js.UndefOr[Record[String, Value]] = js.undefined
}

object Entity {
  @scala.inline
  def apply(key: Key = null, properties: Record[String, Value] = null): Entity = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Entity]
  }
}

