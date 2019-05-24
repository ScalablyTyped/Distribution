package typings
package eggDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldNameSize extends js.Object {
  var fieldNameSize: js.UndefOr[scala.Double] = js.undefined
  var fieldSize: js.UndefOr[scala.Double] = js.undefined
  var fields: js.UndefOr[scala.Double] = js.undefined
  var fileSize: js.UndefOr[scala.Double] = js.undefined
  var files: js.UndefOr[scala.Double] = js.undefined
  var headerPairs: js.UndefOr[scala.Double] = js.undefined
  var parts: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FieldNameSize {
  @scala.inline
  def apply(
    fieldNameSize: scala.Int | scala.Double = null,
    fieldSize: scala.Int | scala.Double = null,
    fields: scala.Int | scala.Double = null,
    fileSize: scala.Int | scala.Double = null,
    files: scala.Int | scala.Double = null,
    headerPairs: scala.Int | scala.Double = null,
    parts: scala.Int | scala.Double = null
  ): Anon_FieldNameSize = {
    val __obj = js.Dynamic.literal()
    if (fieldNameSize != null) __obj.updateDynamic("fieldNameSize")(fieldNameSize.asInstanceOf[js.Any])
    if (fieldSize != null) __obj.updateDynamic("fieldSize")(fieldSize.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (headerPairs != null) __obj.updateDynamic("headerPairs")(headerPairs.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldNameSize]
  }
}

