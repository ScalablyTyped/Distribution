package typings.fastDashCsv.buildSrcParserTransformsHeaderTransformerMod

import typings.fastDashCsv.buildSrcParserTypesMod.RowArray
import typings.fastDashCsv.buildSrcParserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTransformer extends js.Object {
  var headers: js.Any
  var headersLength: js.Any
  var mapHeaders: js.Any
  val parserOptions: js.Any
  var processRow: js.Any
  var processedFirstRow: js.Any
  var receivedHeaders: js.Any
  var shouldMapRow: js.Any
  val shouldUseFirstRow: js.Any
  def transform(row: RowArray, cb: RowValidatorCallback): Unit
}

object HeaderTransformer {
  @scala.inline
  def apply(
    headers: js.Any,
    headersLength: js.Any,
    mapHeaders: js.Any,
    parserOptions: js.Any,
    processRow: js.Any,
    processedFirstRow: js.Any,
    receivedHeaders: js.Any,
    shouldMapRow: js.Any,
    shouldUseFirstRow: js.Any,
    transform: (RowArray, RowValidatorCallback) => Unit
  ): HeaderTransformer = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], headersLength = headersLength.asInstanceOf[js.Any], mapHeaders = mapHeaders.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], processRow = processRow.asInstanceOf[js.Any], processedFirstRow = processedFirstRow.asInstanceOf[js.Any], receivedHeaders = receivedHeaders.asInstanceOf[js.Any], shouldMapRow = shouldMapRow.asInstanceOf[js.Any], shouldUseFirstRow = shouldUseFirstRow.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
  
    __obj.asInstanceOf[HeaderTransformer]
  }
}

