package typings.ethersprojectProviders.formatterMod

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.Block
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/formatter", "Formatter")
@js.native
class Formatter () extends js.Object {
  
  def _block(value: js.Any, format: js.Any): Block = js.native
  
  def address(value: js.Any): String = js.native
  
  def bigNumber(value: js.Any): BigNumber = js.native
  
  def block(value: js.Any): Block = js.native
  
  def blockTag(blockTag: js.Any): String = js.native
  
  def blockWithTransactions(value: js.Any): Block = js.native
  
  def boolean(value: js.Any): Boolean = js.native
  
  def callAddress(value: js.Any): String = js.native
  
  def contractAddress(value: js.Any): String = js.native
  
  def data(value: js.Any): String = js.native
  def data(value: js.Any, strict: Boolean): String = js.native
  
  def difficulty(value: js.Any): Double = js.native
  
  def filter(value: js.Any): js.Any = js.native
  
  def filterLog(value: js.Any): js.Any = js.native
  
  val formats: Formats = js.native
  
  def getDefaultFormats(): Formats = js.native
  
  def hash(value: js.Any): String = js.native
  def hash(value: js.Any, strict: Boolean): String = js.native
  
  def hex(value: js.Any): String = js.native
  def hex(value: js.Any, strict: Boolean): String = js.native
  
  def number(number: js.Any): Double = js.native
  
  def receipt(value: js.Any): TransactionReceipt = js.native
  
  def receiptLog(value: js.Any): js.Any = js.native
  
  def topics(value: js.Any): js.Any = js.native
  
  def transaction(value: js.Any): js.Any = js.native
  
  def transactionRequest(value: js.Any): js.Any = js.native
  
  def transactionResponse(transaction: js.Any): TransactionResponse = js.native
  
  def uint256(value: js.Any): String = js.native
}
/* static members */
@JSImport("@ethersproject/providers/lib/formatter", "Formatter")
@js.native
object Formatter extends js.Object {
  
  def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = js.native
  
  def allowNull(format: FormatFunc): FormatFunc = js.native
  def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = js.native
  
  def arrayOf(format: FormatFunc): FormatFunc = js.native
  
  def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = js.native
}
