package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureMeta extends AbstractMeta {
  var body: java.lang.String
}

object ProcedureMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: scala.Double,
    body: java.lang.String,
    id: java.lang.String,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null
  ): ProcedureMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, body = body, id = id)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[ProcedureMeta]
  }
}

