package typings
package ethereumDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ethereumDashProtocolMod {
  type AbiDefinition = FunctionAbi | EventAbi
  type BlockParam = BlockParamLiteral | scala.Double
  type ConstructorStateMutability = ethereumDashProtocolLib.ethereumDashProtocolLibStrings.nonpayable | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.payable
  type ContractAbi = js.Array[AbiDefinition]
  type ContractEventArg = java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default | scala.Double | scala.Boolean
  type FunctionAbi = MethodAbi | ConstructorAbi | FallbackAbi
  type JSONRPCErrorCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* result */ js.UndefOr[JSONRPCResponsePayload], 
    scala.Unit
  ]
  type LogTopic = scala.Null | java.lang.String | js.Array[java.lang.String]
  type LogWithDecodedArgs[ArgsType /* <: DecodedLogArgs */] = DecodedLogEntry[ArgsType]
  type RawLog = LogEntry
  type StateMutability = ethereumDashProtocolLib.ethereumDashProtocolLibStrings.pure | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.view | ConstructorStateMutability
  type Unit = ethereumDashProtocolLib.ethereumDashProtocolLibStrings.kwei | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.ada | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.mwei | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.babbage | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.gwei | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.shannon | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.szabo | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.finney | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.ether | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.kether | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.grand | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.einstein | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.mether | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.gether | ethereumDashProtocolLib.ethereumDashProtocolLibStrings.tether
}
