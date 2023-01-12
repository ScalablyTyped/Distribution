package typings.firebaseFirestore.anon

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait External extends StObject {
  
  def external(id: Any): Boolean
  
  var input: String
  
  def onwarn(warning: Any, defaultWarn: Any): Unit
  
  var output: File
  
  var plugins: js.Array[Plugin]
  
  var treeshake: ModuleSideEffects
}
object External {
  
  inline def apply(
    external: Any => Boolean,
    input: String,
    onwarn: (Any, Any) => Unit,
    output: File,
    plugins: js.Array[Plugin],
    treeshake: ModuleSideEffects
  ): External = {
    val __obj = js.Dynamic.literal(external = js.Any.fromFunction1(external), input = input.asInstanceOf[js.Any], onwarn = js.Any.fromFunction2(onwarn), output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], treeshake = treeshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
    
    inline def setExternal(value: Any => Boolean): Self = StObject.set(x, "external", js.Any.fromFunction1(value))
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOnwarn(value: (Any, Any) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
    
    inline def setOutput(value: File): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setTreeshake(value: ModuleSideEffects): Self = StObject.set(x, "treeshake", value.asInstanceOf[js.Any])
  }
}
