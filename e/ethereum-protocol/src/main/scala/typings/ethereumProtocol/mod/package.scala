package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlockParam = BlockParamLiteral | Double

type ContractAbi = js.Array[AbiDefinition]

type ContractEventArg = String | default | Double | Boolean

type DecodedLogArgs = StringDictionary[ContractEventArg]

type JSONRPCErrorCallback = js.Function2[
/* err */ js.Error | Null, 
/* result */ js.UndefOr[JSONRPCResponsePayload], 
scala.Unit]

type LogTopic = Null | String | js.Array[String]

type LogWithDecodedArgs[ArgsType /* <: DecodedLogArgs */] = DecodedLogEntry[ArgsType]

type RawLog = LogEntry
