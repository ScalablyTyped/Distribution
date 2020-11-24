package typings.fastCsvParse.scannerMod

import typings.fastCsvParse.tokenMod.MaybeToken
import typings.fastCsvParse.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser/Scanner", "Scanner")
@js.native
class Scanner protected () extends js.Object {
  def this(args: ScannerArgs) = this()
  
  def advancePastLine(): Scanner | Null = js.native
  
  def advancePastToken(token: Token): Scanner = js.native
  
  def advanceTo(cursor: Double): Scanner = js.native
  
  def advanceToToken(token: Token): Scanner = js.native
  
  var cursor: Double = js.native
  
  def hasMoreCharacters: Boolean = js.native
  
  val hasMoreData: Boolean = js.native
  
  var line: String = js.native
  
  def lineFromCursor: String = js.native
  
  var lineLength: Double = js.native
  
  def nextCharacterToken: MaybeToken = js.native
  
  def nextNonSpaceToken: MaybeToken = js.native
  
  val parserOptions: js.Any = js.native
  
  def truncateToCursor(): Scanner = js.native
}
