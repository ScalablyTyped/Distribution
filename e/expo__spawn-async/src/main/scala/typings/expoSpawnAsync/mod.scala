package typings.expoSpawnAsync

import typings.node.childProcessMod.ChildProcess
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(command: String): SpawnPromise[SpawnResult] = ^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any]).asInstanceOf[SpawnPromise[SpawnResult]]
  inline def apply(command: String, args: js.Array[String]): SpawnPromise[SpawnResult] = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SpawnPromise[SpawnResult]]
  inline def apply(command: String, args: js.Array[String], options: SpawnOptions): SpawnPromise[SpawnResult] = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnPromise[SpawnResult]]
  inline def apply(command: String, args: Unit, options: SpawnOptions): SpawnPromise[SpawnResult] = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnPromise[SpawnResult]]
  
  @JSImport("@expo/spawn-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SpawnOptions
    extends StObject
       with typings.node.childProcessMod.SpawnOptions {
    
    var ignoreStdio: js.UndefOr[Boolean] = js.undefined
  }
  object SpawnOptions {
    
    inline def apply(): SpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpawnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpawnOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreStdio(value: Boolean): Self = StObject.set(x, "ignoreStdio", value.asInstanceOf[js.Any])
      
      inline def setIgnoreStdioUndefined: Self = StObject.set(x, "ignoreStdio", js.undefined)
    }
  }
  
  @js.native
  trait SpawnPromise[T]
    extends StObject
       with Promise[T] {
    
    var child: ChildProcess = js.native
  }
  
  trait SpawnResult extends StObject {
    
    var output: js.Array[String]
    
    var pid: js.UndefOr[Double] = js.undefined
    
    var signal: String | Null
    
    var status: Double | Null
    
    var stderr: String
    
    var stdout: String
  }
  object SpawnResult {
    
    inline def apply(output: js.Array[String], stderr: String, stdout: String): SpawnResult = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], signal = null, status = null)
      __obj.asInstanceOf[SpawnResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpawnResult] (val x: Self) extends AnyVal {
      
      inline def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
