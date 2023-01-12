package typings.esbuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bytes extends StObject {
  
  var bytes: Double
  
  var imports: js.Array[Kind]
}
object Bytes {
  
  inline def apply(bytes: Double, imports: js.Array[Kind]): Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bytes] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[Kind]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Kind*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
