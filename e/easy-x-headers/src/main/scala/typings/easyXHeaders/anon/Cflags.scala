package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cflags extends StObject {
  
  var cflags: js.Array[Any]
  
  var default_configuration: String
  
  var defines: js.Array[String]
  
  var include_dirs: js.Array[String]
  
  var libraries: js.Array[String]
}
object Cflags {
  
  inline def apply(
    cflags: js.Array[Any],
    default_configuration: String,
    defines: js.Array[String],
    include_dirs: js.Array[String],
    libraries: js.Array[String]
  ): Cflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cflags]
  }
  
  extension [Self <: Cflags](x: Self) {
    
    inline def setCflags(value: js.Array[Any]): Self = StObject.set(x, "cflags", value.asInstanceOf[js.Any])
    
    inline def setCflagsVarargs(value: Any*): Self = StObject.set(x, "cflags", js.Array(value*))
    
    inline def setDefault_configuration(value: String): Self = StObject.set(x, "default_configuration", value.asInstanceOf[js.Any])
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
    
    inline def setInclude_dirs(value: js.Array[String]): Self = StObject.set(x, "include_dirs", value.asInstanceOf[js.Any])
    
    inline def setInclude_dirsVarargs(value: String*): Self = StObject.set(x, "include_dirs", js.Array(value*))
    
    inline def setLibraries(value: js.Array[String]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    inline def setLibrariesVarargs(value: String*): Self = StObject.set(x, "libraries", js.Array(value*))
  }
}
