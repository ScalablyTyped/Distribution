package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.documentdb.documentdbMod.UniqueId because Already inherited
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
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissionMode = permissionMode.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_etag != null) __obj.updateDynamic("_etag")(_etag.asInstanceOf[js.Any])
    if (_rid != null) __obj.updateDynamic("_rid")(_rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionMeta]
  }
}

