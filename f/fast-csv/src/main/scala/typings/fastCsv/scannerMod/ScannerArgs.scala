package typings.fastCsv.scannerMod

import typings.fastCsv.parserOptionsMod.ParserOptions
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
  def apply(
    hasMoreData: Boolean,
    line: String,
    parserOptions: ParserOptions,
    cursor: js.UndefOr[Double] = js.undefined
  ): ScannerArgs = {
    val __obj = js.Dynamic.literal(hasMoreData = hasMoreData.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerArgs]
  }
}

