package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs

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
  var key: scala.Double
  var length: scala.Double
  var offset: scala.Double
}

object RawDraftEntityRange {
  @scala.inline
  def apply(key: scala.Double, length: scala.Double, offset: scala.Double): RawDraftEntityRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[RawDraftEntityRange]
  }
}

