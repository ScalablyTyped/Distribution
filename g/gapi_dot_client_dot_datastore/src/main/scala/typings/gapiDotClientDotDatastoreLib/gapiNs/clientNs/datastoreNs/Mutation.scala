package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mutation extends js.Object {
  /**
    * The version of the entity that this mutation is being applied to. If this
    * does not match the current version on the server, the mutation conflicts.
    */
  var baseVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key of the entity to delete. The entity may or may not already exist.
    * Must have a complete key path and must not be reserved/read-only.
    */
  var delete: js.UndefOr[Key] = js.undefined
  /**
    * The entity to insert. The entity must not already exist.
    * The entity key's final path element may be incomplete.
    */
  var insert: js.UndefOr[Entity] = js.undefined
  /**
    * The entity to update. The entity must already exist.
    * Must have a complete key path.
    */
  var update: js.UndefOr[Entity] = js.undefined
  /**
    * The entity to upsert. The entity may or may not already exist.
    * The entity key's final path element may be incomplete.
    */
  var upsert: js.UndefOr[Entity] = js.undefined
}

