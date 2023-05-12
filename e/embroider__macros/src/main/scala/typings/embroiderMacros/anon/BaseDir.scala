package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDir extends StObject {
  
  def baseDir(): String
  
  var name: String
  
  def plugin(env: Filename): Name
}
object BaseDir {
  
  inline def apply(baseDir: () => String, name: String, plugin: Filename => Name): BaseDir = {
    val __obj = js.Dynamic.literal(baseDir = js.Any.fromFunction0(baseDir), name = name.asInstanceOf[js.Any], plugin = js.Any.fromFunction1(plugin))
    __obj.asInstanceOf[BaseDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDir] (val x: Self) extends AnyVal {
    
    inline def setBaseDir(value: () => String): Self = StObject.set(x, "baseDir", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: Filename => Name): Self = StObject.set(x, "plugin", js.Any.fromFunction1(value))
  }
}
