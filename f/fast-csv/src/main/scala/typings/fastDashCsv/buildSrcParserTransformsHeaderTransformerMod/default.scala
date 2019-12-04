package typings.fastDashCsv.buildSrcParserTransformsHeaderTransformerMod

import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import typings.fastDashCsv.buildSrcParserTypesMod.RowArray
import typings.fastDashCsv.buildSrcParserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/transforms/HeaderTransformer", JSImport.Default)
@js.native
class default protected () extends HeaderTransformer {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override var headers: js.Any = js.native
  /* CompleteClass */
  override var headersLength: js.Any = js.native
  /* CompleteClass */
  override var mapHeaders: js.Any = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override var processRow: js.Any = js.native
  /* CompleteClass */
  override var processedFirstRow: js.Any = js.native
  /* CompleteClass */
  override var receivedHeaders: js.Any = js.native
  /* CompleteClass */
  override var shouldMapRow: js.Any = js.native
  /* CompleteClass */
  override val shouldUseFirstRow: js.Any = js.native
  /* CompleteClass */
  override def transform(row: RowArray, cb: RowValidatorCallback): Unit = js.native
}

