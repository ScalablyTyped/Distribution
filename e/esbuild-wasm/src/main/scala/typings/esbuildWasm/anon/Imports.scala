package typings.esbuildWasm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imports extends StObject {
  
  var bytes: Double
  
  var imports: js.Array[Path]
}
object Imports {
  
  inline def apply(bytes: Double, imports: js.Array[Path]): Imports = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imports]
  }
  
  extension [Self <: Imports](x: Self) {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[Path]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Path*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
