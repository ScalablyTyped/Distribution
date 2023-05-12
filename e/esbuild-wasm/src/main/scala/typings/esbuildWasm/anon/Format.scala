package typings.esbuildWasm.anon

import typings.esbuildWasm.esbuildWasmStrings.cjs
import typings.esbuildWasm.esbuildWasmStrings.esm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var bytes: Double
  
  var format: js.UndefOr[cjs | esm] = js.undefined
  
  var imports: js.Array[Original]
}
object Format {
  
  inline def apply(bytes: Double, imports: js.Array[Original]): Format = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: cjs | esm): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setImports(value: js.Array[Original]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Original*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
