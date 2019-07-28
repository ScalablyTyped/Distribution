package typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityResult extends js.Object {
  /**
    * A cursor that points to the position after the result entity.
    * Set only when the `EntityResult` is part of a `QueryResultBatch` message.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /** The resulting entity. */
  var entity: js.UndefOr[Entity] = js.undefined
  /**
    * The version of the entity, a strictly positive number that monotonically
    * increases with changes to the entity.
    *
    * This field is set for `FULL` entity
    * results.
    *
    * For missing entities in `LookupResponse`, this
    * is the version of the snapshot that was used to look up the entity, and it
    * is always set except for eventually consistent reads.
    */
  var version: js.UndefOr[String] = js.undefined
}

object EntityResult {
  @scala.inline
  def apply(cursor: String = null, entity: Entity = null, version: String = null): EntityResult = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[EntityResult]
  }
}

