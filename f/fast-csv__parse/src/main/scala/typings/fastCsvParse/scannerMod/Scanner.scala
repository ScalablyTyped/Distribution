package typings.fastCsvParse.scannerMod

import typings.fastCsvParse.tokenMod.MaybeToken
import typings.fastCsvParse.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/parser/Scanner", "Scanner")
@js.native
class Scanner protected () extends js.Object {
  def this(args: ScannerArgs) = this()
  var cursor: Double = js.native
  val hasMoreData: Boolean = js.native
  var line: String = js.native
  var lineLength: Double = js.native
  val parserOptions: js.Any = js.native
  def advancePastLine(): Scanner | Null = js.native
  def advancePastToken(token: Token): Scanner = js.native
  def advanceTo(cursor: Double): Scanner = js.native
  def advanceToToken(token: Token): Scanner = js.native
  def hasMoreCharacters: Boolean = js.native
  def lineFromCursor: String = js.native
  def nextCharacterToken: MaybeToken = js.native
  def nextNonSpaceToken: MaybeToken = js.native
  def truncateToCursor(): Scanner = js.native
}

