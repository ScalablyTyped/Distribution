package typings.ethereumProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockParam = typings.ethereumProtocol.mod.BlockParamLiteral | scala.Double
  
  type ContractAbi = js.Array[typings.ethereumProtocol.mod.AbiDefinition]
  
  type ContractEventArg = java.lang.String | typings.bignumberJs.mod.default | scala.Double | scala.Boolean
  
  type DecodedLogArgs = org.scalablytyped.runtime.StringDictionary[typings.ethereumProtocol.mod.ContractEventArg]
  
  type JSONRPCErrorCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[typings.ethereumProtocol.mod.JSONRPCResponsePayload], 
    scala.Unit
  ]
  
  type LogTopic = scala.Null | java.lang.String | js.Array[java.lang.String]
  
  type LogWithDecodedArgs[ArgsType /* <: typings.ethereumProtocol.mod.DecodedLogArgs */] = typings.ethereumProtocol.mod.DecodedLogEntry[ArgsType]
  
  type RawLog = typings.ethereumProtocol.mod.LogEntry
}
