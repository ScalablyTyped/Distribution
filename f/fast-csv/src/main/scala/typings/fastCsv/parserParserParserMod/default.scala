package typings.fastCsv.parserParserParserMod

import typings.fastCsv.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/Parser", JSImport.Default)
@js.native
class default protected () extends Parser {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override var parseRow: js.Any = js.native
  /* CompleteClass */
  override var parseWithComments: js.Any = js.native
  /* CompleteClass */
  override var parseWithoutComments: js.Any = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override val rowParser: js.Any = js.native
  /* CompleteClass */
  override def parse(line: String, hasMoreData: Boolean): ParseResult = js.native
}

/* static members */
@JSImport("fast-csv/build/src/parser/parser/Parser", JSImport.Default)
@js.native
object default extends js.Object {
  var removeBOM: js.Any = js.native
}

