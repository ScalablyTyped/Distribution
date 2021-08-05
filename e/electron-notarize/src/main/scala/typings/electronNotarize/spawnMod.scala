package typings.electronNotarize

import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spawnMod {
  
  @JSImport("electron-notarize/lib/spawn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spawn(cmd: String): js.Promise[SpawnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpawnResult]]
  inline def spawn(cmd: String, args: js.Array[String]): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  inline def spawn(cmd: String, args: js.Array[String], opts: SpawnOptions): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  inline def spawn(cmd: String, args: Unit, opts: SpawnOptions): js.Promise[SpawnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SpawnResult]]
  
  trait SpawnResult extends StObject {
    
    var code: Double | Null
    
    var output: String
  }
  object SpawnResult {
    
    inline def apply(output: String): SpawnResult = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], code = null)
      __obj.asInstanceOf[SpawnResult]
    }
    
    extension [Self <: SpawnResult](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
