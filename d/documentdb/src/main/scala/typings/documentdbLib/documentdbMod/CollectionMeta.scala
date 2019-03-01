package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- documentdbLib.documentdbMod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ trait CollectionMeta extends Collection {
  var _attachments: js.UndefOr[java.lang.String] = js.undefined
  var _etag: js.UndefOr[java.lang.String] = js.undefined
  var _rid: js.UndefOr[java.lang.String] = js.undefined
  /** The self link. */
  var _self: java.lang.String
  /** The time the object was created. */
  var _ts: scala.Double
}

object CollectionMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: scala.Double,
    id: java.lang.String,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null,
    defaultTtl: scala.Int | scala.Double = null,
    indexingPolicy: IndexingPolicy = null,
    partitionKey: CollectionPartitionKey = null
  ): CollectionMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_self")(_self)
    __obj.updateDynamic("_ts")(_ts)
    __obj.updateDynamic("id")(id)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (indexingPolicy != null) __obj.updateDynamic("indexingPolicy")(indexingPolicy)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey)
    __obj.asInstanceOf[CollectionMeta]
  }
}

