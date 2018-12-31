package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

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
  var properties: js.UndefOr[stdLib.Record[java.lang.String, Value]] = js.undefined
}

