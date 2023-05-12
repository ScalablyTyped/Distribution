package typings.ethers

import typings.ethers.typesProvidersFormattingMod.BlockParams
import typings.ethers.typesProvidersFormattingMod.LogParams
import typings.ethers.typesProvidersFormattingMod.TransactionReceiptParams
import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersFormatMod {
  
  @JSImport("ethers/types/providers/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allowNull(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
  inline def allowNull(format: FormatFunc, nullValue: Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
  
  inline def arrayOf(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
  
  inline def formatBlock(value: Any): BlockParams = ^.asInstanceOf[js.Dynamic].applyDynamic("formatBlock")(value.asInstanceOf[js.Any]).asInstanceOf[BlockParams]
  
  inline def formatBoolean(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("formatBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def formatData(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatData")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatHash(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHash")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatLog(value: Any): LogParams = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLog")(value.asInstanceOf[js.Any]).asInstanceOf[LogParams]
  
  inline def formatReceiptLog(value: Any): LogParams = ^.asInstanceOf[js.Dynamic].applyDynamic("formatReceiptLog")(value.asInstanceOf[js.Any]).asInstanceOf[LogParams]
  
  inline def formatTransactionReceipt(value: Any): TransactionReceiptParams = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTransactionReceipt")(value.asInstanceOf[js.Any]).asInstanceOf[TransactionReceiptParams]
  
  inline def formatTransactionResponse(value: Any): TransactionResponseParams = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTransactionResponse")(value.asInstanceOf[js.Any]).asInstanceOf[TransactionResponseParams]
  
  inline def formatUint256(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUint256")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def `object`(format: Record[String, FormatFunc]): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
  inline def `object`(format: Record[String, FormatFunc], altNames: Record[String, js.Array[String]]): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(format.asInstanceOf[js.Any], altNames.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
  
  type FormatFunc = js.Function1[/* value */ Any, Any]
}
