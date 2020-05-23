package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.documentdb.mod.UniqueId because Already inherited
- typings.documentdb.mod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ trait RetrievedDocument extends NewDocument {
  var _attachments: js.UndefOr[String] = js.undefined
  var _etag: js.UndefOr[String] = js.undefined
  var _rid: js.UndefOr[String] = js.undefined
  /** The self link. */
  var _self: String
  /** The time the object was created. */
  var _ts: Double
}

object RetrievedDocument {
  @scala.inline
  def apply(
    _self: String,
    _ts: Double,
    id: String,
    _attachments: String = null,
    _etag: String = null,
    _rid: String = null,
    ttl: js.UndefOr[Double] = js.undefined
  ): RetrievedDocument = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_etag != null) __obj.updateDynamic("_etag")(_etag.asInstanceOf[js.Any])
    if (_rid != null) __obj.updateDynamic("_rid")(_rid.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievedDocument]
  }
}

