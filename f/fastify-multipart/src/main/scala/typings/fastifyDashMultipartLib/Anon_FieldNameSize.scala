package typings
package fastifyDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldNameSize extends js.Object {
  /**
    * Max field name size in bytes
    */
  var fieldNameSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Max field value size in bytes
    */
  var fieldSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Max number of non-file fields
    */
  var fields: js.UndefOr[scala.Double] = js.undefined
  /**
    * For multipart forms, the max file size
    */
  var fileSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Max number of file fields
    */
  var files: js.UndefOr[scala.Double] = js.undefined
  /**
    * Max number of header key=>value pairs
    */
  var headerPairs: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FieldNameSize {
  @scala.inline
  def apply(
    fieldNameSize: scala.Int | scala.Double = null,
    fieldSize: scala.Int | scala.Double = null,
    fields: scala.Int | scala.Double = null,
    fileSize: scala.Int | scala.Double = null,
    files: scala.Int | scala.Double = null,
    headerPairs: scala.Int | scala.Double = null
  ): Anon_FieldNameSize = {
    val __obj = js.Dynamic.literal()
    if (fieldNameSize != null) __obj.updateDynamic("fieldNameSize")(fieldNameSize.asInstanceOf[js.Any])
    if (fieldSize != null) __obj.updateDynamic("fieldSize")(fieldSize.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (headerPairs != null) __obj.updateDynamic("headerPairs")(headerPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldNameSize]
  }
}

