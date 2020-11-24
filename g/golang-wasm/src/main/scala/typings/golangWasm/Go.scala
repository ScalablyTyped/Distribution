package typings.golangWasm

import org.scalablytyped.runtime.StringDictionary
import typings.std.DataView
import typings.std.WebAssembly.Imports
import typings.std.WebAssembly.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Go extends js.Object {
  
  var argv: js.Array[String] = js.native
  
  var env: StringDictionary[String] = js.native
  
  def exit(code: Double): Unit = js.native
  
  var exited: Boolean = js.native
  
  var importObject: Imports = js.native
  
  var mem: DataView = js.native
  
  def run(instance: Instance): js.Promise[Unit] = js.native
}
object Go {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GoOps[Self <: Go] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Double => Unit): Self = this.set("exit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExited(value: Boolean): Self = this.set("exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportObject(value: Imports): Self = this.set("importObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem(value: DataView): Self = this.set("mem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: Instance => js.Promise[Unit]): Self = this.set("run", js.Any.fromFunction1(value))
  }
}
