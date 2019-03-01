package typings
package ethereumDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ethereumDashProtocolMod {
  type BlockParam = BlockParamLiteral | scala.Double
  type ContractAbi = js.Array[AbiDefinition]
  type ContractEventArg = java.lang.String | bignumberDotJsLib.bignumberDotJsMod.default | scala.Double | scala.Boolean
  type JSONRPCErrorCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* result */ js.UndefOr[JSONRPCResponsePayload], 
    scala.Unit
  ]
  type LogTopic = scala.Null | java.lang.String | js.Array[java.lang.String]
  type LogWithDecodedArgs[ArgsType /* <: DecodedLogArgs */] = DecodedLogEntry[ArgsType]
  type RawLog = LogEntry
}
