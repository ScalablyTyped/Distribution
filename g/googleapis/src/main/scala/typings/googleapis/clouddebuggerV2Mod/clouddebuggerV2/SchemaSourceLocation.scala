package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceLocation extends StObject {
  
  /**
    * Column within a line. The first column in a line as the value `1`. Agents that do not support setting breakpoints on specific columns ignore this field.
    */
  var column: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Line inside the file. The first line in the file has the value `1`.
    */
  var line: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Path to the source file within the source context of the target binary.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceLocation {
  
  inline def apply(): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceLocation]
  }
  
  extension [Self <: SchemaSourceLocation](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
