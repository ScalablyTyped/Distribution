package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureMeta extends AbstractMeta {
  var body: String
}

object ProcedureMeta {
  @scala.inline
  def apply(
    _self: String,
    _ts: Double,
    body: String,
    id: String,
    _attachments: String = null,
    _etag: String = null,
    _rid: String = null
  ): ProcedureMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, body = body, id = id)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[ProcedureMeta]
  }
}

