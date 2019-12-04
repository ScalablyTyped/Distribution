package typings.fastDashCsv.buildSrcParserParserScannerMod

import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScannerArgs extends js.Object {
  var cursor: js.UndefOr[Double] = js.undefined
  var hasMoreData: Boolean
  var line: String
  var parserOptions: ParserOptions
}

object ScannerArgs {
  @scala.inline
  def apply(hasMoreData: Boolean, line: String, parserOptions: ParserOptions, cursor: Int | Double = null): ScannerArgs = {
    val __obj = js.Dynamic.literal(hasMoreData = hasMoreData.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerArgs]
  }
}

