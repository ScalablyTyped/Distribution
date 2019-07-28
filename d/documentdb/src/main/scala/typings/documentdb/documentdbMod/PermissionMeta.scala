package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.documentdb.documentdbMod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ trait PermissionMeta extends Permission {
  var _attachments: js.UndefOr[String] = js.undefined
  var _etag: js.UndefOr[String] = js.undefined
  var _rid: js.UndefOr[String] = js.undefined
  /** The self link. */
  var _self: String
  /** The time the object was created. */
  var _ts: Double
}

object PermissionMeta {
  @scala.inline
  def apply(
    _self: String,
    _ts: Double,
    id: String,
    permissionMode: PermissionMode,
    resource: String,
    _attachments: String = null,
    _etag: String = null,
    _rid: String = null
  ): PermissionMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, id = id, permissionMode = permissionMode, resource = resource)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[PermissionMeta]
  }
}

