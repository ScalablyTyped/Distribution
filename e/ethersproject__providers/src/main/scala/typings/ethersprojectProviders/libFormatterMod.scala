package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.Block
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectTransactions.mod.AccessList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterMod {
  
  @JSImport("@ethersproject/providers/lib/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/providers/lib/formatter", "Formatter")
  @js.native
  open class Formatter () extends StObject {
    
    def _block(value: Any, format: Any): Block = js.native
    
    def accessList(accessList: js.Array[Any]): AccessList = js.native
    
    def address(value: Any): String = js.native
    
    def bigNumber(value: Any): BigNumber = js.native
    
    def block(value: Any): Block = js.native
    
    def blockTag(blockTag: Any): String = js.native
    
    def blockWithTransactions(value: Any): Block = js.native
    
    def boolean(value: Any): Boolean = js.native
    
    def callAddress(value: Any): String = js.native
    
    def contractAddress(value: Any): String = js.native
    
    def data(value: Any): String = js.native
    def data(value: Any, strict: Boolean): String = js.native
    
    def difficulty(value: Any): Double = js.native
    
    def filter(value: Any): Any = js.native
    
    def filterLog(value: Any): Any = js.native
    
    val formats: Formats = js.native
    
    def getDefaultFormats(): Formats = js.native
    
    def hash(value: Any): String = js.native
    def hash(value: Any, strict: Boolean): String = js.native
    
    def hex(value: Any): String = js.native
    def hex(value: Any, strict: Boolean): String = js.native
    
    def number(number: Any): Double = js.native
    
    def receipt(value: Any): TransactionReceipt = js.native
    
    def receiptLog(value: Any): Any = js.native
    
    def topics(value: Any): Any = js.native
    
    def transaction(value: Any): Any = js.native
    
    def transactionRequest(value: Any): Any = js.native
    
    def transactionResponse(transaction: Any): TransactionResponse = js.native
    
    def `type`(number: Any): Double = js.native
    
    def uint256(value: Any): String = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allowFalsish(format: FormatFunc, replaceValue: Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowFalsish")(format.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    inline def allowNull(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    inline def allowNull(format: FormatFunc, nullValue: Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    inline def arrayOf(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    inline def check(format: StringDictionary[FormatFunc], `object`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(format.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def isCommunityResourcable(value: Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResourcable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean]
  
  inline def isCommunityResource(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResource")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def showThrottleMessage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")().asInstanceOf[Unit]
  
  trait CommunityResourcable extends StObject {
    
    def isCommunityResource(): Boolean
  }
  object CommunityResourcable {
    
    inline def apply(isCommunityResource: () => Boolean): CommunityResourcable = {
      val __obj = js.Dynamic.literal(isCommunityResource = js.Any.fromFunction0(isCommunityResource))
      __obj.asInstanceOf[CommunityResourcable]
    }
    
    extension [Self <: CommunityResourcable](x: Self) {
      
      inline def setIsCommunityResource(value: () => Boolean): Self = StObject.set(x, "isCommunityResource", js.Any.fromFunction0(value))
    }
  }
  
  type FormatFunc = js.Function1[/* value */ Any, Any]
  
  type FormatFuncs = StringDictionary[FormatFunc]
  
  trait Formats extends StObject {
    
    var block: FormatFuncs
    
    var blockWithTransactions: FormatFuncs
    
    var filter: FormatFuncs
    
    var filterLog: FormatFuncs
    
    var receipt: FormatFuncs
    
    var receiptLog: FormatFuncs
    
    var transaction: FormatFuncs
    
    var transactionRequest: FormatFuncs
  }
  object Formats {
    
    inline def apply(
      block: FormatFuncs,
      blockWithTransactions: FormatFuncs,
      filter: FormatFuncs,
      filterLog: FormatFuncs,
      receipt: FormatFuncs,
      receiptLog: FormatFuncs,
      transaction: FormatFuncs,
      transactionRequest: FormatFuncs
    ): Formats = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockWithTransactions = blockWithTransactions.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterLog = filterLog.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any], receiptLog = receiptLog.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], transactionRequest = transactionRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formats]
    }
    
    extension [Self <: Formats](x: Self) {
      
      inline def setBlock(value: FormatFuncs): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockWithTransactions(value: FormatFuncs): Self = StObject.set(x, "blockWithTransactions", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: FormatFuncs): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterLog(value: FormatFuncs): Self = StObject.set(x, "filterLog", value.asInstanceOf[js.Any])
      
      inline def setReceipt(value: FormatFuncs): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
      
      inline def setReceiptLog(value: FormatFuncs): Self = StObject.set(x, "receiptLog", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: FormatFuncs): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionRequest(value: FormatFuncs): Self = StObject.set(x, "transactionRequest", value.asInstanceOf[js.Any])
    }
  }
}
