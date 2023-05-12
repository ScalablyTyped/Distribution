package typings.esbuildWasm.anon

import typings.esbuildWasm.esbuildWasmStrings.cjs
import typings.esbuildWasm.esbuildWasmStrings.esm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bytes extends StObject {
  
  var bytes: Double
  
  var format: js.UndefOr[cjs | esm] = js.undefined
  
  var imports: js.Array[External]
}
object Bytes {
  
  inline def apply(bytes: Double, imports: js.Array[External]): Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bytes] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: cjs | esm): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setImports(value: js.Array[External]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: External*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
