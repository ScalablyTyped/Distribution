package typings.golangWasm

import org.scalablytyped.runtime.StringDictionary
import typings.std.DataView
import typings.std.WebAssembly.Imports
import typings.std.WebAssembly.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Go extends StObject {
  
  var argv: js.Array[String]
  
  var env: StringDictionary[String]
  
  def exit(code: Double): Unit
  
  var exited: Boolean
  
  var importObject: Imports
  
  var mem: DataView
  
  def run(instance: Instance): js.Promise[Unit]
}
object Go {
  
  inline def apply(
    argv: js.Array[String],
    env: StringDictionary[String],
    exit: Double => Unit,
    exited: Boolean,
    importObject: Imports,
    mem: DataView,
    run: Instance => js.Promise[Unit]
  ): Go = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], exit = js.Any.fromFunction1(exit), exited = exited.asInstanceOf[js.Any], importObject = importObject.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Go]
  }
  
  extension [Self <: Go](x: Self) {
    
    inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Double => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    inline def setExited(value: Boolean): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    inline def setImportObject(value: Imports): Self = StObject.set(x, "importObject", value.asInstanceOf[js.Any])
    
    inline def setMem(value: DataView): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setRun(value: Instance => js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
