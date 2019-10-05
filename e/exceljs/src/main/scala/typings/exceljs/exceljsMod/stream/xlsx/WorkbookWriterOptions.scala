package typings.exceljs.exceljsMod.stream.xlsx

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWriterOptions extends js.Object {
  /**
  			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
  			 */
  var filename: js.UndefOr[String] = js.undefined
  /**
  			 * Specifies a writable stream to write the XLSX workbook to.
  			 */
  var stream: js.UndefOr[Stream] = js.undefined
  /**
  			 * 	Specifies whether to use shared strings in the workbook. Default is false
  			 */
  var useSharedStrings: js.UndefOr[Boolean] = js.undefined
  /**
  			 * Specifies whether to add style information to the workbook.
  			 * Styles can add some performance overhead. Default is false
  			 */
  var useStyles: js.UndefOr[Boolean] = js.undefined
}

object WorkbookWriterOptions {
  @scala.inline
  def apply(
    filename: String = null,
    stream: Stream = null,
    useSharedStrings: js.UndefOr[Boolean] = js.undefined,
    useStyles: js.UndefOr[Boolean] = js.undefined
  ): WorkbookWriterOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(useSharedStrings)) __obj.updateDynamic("useSharedStrings")(useSharedStrings)
    if (!js.isUndefined(useStyles)) __obj.updateDynamic("useStyles")(useStyles)
    __obj.asInstanceOf[WorkbookWriterOptions]
  }
}

