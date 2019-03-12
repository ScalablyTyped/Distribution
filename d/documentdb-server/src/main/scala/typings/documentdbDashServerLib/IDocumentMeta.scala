package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentMeta
  extends stdLib.Object {
  var _attachments: js.UndefOr[java.lang.String] = js.undefined
  var _etag: js.UndefOr[java.lang.String] = js.undefined
  var _rid: js.UndefOr[java.lang.String] = js.undefined
  var _self: java.lang.String
  var _ts: java.lang.String
  var id: java.lang.String
}

object IDocumentMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null
  ): IDocumentMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[IDocumentMeta]
  }
}

