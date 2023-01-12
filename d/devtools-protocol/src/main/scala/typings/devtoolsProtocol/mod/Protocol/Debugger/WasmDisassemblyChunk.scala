package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WasmDisassemblyChunk extends StObject {
  
  /**
    * The bytecode offsets describing the start of each line.
    */
  var bytecodeOffsets: js.Array[integer]
  
  /**
    * The next chunk of disassembled lines.
    */
  var lines: js.Array[String]
}
object WasmDisassemblyChunk {
  
  inline def apply(bytecodeOffsets: js.Array[integer], lines: js.Array[String]): WasmDisassemblyChunk = {
    val __obj = js.Dynamic.literal(bytecodeOffsets = bytecodeOffsets.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[WasmDisassemblyChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WasmDisassemblyChunk] (val x: Self) extends AnyVal {
    
    inline def setBytecodeOffsets(value: js.Array[integer]): Self = StObject.set(x, "bytecodeOffsets", value.asInstanceOf[js.Any])
    
    inline def setBytecodeOffsetsVarargs(value: integer*): Self = StObject.set(x, "bytecodeOffsets", js.Array(value*))
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
