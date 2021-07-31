package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates a location in the source code of the service for which errors are
  * reported. `functionName` must be provided by the application when reporting
  * an error, unless the error report contains a `message` with a supported
  * exception stack trace. All fields are optional for the later case.
  */
trait SchemaSourceLocation extends StObject {
  
  /**
    * The source code filename, which can include a truncated relative path, or
    * a full path from a production machine.
    */
  var filePath: js.UndefOr[String] = js.undefined
  
  /**
    * Human-readable name of a function or method. The value can include
    * optional context like the class or package name. For example,
    * `my.package.MyClass.method` in case of Java.
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * 1-based. 0 indicates that the line number is unknown.
    */
  var lineNumber: js.UndefOr[Double] = js.undefined
}
object SchemaSourceLocation {
  
  @scala.inline
  def apply(): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceLocation]
  }
  
  @scala.inline
  implicit class SchemaSourceLocationMutableBuilder[Self <: SchemaSourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
