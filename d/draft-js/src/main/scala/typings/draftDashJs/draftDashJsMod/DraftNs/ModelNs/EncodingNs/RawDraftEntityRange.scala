package typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.EncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an entity attribution.
  *
  * The `key` value corresponds to the key of the entity in the `entityMap` of
  * a `ComposedText` object, not for use with `DraftEntity.get()`.
  */
trait RawDraftEntityRange extends js.Object {
  var key: Double
  var length: Double
  var offset: Double
}

object RawDraftEntityRange {
  @scala.inline
  def apply(key: Double, length: Double, offset: Double): RawDraftEntityRange = {
    val __obj = js.Dynamic.literal(key = key, length = length, offset = offset)
  
    __obj.asInstanceOf[RawDraftEntityRange]
  }
}

