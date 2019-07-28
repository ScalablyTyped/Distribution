package typings.ethereumDashProtocol

import org.scalablytyped.runtime.StringDictionary
import typings.bignumberDotJs.bignumberDotJsMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ethereumDashProtocolMod {
  type BlockParam = BlockParamLiteral | Double
  type ContractAbi = js.Array[AbiDefinition]
  type ContractEventArg = String | default | Double | Boolean
  type DecodedLogArgs = StringDictionary[ContractEventArg]
  type JSONRPCErrorCallback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[JSONRPCResponsePayload], scala.Unit]
  type LogTopic = Null | String | js.Array[String]
  type LogWithDecodedArgs[ArgsType /* <: DecodedLogArgs */] = DecodedLogEntry[ArgsType]
  type RawLog = LogEntry
}
