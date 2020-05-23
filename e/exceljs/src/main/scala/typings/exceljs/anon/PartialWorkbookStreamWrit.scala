package typings.exceljs.anon

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.WorkbookStreamWriterOptions> */
trait PartialWorkbookStreamWrit extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var stream: js.UndefOr[Stream] = js.undefined
  var useSharedStrings: js.UndefOr[Boolean] = js.undefined
  var useStyles: js.UndefOr[Boolean] = js.undefined
  var zip: js.UndefOr[PartialArchiverZipOptions] = js.undefined
}

object PartialWorkbookStreamWrit {
  @scala.inline
  def apply(
    filename: String = null,
    stream: Stream = null,
    useSharedStrings: js.UndefOr[Boolean] = js.undefined,
    useStyles: js.UndefOr[Boolean] = js.undefined,
    zip: PartialArchiverZipOptions = null
  ): PartialWorkbookStreamWrit = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(useSharedStrings)) __obj.updateDynamic("useSharedStrings")(useSharedStrings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useStyles)) __obj.updateDynamic("useStyles")(useStyles.get.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWorkbookStreamWrit]
  }
}

