package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassembleWasmModuleResponse extends StObject {
  
  /**
    * The first chunk of disassembly.
    */
  var chunk: WasmDisassemblyChunk
  
  /**
    * The offsets of all function bodies, in the format [start1, end1,
    * start2, end2, ...] where all ends are exclusive.
    */
  var functionBodyOffsets: js.Array[integer]
  
  /**
    * For large modules, return a stream from which additional chunks of
    * disassembly can be read successively.
    */
  var streamId: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of lines in the disassembly text.
    */
  var totalNumberOfLines: integer
}
object DisassembleWasmModuleResponse {
  
  inline def apply(chunk: WasmDisassemblyChunk, functionBodyOffsets: js.Array[integer], totalNumberOfLines: integer): DisassembleWasmModuleResponse = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], functionBodyOffsets = functionBodyOffsets.asInstanceOf[js.Any], totalNumberOfLines = totalNumberOfLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassembleWasmModuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassembleWasmModuleResponse] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: WasmDisassemblyChunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setFunctionBodyOffsets(value: js.Array[integer]): Self = StObject.set(x, "functionBodyOffsets", value.asInstanceOf[js.Any])
    
    inline def setFunctionBodyOffsetsVarargs(value: integer*): Self = StObject.set(x, "functionBodyOffsets", js.Array(value*))
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setTotalNumberOfLines(value: integer): Self = StObject.set(x, "totalNumberOfLines", value.asInstanceOf[js.Any])
  }
}
