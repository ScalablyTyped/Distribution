package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessInfo extends StObject {
  
  /** Arguments to pass to the process */
  var arguments: js.Array[String]
  
  /** Name of the file to execute */
  var filename: String
  
  /** Path of the file (relative to the Flashpoint root) */
  var path: String
}
object ProcessInfo {
  
  inline def apply(arguments: js.Array[String], filename: String, path: String): ProcessInfo = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
  
  extension [Self <: ProcessInfo](x: Self) {
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
