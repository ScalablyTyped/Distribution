package typings.esbuildWasm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesInOutput extends StObject {
  
  var bytesInOutput: Double
}
object BytesInOutput {
  
  inline def apply(bytesInOutput: Double): BytesInOutput = {
    val __obj = js.Dynamic.literal(bytesInOutput = bytesInOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesInOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BytesInOutput] (val x: Self) extends AnyVal {
    
    inline def setBytesInOutput(value: Double): Self = StObject.set(x, "bytesInOutput", value.asInstanceOf[js.Any])
  }
}
