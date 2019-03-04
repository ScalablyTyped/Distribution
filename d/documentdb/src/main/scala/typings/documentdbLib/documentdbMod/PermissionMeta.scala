package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- documentdbLib.documentdbMod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ trait PermissionMeta extends Permission {
  var _attachments: js.UndefOr[java.lang.String] = js.undefined
  var _etag: js.UndefOr[java.lang.String] = js.undefined
  var _rid: js.UndefOr[java.lang.String] = js.undefined
  /** The self link. */
  var _self: java.lang.String
  /** The time the object was created. */
  var _ts: scala.Double
}

object PermissionMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: scala.Double,
    id: java.lang.String,
    permissionMode: PermissionMode,
    resource: java.lang.String,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null
  ): PermissionMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, id = id, permissionMode = permissionMode, resource = resource)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[PermissionMeta]
  }
}

