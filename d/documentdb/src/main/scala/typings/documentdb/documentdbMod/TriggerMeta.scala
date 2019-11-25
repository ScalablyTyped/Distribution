package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerMeta extends AbstractMeta {
  var body: String
  var triggerOperation: String
  var triggerType: String
}

object TriggerMeta {
  @scala.inline
  def apply(
    _self: String,
    _ts: Double,
    body: String,
    id: String,
    triggerOperation: String,
    triggerType: String,
    _attachments: String = null,
    _etag: String = null,
    _rid: String = null
  ): TriggerMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], triggerOperation = triggerOperation.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_etag != null) __obj.updateDynamic("_etag")(_etag.asInstanceOf[js.Any])
    if (_rid != null) __obj.updateDynamic("_rid")(_rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerMeta]
  }
}

