package typings.esbuildWasm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var name: String
  
  def setup(build: PluginBuild): Unit | js.Promise[Unit]
}
object Plugin {
  
  inline def apply(name: String, setup: PluginBuild => Unit | js.Promise[Unit]): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], setup = js.Any.fromFunction1(setup))
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetup(value: PluginBuild => Unit | js.Promise[Unit]): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
  }
}
