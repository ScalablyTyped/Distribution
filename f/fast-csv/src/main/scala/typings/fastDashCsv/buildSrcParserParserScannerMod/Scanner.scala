package typings.fastDashCsv.buildSrcParserParserScannerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/Scanner", "Scanner")
@js.native
class Scanner protected () extends js.Object {
  def this(args: ScannerArgs) = this()
  var cursor: Double = js.native
  val hasMoreCharacters: Boolean = js.native
  val hasMoreData: Boolean = js.native
  var line: String = js.native
  val lineFromCursor: String = js.native
  var lineLength: Double = js.native
  val nextCharacterToken: MaybeToken = js.native
  val nextNonSpaceToken: MaybeToken = js.native
  val parserOptions: js.Any = js.native
  def advancePastLine(): Scanner | Null = js.native
  def advancePastToken(token: Token): Scanner = js.native
  def advanceTo(cursor: Double): Scanner = js.native
  def advanceToToken(token: Token): Scanner = js.native
  def truncateToCursor(): Scanner = js.native
}

