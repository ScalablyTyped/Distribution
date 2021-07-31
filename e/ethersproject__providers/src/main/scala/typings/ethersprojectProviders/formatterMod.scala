package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.Block
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("@ethersproject/providers/lib/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/providers/lib/formatter", "Formatter")
  @js.native
  class Formatter () extends StObject {
    
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
  object Formatter {
    
    @JSImport("@ethersproject/providers/lib/formatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowFalsish")(format.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    @scala.inline
    def allowNull(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    @scala.inline
    def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    @scala.inline
    def arrayOf(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @scala.inline
    def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(format.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def isCommunityResourcable(value: js.Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResourcable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean]
  
  @scala.inline
  def isCommunityResource(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResource")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def showThrottleMessage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")().asInstanceOf[Unit]
  
  trait CommunityResourcable extends StObject {
    
    def isCommunityResource(): Boolean
  }
  object CommunityResourcable {
    
    @scala.inline
    def apply(isCommunityResource: () => Boolean): CommunityResourcable = {
      val __obj = js.Dynamic.literal(isCommunityResource = js.Any.fromFunction0(isCommunityResource))
      __obj.asInstanceOf[CommunityResourcable]
    }
    
    @scala.inline
    implicit class CommunityResourcableMutableBuilder[Self <: CommunityResourcable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCommunityResource(value: () => Boolean): Self = StObject.set(x, "isCommunityResource", js.Any.fromFunction0(value))
    }
  }
  
  type FormatFunc = js.Function1[/* value */ js.Any, js.Any]
  
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FormatsMutableBuilder[Self <: Formats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: FormatFuncs): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockWithTransactions(value: FormatFuncs): Self = StObject.set(x, "blockWithTransactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: FormatFuncs): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterLog(value: FormatFuncs): Self = StObject.set(x, "filterLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt(value: FormatFuncs): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptLog(value: FormatFuncs): Self = StObject.set(x, "receiptLog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction(value: FormatFuncs): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionRequest(value: FormatFuncs): Self = StObject.set(x, "transactionRequest", value.asInstanceOf[js.Any])
    }
  }
}
