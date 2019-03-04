package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractMeta extends UniqueId {
  var _attachments: js.UndefOr[java.lang.String] = js.undefined
  var _etag: js.UndefOr[java.lang.String] = js.undefined
  var _rid: js.UndefOr[java.lang.String] = js.undefined
  /** The self link. */
  var _self: java.lang.String
  /** The time the object was created. */
  var _ts: scala.Double
}

object AbstractMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: scala.Double,
    id: java.lang.String,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null
  ): AbstractMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, id = id)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[AbstractMeta]
  }
}

