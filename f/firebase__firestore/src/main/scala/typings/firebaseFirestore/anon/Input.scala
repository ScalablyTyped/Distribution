package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  def external(id: Any): Boolean
  
  var input: String
  
  var onwarn: Unit
  
  var output: File
  
  var plugins: js.Array[Any]
  
  var treeshake: ModuleSideEffects
}
object Input {
  
  inline def apply(
    external: Any => Boolean,
    input: String,
    onwarn: Unit,
    output: File,
    plugins: js.Array[Any],
    treeshake: ModuleSideEffects
  ): Input = {
    val __obj = js.Dynamic.literal(external = js.Any.fromFunction1(external), input = input.asInstanceOf[js.Any], onwarn = onwarn.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], treeshake = treeshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setExternal(value: Any => Boolean): Self = StObject.set(x, "external", js.Any.fromFunction1(value))
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOnwarn(value: Unit): Self = StObject.set(x, "onwarn", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: File): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setTreeshake(value: ModuleSideEffects): Self = StObject.set(x, "treeshake", value.asInstanceOf[js.Any])
  }
}
