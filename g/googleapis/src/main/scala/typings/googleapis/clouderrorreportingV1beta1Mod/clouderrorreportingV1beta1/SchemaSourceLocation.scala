package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceLocation extends StObject {
  
  /**
    * The source code filename, which can include a truncated relative path, or a full path from a production machine.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable name of a function or method. The value can include optional context like the class or package name. For example, `my.package.MyClass.method` in case of Java.
    */
  var functionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 1-based. 0 indicates that the line number is unknown.
    */
  var lineNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSourceLocation {
  
  inline def apply(): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceLocation]
  }
  
  extension [Self <: SchemaSourceLocation](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameNull: Self = StObject.set(x, "functionName", null)
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
