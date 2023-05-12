package typings.embroiderSharedInternals.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModulePrefix extends StObject {
  
  var modulePrefix: String
  
  var rootDir: String
}
object ModulePrefix {
  
  inline def apply(modulePrefix: String, rootDir: String): ModulePrefix = {
    val __obj = js.Dynamic.literal(modulePrefix = modulePrefix.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulePrefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModulePrefix] (val x: Self) extends AnyVal {
    
    inline def setModulePrefix(value: String): Self = StObject.set(x, "modulePrefix", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
